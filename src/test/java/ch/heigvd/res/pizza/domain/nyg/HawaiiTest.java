package ch.heigvd.res.pizza.domain.nyg;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HawaiiTest {

    @Test
    void thePriceAndNameForHawaiiShouldBeCorrect() {
        ch.heigvd.res.pizza.domain.nyg.Hawaii pizza = new ch.heigvd.res.pizza.domain.nyg.Hawaii();
        assertEquals(pizza.getName(), ch.heigvd.res.pizza.domain.nyg.Hawaii.NAME);
        assertEquals(pizza.getPrice(), ch.heigvd.res.pizza.domain.nyg.Hawaii.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForHawaii() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.nyg.Hawaii";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Hawaii.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}