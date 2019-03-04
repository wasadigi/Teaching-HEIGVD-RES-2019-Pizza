package ch.heigvd.res.pizza.domain.petit1suisse;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AlexzaTest {

    @Test
    void thePriceAndNameForAlexzaShouldBeCorrect() {
        Alexza pizza = new  Alexza();
        assertEquals(pizza.getName(),  Alexza.NAME);
        assertEquals(pizza.getPrice(),  Alexza.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForAlexza() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.petit1suisse.Alexza";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice =  Alexza.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}