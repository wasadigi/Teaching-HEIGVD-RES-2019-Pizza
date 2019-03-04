package ch.heigvd.res.pizza.domain.Jostoph;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiaboloTest {

  @Test
  void thePriceAndNameForDiaboloShouldBeCorrect() {
    Diabolo pizza = new Diabolo();
    assertEquals(pizza.getName(), Diabolo.NAME);
    assertEquals(pizza.getPrice(), Diabolo.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForDiabolo() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Jostoph.Diabolo";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Diabolo.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}