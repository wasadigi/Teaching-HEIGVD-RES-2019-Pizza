package ch.heigvd.res.pizza.domain.zereddiamond;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.zereddiamond.Etna;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EtnaTest {

  @Test
  void thePriceAndNameForEtnaShouldBeCorrect() {
    Etna beer = new Etna();
    assertEquals(beer.getName(), Etna.NAME);
    assertEquals(beer.getPrice(), Etna.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForEtna() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.zereddiamond.Etna";
    int numberOfPizzas = 3;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Etna.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}