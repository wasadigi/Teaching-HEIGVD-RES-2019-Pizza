package ch.heigvd.res.pizza.domain.kaerdhalis;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedPizzaTest {

    @Test
    void thePriceAndNameForRedPizzaShouldBeCorrect() {
        RedPizza beer = new RedPizza();
        assertEquals(beer.getName(), RedPizza.NAME);
        assertEquals(beer.getPrice(), RedPizza.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForRedPizza() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.kaerdhalis.RedPizza";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = RedPizza.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}