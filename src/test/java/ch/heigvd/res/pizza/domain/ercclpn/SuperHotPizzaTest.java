package ch.heigvd.res.pizza.domain.ercclpn;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperHotPizzaTest {

  @Test
  void thePriceAndNameForSuperHotPizzaShouldBeCorrect() {
    SuperHotPizza beer = new SuperHotPizza();
    assertEquals(beer.getName(), SuperHotPizza.NAME);
    assertEquals(beer.getPrice(), SuperHotPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForSuperHotPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.ercclpn.SuperHotPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = SuperHotPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}