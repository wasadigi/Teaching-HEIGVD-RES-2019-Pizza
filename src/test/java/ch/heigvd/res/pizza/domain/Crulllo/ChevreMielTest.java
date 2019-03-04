package ch.heigvd.res.pizza.domain.Crulllo;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChevreMielTest {

    @Test
    void thePriceAndNameForChevreMielShouldBeCorrect() {
        ChevreMiel beer = new ChevreMiel();
        assertEquals(beer.getName(), ChevreMiel.NAME);
        assertEquals(beer.getPrice(), ChevreMiel.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForChevreMiel() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Crulllo.ChevreMiel";
        int numberOfPizzas = 3;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = ChevreMiel.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}