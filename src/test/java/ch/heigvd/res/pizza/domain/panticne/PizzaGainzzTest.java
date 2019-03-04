package ch.heigvd.res.pizza.domain.panticne;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

    @Test
    void thePriceAndNameForPizzaGainzzShouldBeCorrect() {
        PizzaGainzz beer = new PizzaGainzz();
        assertEquals(beer.getName(), PizzaGainzz.NAME);
        assertEquals(beer.getPrice(), PizzaGainzz.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPizzaGainzz() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.panticne.PizzaGainzz";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = PizzaGainzz.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}