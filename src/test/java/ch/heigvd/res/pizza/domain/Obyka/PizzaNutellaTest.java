package ch.heigvd.res.pizza.domain.Obyka;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.Obyka.PizzaNutella;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaNutellaTest {

  @Test
  void thePriceAndNameForPizzaNutellaShouldBeCorrect() {
    PizzaNutella pizza = new PizzaNutella();
    assertEquals(pizza.getName(), PizzaNutella.NAME);
    assertEquals(pizza.getPrice(), PizzaNutella.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.Obyka.PizzaNutella";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = PizzaNutella.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}