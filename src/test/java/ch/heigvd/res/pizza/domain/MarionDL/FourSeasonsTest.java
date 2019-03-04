package ch.heigvd.res.pizza.domain.MarionDL;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.MarionDL.FourSeasons;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourSeasonsTest {

  @Test
  void thePriceAndNameForFourSeasonsShouldBeCorrect() {
    FourSeasons beer = new FourSeasons();
    assertEquals(beer.getName(), FourSeasons.NAME);
    assertEquals(beer.getPrice(), FourSeasons.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForFourSeasons() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.MarionDL.FourSeasons";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = FourSeasons.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}