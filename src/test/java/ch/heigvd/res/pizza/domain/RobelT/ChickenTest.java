package ch.heigvd.res.pizza.domain.RobelT;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChickenTest {

    @Test
    void thePriceAndNameForChickenShouldBeCorrect() {
        Chicken chicken = new Chicken();
        assertEquals(chicken.getName(), Chicken.NAME);
        assertEquals(chicken.getPrice(), Chicken.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForChicken() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.RobelT.Chicken";
        int numberOfPizzas = 5;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Chicken.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}