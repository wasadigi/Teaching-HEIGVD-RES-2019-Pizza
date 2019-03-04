package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

  @Test
  void thePriceAndNameForMargheritaShouldBeCorrect() {
    Margherita beer = new Margherita();
    assertEquals(beer.getName(), Margherita.NAME);
    assertEquals(beer.getPrice(), Margherita.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.wasadigi.Margherita";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Margherita.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}