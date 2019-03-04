package ch.heigvd.res.pizza.domain.MichaelDaSilva;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RacletteTest {

  @Test
  void thePriceAndNameForRacletteShouldBeCorrect() {
    Margherita beer = new Margherita();
    assertEquals(beer.getName(), Margherita.NAME);
    assertEquals(beer.getPrice(), Margherita.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForRaclette() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.MichaelDaSilva.Raclette";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Raclette.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}