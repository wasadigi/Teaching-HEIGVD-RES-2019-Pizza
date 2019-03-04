package ch.heigvd.res.pizza.domain.oTwoWin;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PortugueseTest {

    @Test
    void thePriceAndNameForPortugueseShouldBeCorrect() {
        Portuguese beer = new Portuguese();
        assertEquals(beer.getName(), Portuguese.NAME);
        assertEquals(beer.getPrice(), Portuguese.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPortuguese() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.oTwoWin.Portuguese";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Portuguese.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}