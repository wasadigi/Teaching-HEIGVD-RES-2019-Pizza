package ch.heigvd.res.pizza.domain.Laykel;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeefTest {

  @Test
  void thePriceAndNameForBeefShouldBeCorrect() {
    Beef pizza = new Beef();
    assertEquals(pizza.getName(), Beef.NAME);
    assertEquals(pizza.getPrice(), Beef.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBeef() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Laykel.Beef";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Beef.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}