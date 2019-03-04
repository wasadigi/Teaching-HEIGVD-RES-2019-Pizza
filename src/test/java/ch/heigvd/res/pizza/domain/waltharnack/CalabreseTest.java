package ch.heigvd.res.pizza.domain.waltharnack;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalabreseTest {

  @Test
  void thePriceAndNameForCalabreseShouldBeCorrect() {
    Calabrese pizza = new Calabrese();
    assertEquals(pizza.getName(), Calabrese.NAME);
    assertEquals(pizza.getPrice(), Calabrese.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.waltharnack.Calabrese";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Calabrese.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}