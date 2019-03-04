package ch.heigvd.res.pizza.domain.playjul306;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TunisianTest {

  @Test
  void thePriceAndNameForTunisianShouldBeCorrect() {
    Tunisian beer = new Tunisian();
    assertEquals(beer.getName(), Tunisian.NAME);
    assertEquals(beer.getPrice(), Tunisian.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForTunisian() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.playjul306.Tunisian";
    int numberOfPizzas = 8;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Tunisian.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}