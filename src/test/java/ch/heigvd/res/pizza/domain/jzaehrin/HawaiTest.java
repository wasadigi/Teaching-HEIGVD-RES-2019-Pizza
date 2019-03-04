package ch.heigvd.res.pizza.domain.jzaehrin;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HawaiTest {

  @Test
  void thePriceAndNameForHawaiShouldBeCorrect() {
    Hawai pizza = new Hawai();
    assertEquals(pizza.getName(), Hawai.NAME);
    assertEquals(pizza.getPrice(), Hawai.PRICE);
  }

  @Test
  void aPizzaioloShouldAcceptAnOrderForHawai() {
    Pizzaiolo mario = new Pizzaiolo();
    String productName = "ch.heigvd.res.pizza.domain.jzaehrin.Hawai";
    int numberOfPizzas = 2;
    OrderRequest request = new OrderRequest(numberOfPizzas, productName);
    OrderResponse response = mario.order(request);
    BigDecimal expectedTotalPrice = Hawai.PRICE.multiply(new BigDecimal(numberOfPizzas));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}