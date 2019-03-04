package ch.heigvd.res.pizza.domain.lougranou;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PescatoreTest {

  @Test
  void thePriceAndNameForPescatoreShouldBeCorrect() {
    Pescatore beer = new Pescatore();
    assertEquals(beer.getName(), Pescatore.NAME);
    assertEquals(beer.getPrice(), Pescatore.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForPescatore() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.lougranou.Pescatore";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Pescatore.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}