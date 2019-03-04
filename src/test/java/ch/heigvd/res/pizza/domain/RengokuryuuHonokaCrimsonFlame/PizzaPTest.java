package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaPTestTest {

  @Test
  void thePriceAndNameForPizzaPShouldBeCorrect() {
    PizzaP beer = new PizzaP();
    assertEquals(beer.getName(), PizzaP.NAME);
    assertEquals(beer.getPrice(), PizzaP.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForPizzaP() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.wasadigi.PizzaP";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = PizzaP.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}