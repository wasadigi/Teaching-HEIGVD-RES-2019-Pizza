package ch.heigvd.res.pizza.domain.pete842;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VegeTest {

  @Test
  void thePriceAndNameForVegeShouldBeCorrect() {
    Vege beer = new Vege();
    assertEquals(beer.getName(), Vege.NAME);
    assertEquals(beer.getPrice(), Vege.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForVege() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.pete842.Vege";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Vege.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}