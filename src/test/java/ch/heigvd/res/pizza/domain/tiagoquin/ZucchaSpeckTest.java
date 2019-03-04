package ch.heigvd.res.pizza.domain.tiagoquin;


import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZucchaSpeckTest {

    @Test
    void thePriceAndNameForZucchaSpeckShouldBeCorrect() {
        ZucchaSpeck beer = new ZucchaSpeck();
        assertEquals(beer.getName(), ZucchaSpeck.NAME);
        assertEquals(beer.getPrice(), ZucchaSpeck.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForZucchaSpeck() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.tiagoquin.ZucchaSpeck";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = ZucchaSpeck.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}