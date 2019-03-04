package ch.heigvd.res.pizza.domain.waltharnack;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItaliaTest {

  @Test
  void thePriceAndNameForItaliaShouldBeCorrect() {
    Italia pizza = new Italia();
    assertEquals(pizza.getName(), Italia.NAME);
    assertEquals(pizza.getPrice(), Italia.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForItalia() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.waltharnack.Italia";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Italia.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}