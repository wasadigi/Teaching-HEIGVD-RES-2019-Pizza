package ch.heigvd.res.pizza.domain.IxSysTech;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.IxSysTech.Ananas;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AnanasTest {

    @Test
    void thePriceAndNameForAnanasShouldBeCorrect() {
        Ananas beer = new Ananas();
        assertEquals(beer.getName(), Ananas.NAME);
        assertEquals(beer.getPrice(), Ananas.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForAnanas() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.IxSysTech.Ananas";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Ananas.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}