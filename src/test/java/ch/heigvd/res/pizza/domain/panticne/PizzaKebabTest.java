package ch.heigvd.res.pizza.domain.panticne;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaKebabTest {

    @Test
    void thePriceAndNameForPizzaKebabShouldBeCorrect() {
        PizzaKebab beer = new PizzaKebab();
        assertEquals(beer.getName(), PizzaKebab.NAME);
        assertEquals(beer.getPrice(), PizzaKebab.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPizzaKebab() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.panticne.PizzaKebab";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = PizzaKebab.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}