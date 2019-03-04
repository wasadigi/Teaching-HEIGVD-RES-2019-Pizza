package ch.heigvd.res.pizza.domain.ecarpita93;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class romanaTest {

    @Test
    void thePriceAndNameForMargheritaShouldBeCorrect() {
        romana beer = new romana();
        assertEquals(beer.getName(), romana.NAME);
        assertEquals(beer.getPrice(), romana.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMargherita() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.ecarpita93.romana";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = romana.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}