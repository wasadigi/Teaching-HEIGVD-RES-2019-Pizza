package ch.heigvd.res.pizza.domain.rafiibro;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RafiiTest {

    @Test
    void thePriceAndNameForRafiiShouldBeCorrect() {
        Rafii pizza = new Rafii();
        assertEquals(pizza.getName(), Rafii.NAME);
        assertEquals(pizza.getPrice(), Rafii.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForRafii() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.rafiibro.Rafii";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Rafii.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}