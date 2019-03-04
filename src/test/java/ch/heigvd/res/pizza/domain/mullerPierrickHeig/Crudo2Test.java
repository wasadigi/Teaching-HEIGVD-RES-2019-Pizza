package ch.heigvd.res.pizza.domain.mullerPierrickHeig;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.mullerPierrickHeig.Crudo2;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Crudo2Test {

  @Test
  void thePriceAndNameForCrudo2ShouldBeCorrect() {
    Crudo2 beer = new Crudo2();
    assertEquals(beer.getName(), Crudo2.NAME);
    assertEquals(beer.getPrice(), Crudo2.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCrudo2() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.mullerPierrickHeig.Crudo2";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Crudo2.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}