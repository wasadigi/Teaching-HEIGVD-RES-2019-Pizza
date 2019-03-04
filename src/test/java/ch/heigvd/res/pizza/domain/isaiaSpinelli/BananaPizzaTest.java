package ch.heigvd.res.pizza.domain.isaiaSpinelli;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BananaPizzaTest {

  @Test
  void thePriceAndNameForBananaPizzaShouldBeCorrect() {
    BananaPizza beer = new BananaPizza();
    assertEquals(beer.getName(), BananaPizza.NAME);
    assertEquals(beer.getPrice(), BananaPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForBananaPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.isaiaSpinelli.BananaPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = BananaPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}