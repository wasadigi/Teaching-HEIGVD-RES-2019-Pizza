package ch.heigvd.res.pizza.domain.victortruan;
import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ThonTest {
    @Test
    void thePriceAndNameForThonShouldBeCorrect() {
        Thon beer = new Thon();
        assertEquals(beer.getName(), Thon.NAME);
        assertEquals(beer.getPrice(), Thon.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForThon() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.victortruan.Thon";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Thon.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
