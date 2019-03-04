package ch.heigvd.res.pizza.domain.nyg;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PepperoniTest {

    @Test
    void thePriceAndNameForPepperoniShouldBeCorrect() {
        Pepperoni pizza = new Pepperoni();
        assertEquals(pizza.getName(), Pepperoni.NAME);
        assertEquals(pizza.getPrice(), Pepperoni.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPepperoni() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.nyg.Pepperoni";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Pepperoni.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}