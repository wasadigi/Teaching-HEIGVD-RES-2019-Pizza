package ch.heigvd.res.pizza.domain.SamuelMettler;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NomUniqueTest {

  @Test
  void thePriceAndNameForNomUniqueShouldBeCorrect() {
    NomUnique beer = new NomUnique();
    assertEquals(beer.getName(), NomUnique.NAME);
    assertEquals(beer.getPrice(), NomUnique.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForNomUnique() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.SamuelMettler.NomUnique";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = NomUnique.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}