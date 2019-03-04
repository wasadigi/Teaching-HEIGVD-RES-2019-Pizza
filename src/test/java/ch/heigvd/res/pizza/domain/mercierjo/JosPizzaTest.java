package ch.heigvd.res.pizza.domain.mercierjo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JosPizzaTest {

  @Test
  void thePriceAndNameForJosPizzaShouldBeCorrect() {
    JosPizza beer = new JosPizza();
    assertEquals(beer.getName(), JosPizza.NAME);
    assertEquals(beer.getPrice(), JosPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForJosPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.mercierjo.JosPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = JosPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}