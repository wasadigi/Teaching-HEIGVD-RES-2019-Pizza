package ch.heigvd.res.pizza.domain.GODOmegaPi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnanasTest {

  @Test
  void thePriceAndNameForAnanasShouldBeCorrect() {
    Ananas pizza = new Ananas();
    assertEquals(pizza.getName(), Ananas.NAME);
    assertEquals(pizza.getPrice(), Ananas.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForAnanas() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.GODOmegaPi.Ananas";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Ananas.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}