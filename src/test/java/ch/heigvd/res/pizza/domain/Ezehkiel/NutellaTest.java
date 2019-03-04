package ch.heigvd.res.pizza.domain.Ezehkiel;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NutellaTest {

  @Test
  void thePriceAndNameForNutellaShouldBeCorrect() {
    Nutella beer = new Nutella();
    assertEquals(beer.getName(), Nutella.NAME);
    assertEquals(beer.getPrice(), Nutella.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForNutella() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Ezehkiel.Nutella";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Nutella.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}