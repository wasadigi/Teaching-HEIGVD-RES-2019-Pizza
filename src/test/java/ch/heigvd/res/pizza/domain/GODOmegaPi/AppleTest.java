package ch.heigvd.res.pizza.domain.GODOmegaPi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleTest {

  @Test
  void thePriceAndNameForAppleShouldBeCorrect() {
    Apple pizza = new Apple();
    assertEquals(pizza.getName(), Apple.NAME);
    assertEquals(pizza.getPrice(), Apple.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForApple() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.GODOmegaPi.Apple";
    int numberOfPizzas = 4;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Apple.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}