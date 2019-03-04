package ch.heigvd.res.pizza.domain.samirkovitch;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BricoTest {

  @Test
  void thePriceAndNameForBricoShouldBeCorrect() {
    Brico beer = new Brico();
    assertEquals(beer.getName(), Brico.NAME);
    assertEquals(beer.getPrice(), Brico.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBrico() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.samirkovitch.Brico";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Brico.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}