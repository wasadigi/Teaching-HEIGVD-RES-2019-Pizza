package ch.heigvd.res.pizza.domain.samirkovitch;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NiceTest {

  @Test
  void thePriceAndNameForNiceShouldBeCorrect() {
    Nice beer = new Nice();
    assertEquals(beer.getName(), Nice.NAME);
    assertEquals(beer.getPrice(), Nice.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForNice() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.samirkovitch.Nice";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Nice.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}