package ch.heigvd.res.pizza.domain.capito27;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HawaiTest {

    @Test
    void thePriceAndNameForHawaiShouldBeCorrect() {
        Hawai beer = new Hawai();
        assertEquals(beer.getName(), Hawai.NAME);
        assertEquals(beer.getPrice(), Hawai.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForHawai() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.capito27.Hawai";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Hawai.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}