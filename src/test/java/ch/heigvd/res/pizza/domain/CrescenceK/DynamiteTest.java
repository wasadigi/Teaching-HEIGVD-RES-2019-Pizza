package ch.heigvd.res.pizza.domain.CrescenceK;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamiteTest {

  @Test
  void thePriceAndNameForDynamiteShouldBeCorrect() {
    Dynamite beer = new Dynamite();
    assertEquals(beer.getName(), Dynamite.NAME);
    assertEquals(beer.getPrice(), Dynamite.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForDynamite() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.CrescenceK.Dynamite";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Dynamite.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}