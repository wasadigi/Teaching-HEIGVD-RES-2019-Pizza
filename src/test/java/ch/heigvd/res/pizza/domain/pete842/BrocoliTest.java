package ch.heigvd.res.pizza.domain.pete842;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.pete842.Brocoli;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrocoliTest {

  @Test
  void thePriceAndNameForBrocoliShouldBeCorrect() {
    Brocoli beer = new Brocoli();
    assertEquals(beer.getName(), Brocoli.NAME);
    assertEquals(beer.getPrice(), Brocoli.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBrocoli() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.pete842.Brocoli";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Brocoli.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}