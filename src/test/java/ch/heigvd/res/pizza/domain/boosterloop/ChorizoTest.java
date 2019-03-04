package ch.heigvd.res.pizza.domain.boosterloop;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChorizoTest {
    @Test
    void thePriceAndNameForChorizoShouldBeCorrect() {
        Chorizo pizza = new Chorizo();
        assertEquals(pizza.getName(), Chorizo.NAME);
        assertEquals(pizza.getPrice(), Chorizo.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForChorizo() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.boosterloop.Chorizo";
        int numberOfPizzas = 5;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Chorizo.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
