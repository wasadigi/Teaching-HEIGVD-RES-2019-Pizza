package ch.heigvd.res.pizza.domain.pagedidier;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CampagnardTest {

    @Test
    void thePriceAndNameForMCampagnardShouldBeCorrect() {
        Campagnard beer = new Campagnard();
        assertEquals(beer.getName(), Campagnard.NAME);
        assertEquals(beer.getPrice(), Campagnard.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForCampagnard() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.pagedidier.Campagnard";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Campagnard.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}