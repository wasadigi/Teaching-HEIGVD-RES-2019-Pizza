package ch.heigvd.res.pizza.domain.jzaehrin;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalabresTest {

  @Test
  void thePriceAndNameForCalabresShouldBeCorrect() {
    Calabres pizza = new Calabres();
    assertEquals(pizza.getName(), Margherita.NAME);
    assertEquals(pizza.getPrice(), Margherita.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCalabres() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.jzaehrin.Calabres";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Calabres.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}