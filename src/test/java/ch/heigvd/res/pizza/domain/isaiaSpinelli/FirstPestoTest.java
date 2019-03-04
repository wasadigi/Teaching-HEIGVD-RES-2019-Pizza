package ch.heigvd.res.pizza.domain.isaiaSpinelli;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstPestoTest {

  @Test
  void thePriceAndNameForFirstPestoShouldBeCorrect() {
    FirstPesto beer = new FirstPesto();
    assertEquals(beer.getName(), FirstPesto.NAME);
    assertEquals(beer.getPrice(), FirstPesto.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFirstPesto() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.isaiaSpinelli.FirstPesto";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = FirstPesto.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}