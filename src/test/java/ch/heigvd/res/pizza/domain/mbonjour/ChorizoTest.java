package ch.heigvd.res.pizza.domain.mbonjour;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MargheritaTest {

    @Test
    void thePriceAndNameForChorizoShouldBeCorrect() {
        Chorizo beer = new Chorizo();
        assertEquals(beer.getName(), Chorizo.NAME);
        assertEquals(beer.getPrice(), Chorizo.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForChorizo() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.mbonjour.Chorizo";
        int numberOfPizzas = 4;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Chorizo.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}