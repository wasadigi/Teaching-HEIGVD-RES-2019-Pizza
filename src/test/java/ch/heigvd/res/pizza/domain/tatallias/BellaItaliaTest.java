package ch.heigvd.res.pizza.domain.tatallias;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BellaItaliaTest {

  @Test
  void thePriceAndNameForBellaItaliaShouldBeCorrect() {
    BellaItalia beer = new BellaItalia();
    assertEquals(beer.getName(), BellaItalia.NAME);
    assertEquals(beer.getPrice(), BellaItalia.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBellaItalia() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.tatallias.BellaItalia";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = BellaItalia.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}