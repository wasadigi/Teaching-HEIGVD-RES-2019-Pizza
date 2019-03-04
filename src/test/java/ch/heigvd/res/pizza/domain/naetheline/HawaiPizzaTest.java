package ch.heigvd.res.pizza.domain.naetheline;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by nathalie on 04/03/19.
 */
public class HawaiPizzaTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        HawaiPizza pizza = new HawaiPizza();
        assertEquals(pizza.getName(), HawaiPizza.NAME);
        assertEquals(pizza.getPrice(), HawaiPizza.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.naetheline.HawaiPizza";
        OrderRequest request = new OrderRequest(1, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = HawaiPizza.PRICE.multiply(new BigDecimal(1));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
