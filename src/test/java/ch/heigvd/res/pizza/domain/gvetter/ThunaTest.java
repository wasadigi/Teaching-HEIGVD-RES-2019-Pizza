package ch.heigvd.res.pizza.domain.gvetter;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThunaTest {

    @Test
    void thePriceAndNameForThunaShouldBeCorrect() {
        Thuna pizza = new Thuna();
        assertEquals(pizza.getName(), Thuna.NAME);
        assertEquals(pizza.getPrice(), Thuna.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForThuna() {
        Pizzaiolo jane = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.gvetter.Thuna";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Thuna.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}