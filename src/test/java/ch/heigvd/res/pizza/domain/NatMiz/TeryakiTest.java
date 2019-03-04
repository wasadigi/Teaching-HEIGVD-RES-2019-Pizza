package ch.heigvd.res.pizza.domain.NatMiz;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.NatMiz.Teryaki;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeryakiTest {

  @Test
  void thePriceAndNameForTeryakiShouldBeCorrect() {
    Teryaki beer = new Teryaki();
    assertEquals(beer.getName(), Teryaki.NAME);
    assertEquals(beer.getPrice(), Teryaki.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForTeryaki() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.NatMiz.Teryaki";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Teryaki.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}