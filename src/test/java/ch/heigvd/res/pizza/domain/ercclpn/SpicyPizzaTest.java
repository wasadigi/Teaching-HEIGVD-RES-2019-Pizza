package ch.heigvd.res.pizza.domain.ercclpn;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpicyPizzaTest {

  @Test
  void thePriceAndNameForSpicyPizzaShouldBeCorrect() {
    SpicyPizza beer = new SpicyPizza();
    assertEquals(beer.getName(), SpicyPizza.NAME);
    assertEquals(beer.getPrice(), SpicyPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForSpicyPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.ercclpn.SpicyPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = SpicyPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}