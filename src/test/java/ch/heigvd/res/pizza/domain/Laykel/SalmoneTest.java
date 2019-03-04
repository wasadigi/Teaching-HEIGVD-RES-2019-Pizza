package ch.heigvd.res.pizza.domain.Laykel;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalmoneTest {

  @Test
  void thePriceAndNameForSalmoneShouldBeCorrect() {
    Salmone pizza = new Salmone();
    assertEquals(pizza.getName(), Salmone.NAME);
    assertEquals(pizza.getPrice(), Salmone.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForSalmone() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Laykel.Salmone";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Salmone.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}