package ch.heigvd.res.pizza.domain.Ichimizu;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SatanTest {

  @Test
  void thePriceAndNameForMargheritaShouldBeCorrect() {
    Satan beer = new Satan();
    assertEquals(beer.getName(), Satan.NAME);
    assertEquals(beer.getPrice(), Satan.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Ichimizu.Satan";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Satan.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}