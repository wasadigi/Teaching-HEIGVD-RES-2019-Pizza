package ch.heigvd.res.pizza.domain.goturak;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrexTest {

  @Test
  void thePriceAndNameForTrexShouldBeCorrect() {
    Trex pizza = new Trex();
    assertEquals(pizza.getName(), Trex.NAME);
    assertEquals(pizza.getPrice(), Trex.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForTrex() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.goturak.Trex";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Trex.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}