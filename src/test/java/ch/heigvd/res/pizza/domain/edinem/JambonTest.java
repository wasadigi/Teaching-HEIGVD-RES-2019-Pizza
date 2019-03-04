package ch.heigvd.res.pizza.domain.edinem;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.edinem.Jambon;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JambonTest {

  @Test
  void thePriceAndNameForJambonShouldBeCorrect() {
    Jambon beer = new Jambon();
    assertEquals(beer.getName(), Jambon.NAME);
    assertEquals(beer.getPrice(), Jambon.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForJambon() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.edinem.Jambon";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Jambon.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}