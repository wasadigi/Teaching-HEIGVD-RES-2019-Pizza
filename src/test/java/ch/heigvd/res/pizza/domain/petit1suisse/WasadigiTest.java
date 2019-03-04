package ch.heigvd.res.pizza.domain.petit1suisse;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WasadigiTest {
    @Test
    void thePriceAndNameForWasadigiShouldBeCorrect() {
        Wasadigi pizza = new Wasadigi();
        assertEquals(pizza.getName(), Wasadigi.NAME);
        assertEquals(pizza.getPrice(), Wasadigi.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForMargherita() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.petit1suisse.Wasadigi";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Wasadigi.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}