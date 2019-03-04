package ch.heigvd.res.pizza.domain.batach31;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PimentTest {

    @Test
    void thePriceAndNameForMargheritaShouldBeCorrect() {
        Piment beer = new Piment();
        assertEquals(beer.getName(), Piment.NAME);
        assertEquals(beer.getPrice(), Piment.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMargherita() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.batach31.Piment";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Piment.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}