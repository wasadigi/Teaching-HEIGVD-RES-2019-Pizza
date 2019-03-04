package ch.heigvd.res.pizza.domain.XBrast;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThonTest {

  @Test
  void thePriceAndNameForThonShouldBeCorrect() {
    Thon feature = new Thon();
    assertEquals(feature.getName(), Thon.NAME);
    assertEquals(feature.getPrice(), Thon.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForThon() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.XBrast.Thon";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Thon.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}