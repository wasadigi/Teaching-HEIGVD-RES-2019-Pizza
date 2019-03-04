package ch.heigvd.res.pizza.domain.Dherleth;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.Dherleth.PapaJohnsPizza;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PapaJohnsPizzaTest {

  @Test
  void thePriceAndNameForPapaJohnsPizzaShouldBeCorrect() {
    PapaJohnsPizza beer = new PapaJohnsPizza();
    assertEquals(beer.getName(), PapaJohnsPizza.NAME);
    assertEquals(beer.getPrice(), PapaJohnsPizza.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForPapaJohnsPizza() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Dherleth.PapaJohnsPizza";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = PapaJohnsPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}