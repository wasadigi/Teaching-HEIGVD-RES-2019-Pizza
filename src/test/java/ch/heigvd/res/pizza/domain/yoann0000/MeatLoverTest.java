package ch.heigvd.res.pizza.domain.yoann0000;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeatLoverTest {

  @Test
  void thePriceAndNameForMeatLoverShouldBeCorrect() {
    MeatLover beer = new MeatLover();
    assertEquals(beer.getName(), MeatLover.NAME);
    assertEquals(beer.getPrice(), MeatLover.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForMargherita() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.yoann0000.MeatLover";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = MeatLover.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}