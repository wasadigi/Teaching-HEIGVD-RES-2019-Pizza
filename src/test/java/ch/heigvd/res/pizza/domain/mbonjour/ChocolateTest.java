package ch.heigvd.res.pizza.domain.mbonjour;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.mbonjour.Chocolate;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChocolateTest {

    @Test
    void thePriceAndNameForChocolateShouldBeCorrect() {
        Chocolate beer = new Chocolate();
        assertEquals(beer.getName(), Chocolate.NAME);
        assertEquals(beer.getPrice(), Chocolate.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForChocolate() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.mbonjour.Chocolate";
        int numberOfPizzas = 3;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Chocolate.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}