package ch.heigvd.res.pizza.domain.nathanseville;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NapolitanTest {

  @Test
  void thePriceAndNameForNapolitanShouldBeCorrect() {
    Napolitan beer = new Napolitan();
    assertEquals(beer.getName(), Napolitan.NAME);
    assertEquals(beer.getPrice(), Napolitan.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForNapolitan() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.nathanseville.Napolitan";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Napolitan.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}