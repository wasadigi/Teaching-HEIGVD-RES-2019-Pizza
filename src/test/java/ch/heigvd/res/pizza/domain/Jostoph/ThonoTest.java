package ch.heigvd.res.pizza.domain.Jostoph;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThonoTest {

  @Test
  void thePriceAndNameForThonoShouldBeCorrect() {
    Thono pizza = new Thono();
    assertEquals(pizza.getName(), Thono.NAME);
    assertEquals(pizza.getPrice(), Thono.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForThono() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Jostoph.Thono";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Thono.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}