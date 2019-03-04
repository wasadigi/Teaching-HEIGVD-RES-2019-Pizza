package ch.heigvd.res.pizza.domain.MarionDL;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.MarionDL.Carnivore;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarnivoreTest {

  @Test
  void thePriceAndNameForCarnivoreShouldBeCorrect() {
    Carnivore beer = new Carnivore();
    assertEquals(beer.getName(), Carnivore.NAME);
    assertEquals(beer.getPrice(), Carnivore.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCarnivore() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.MarionDL.Carnivore";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Carnivore.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}