package ch.heigvd.res.pizza.domain.Ezehkiel;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalsonTest {

  @Test
  void thePriceAndNameForCalsonShouldBeCorrect() {
    Calson beer = new Calson();
    assertEquals(beer.getName(), Calson.NAME);
    assertEquals(beer.getPrice(), Calson.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCalson() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Ezehkiel.Calson";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Calson.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}