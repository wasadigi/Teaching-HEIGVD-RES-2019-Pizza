package ch.heigvd.res.pizza.domain.mullerPierrickHeig;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.mullerPierrickHeig.Crudo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrudoTest {

  @Test
  void thePriceAndNameForCrudoShouldBeCorrect() {
    Crudo beer = new Crudo();
    assertEquals(beer.getName(), Crudo.NAME);
    assertEquals(beer.getPrice(), Crudo.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForCrudo() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.mullerPierrickHeig.Crudo";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Crudo.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}