package ch.heigvd.res.pizza.domain.boosterloop;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanaTest {
    @Test
    void thePriceAndNameForRomanaShouldBeCorrect() {
        Romana pizza = new Romana();
        assertEquals(pizza.getName(), Romana.NAME);
        assertEquals(pizza.getPrice(), Romana.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForRomana() {
        Pizzaiolo luigi = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.boosterloop.Romana";
        int numberOfPizzas = 4;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = luigi.order(request);
        BigDecimal expectedTotalPrice = Romana.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
