package ch.heigvd.res.pizza.domain.zereddiamond;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PancettaTest {

  @Test
  void thePriceAndNameForPancettaShouldBeCorrect() {
    Pancetta beer = new Pancetta();
    assertEquals(beer.getName(), Pancetta.NAME);
    assertEquals(beer.getPrice(), Pancetta.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForPancetta() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.zereddiamond.Pancetta";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Pancetta.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}