package ch.heigvd.res.pizza.domain.lapinousexy;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuatreFromagesTest {

    @Test
    void thePriceAndNameForQuatreFromagesShouldBeCorrect() {
        QuatreFromages beer = new QuatreFromages();
        assertEquals(beer.getName(), QuatreFromages.NAME);
        assertEquals(beer.getPrice(), QuatreFromages.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForQuatreFromages() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.lapinousexy.QuatreFromages";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = QuatreFromages.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}