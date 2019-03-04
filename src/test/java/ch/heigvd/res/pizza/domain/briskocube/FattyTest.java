package ch.heigvd.res.pizza.domain.briskocube;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

  @Test
  void thePriceAndNameForFattyShouldBeCorrect() {
    Fatty beer = new Fatty();
    assertEquals(beer.getName(), Fatty.NAME);
    assertEquals(beer.getPrice(), Fatty.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFatty() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.briskocube.Fatty";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Fatty.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}