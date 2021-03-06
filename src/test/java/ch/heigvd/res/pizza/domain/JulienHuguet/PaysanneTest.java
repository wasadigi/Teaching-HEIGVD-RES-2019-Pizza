package ch.heigvd.res.pizza.domain.JulienHuguet;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaysanneTest {
    @Test
    void thePriceAndNameForPaysanneShouldBeCorrect() {
        Paysanne paysanne = new Paysanne();
        assertEquals(paysanne.getName(), Paysanne.NAME);
        assertEquals(paysanne.getPrice(), Paysanne.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPaysanne() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.JulienHuguet.Paysanne";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Paysanne.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}