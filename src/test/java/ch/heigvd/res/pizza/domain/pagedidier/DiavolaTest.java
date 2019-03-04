package ch.heigvd.res.pizza.domain.pagedidier;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiavolaTest {

    @Test
    void thePriceAndNameForMargheritaShouldBeCorrect() {
        Diavola pizza = new Diavola();
        assertEquals(pizza.getName(), Diavola.NAME);
        assertEquals(pizza.getPrice(), Diavola.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForDiavola() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.pagedidier.Diavola";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Diavola.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}