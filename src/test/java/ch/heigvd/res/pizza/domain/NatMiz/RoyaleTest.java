package ch.heigvd.res.pizza.domain.NatMiz;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.NatMiz.Royale;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoyaleTest {

  @Test
  void thePriceAndNameForRoyaleShouldBeCorrect() {
    Royale pizza = new Royale();
    assertEquals(pizza.getName(), Royale.NAME);
    assertEquals(pizza.getPrice(), Royale.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForRoyale() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.NatMiz.Royale";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Royale.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}