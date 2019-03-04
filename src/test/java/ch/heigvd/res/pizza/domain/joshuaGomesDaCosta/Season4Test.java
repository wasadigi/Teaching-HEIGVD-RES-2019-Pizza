package ch.heigvd.res.pizza.domain.joshuaGomesDaCosta;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Season4Test {

    @Test
    void thePriceAndNameForSeason4ShouldBeCorrect() {
        Season4 beer = new Season4();
        assertEquals(beer.getName(), Season4.NAME);
        assertEquals(beer.getPrice(), Season4.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForSeason4() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.joshuaGomesDaCosta.Season4";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Season4.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}