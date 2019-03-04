package ch.heigvd.res.pizza.domain.lionelburgbach;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LardTest {

  @Test
  void thePriceAndNameForLardShouldBeCorrect() {
    Lard beer = new Lard();
    assertEquals(beer.getName(), Lard.NAME);
    assertEquals(beer.getPrice(), Lard.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForLard() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.lionelburgbach.Lard";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Lard.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}