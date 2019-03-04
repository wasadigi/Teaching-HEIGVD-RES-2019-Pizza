package ch.heigvd.res.pizza.domain.CrescenceK;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitMerTest {

  @Test
  void thePriceAndNameForFruitMerShouldBeCorrect() {
    FruitMer beer = new FruitMer();
    assertEquals(beer.getName(), FruitMer.NAME);
    assertEquals(beer.getPrice(), FruitMer.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFruitMer() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.CrescenceK.FruitMer";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = FruitMer.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}