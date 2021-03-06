package ch.heigvd.res.pizza.domain.edinem;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.edinem.Diavolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiavoloTest {

  @Test
  void thePriceAndNameForDiavoloShouldBeCorrect() {
    Diavolo beer = new Diavolo();
    assertEquals(beer.getName(), Diavolo.NAME);
    assertEquals(beer.getPrice(), Diavolo.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForDiavolo() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.edinem.Diavolo";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Diavolo.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}