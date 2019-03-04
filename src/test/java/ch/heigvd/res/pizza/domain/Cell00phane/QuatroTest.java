package ch.heigvd.res.pizza.domain.Cell00phane;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuatroTest {

    @Test
    void thePriceAndNameForQuatroShouldBeCorrect() {
        Quatro beer = new Quatro();
        assertEquals(beer.getName(), Quatro.NAME);
        assertEquals(beer.getPrice(), Quatro.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForQuatro() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Cell00phane.Quatro";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Quatro.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}