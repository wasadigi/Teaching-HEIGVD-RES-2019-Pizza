package ch.heigvd.res.pizza.domain.briskocube;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlueTest {

    @Test
    void thePriceAndNameForBlueShouldBeCorrect() {
        Blue beer = new Blue();
        assertEquals(beer.getName(), Blue.NAME);
        assertEquals(beer.getPrice(), Blue.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForBlue() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.briskocube.Blue";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Blue.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}