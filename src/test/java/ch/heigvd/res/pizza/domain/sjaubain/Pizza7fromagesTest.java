package ch.heigvd.res.pizza.domain.sjaubain;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class Pizza7fromagesTest {

    @Test
    void thePriceAndNameForPizza7fromagesShouldBeCorrect() {
        Pizza7fromages pizza = new Pizza7fromages();
        assertEquals(pizza.getName(), Pizza7fromages.NAME);
        assertEquals(pizza.getPrice(), Pizza7fromages.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPizza7fromages() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.sjaubain.Pizza7fromages";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Pizza7fromages.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}