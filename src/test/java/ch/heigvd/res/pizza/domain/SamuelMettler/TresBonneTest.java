package ch.heigvd.res.pizza.domain.SamuelMettler;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TresBonneTest {

  @Test
  void thePriceAndNameForTresBonneShouldBeCorrect() {
    Margherita beer = new Margherita();
    assertEquals(beer.getName(), Margherita.NAME);
    assertEquals(beer.getPrice(), Margherita.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForTresBonne() {
    Pizzaiolo maria = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.SamuelMettler.TresBonne";
    int numberOfPizzas = 3;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = maria.order(request);
    BigDecimal expectedTotalPrice = TresBonne.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}