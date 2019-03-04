package ch.heigvd.res.pizza.domain.RobelT;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalamiTest {

    @Test
    void thePriceAndNameForSalamiShouldBeCorrect() {
        Salami salami = new Salami();
        assertEquals(salami.getName(), Salami.NAME);
        assertEquals(salami.getPrice(), Salami.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForSalami() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.RobelT.Salami";
        int numberOfPizzas = 3;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Salami.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}