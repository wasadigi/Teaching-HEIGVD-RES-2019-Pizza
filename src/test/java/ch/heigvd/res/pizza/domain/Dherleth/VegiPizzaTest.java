package ch.heigvd.res.pizza.domain.Dherleth;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.Dherleth.VegiPizza;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VegiPizzaTest {

  @Test
  void thePriceAndNameForVegiPizzaShouldBeCorrect() {
    VegiPizza beer = new VegiPizza();
    assertEquals(beer.getName(), VegiPizza.NAME);
    assertEquals(beer.getPrice(), VegiPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForVegiPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Dherleth.VegiPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = VegiPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}