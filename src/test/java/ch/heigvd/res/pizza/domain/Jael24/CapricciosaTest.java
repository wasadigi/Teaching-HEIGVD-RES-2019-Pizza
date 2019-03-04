package ch.heigvd.res.pizza.domain.Jael24;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.Jael24.Capricciosa;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CapricciosaTest {

    @Test
    void thePriceAndNameForCapricciosaShouldBeCorrect() {
        Capricciosa beer = new Capricciosa();
        assertEquals(beer.getName(), Capricciosa.NAME);
        assertEquals(beer.getPrice(), Capricciosa.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForCapricciosa() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Jael24.Capricciosa";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Capricciosa.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}