package ch.heigvd.res.pizza.domain.yoann0000;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

  @Test
  void thePriceAndNameForMergezaShouldBeCorrect() {
    Mergez beer = new Mergez();
    assertEquals(beer.getName(), Mergez.NAME);
    assertEquals(beer.getPrice(), Mergez.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMergez() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.yoann0000.Mergez";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Mergez.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}