package ch.heigvd.res.pizza.domain.Tsimwi;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenovisPizzaTest {
    @Test
    void aPizzaioloShouldReplyToGreetings() {
        Pizzaiolo luigi = new Pizzaiolo();
        GreetingsRequest request = new GreetingsRequest("Hi there");
        GreetingsResponse response = luigi.greet(request);
        assertEquals("hello, how can I help you?", response.getText());
    }

    @Test
    void weShouldBuyAnanasPizza() {
        Pizzaiolo doris = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.Tsimwi.CenovisPizza";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = doris.order(request);
        BigDecimal expectedTotalPrice = CenovisPizza.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
