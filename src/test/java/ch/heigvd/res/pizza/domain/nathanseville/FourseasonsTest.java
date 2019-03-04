package ch.heigvd.res.pizza.domain.nathanseville;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourseasonsTest {

  @Test
  void thePriceAndNameForFourseasonsShouldBeCorrect() {
    Fourseasons beer = new Fourseasons();
    assertEquals(beer.getName(), Fourseasons.NAME);
    assertEquals(beer.getPrice(), Fourseasons.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFourseasons() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.nathanseville.Fourseasons";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Fourseasons.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}