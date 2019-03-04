package ch.heigvd.res.pizza.domain.mercierjo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BananaTest {

  @Test
  void thePriceAndNameForBananaShouldBeCorrect() {
    Banana beer = new Banana();
    assertEquals(beer.getName(), Banana.NAME);
    assertEquals(beer.getPrice(), Banana.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBanana() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.mercierjo.Banana";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Banana.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}