package ch.heigvd.res.pizza.domain.XBrast;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TomatoTest {

  @Test
  void thePriceAndNameForTomatoShouldBeCorrect() {
    Tomato feature = new Tomato();
    assertEquals(feature.getName(), Tomato.NAME);
    assertEquals(feature.getPrice(), Tomato.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForTomato() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.XBrast.Tomato";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Tomato.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}