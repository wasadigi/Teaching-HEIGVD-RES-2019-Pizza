package ch.heigvd.res.pizza.domain.gvetter;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NapolitaTest {

    @Test
    void thePriceAndNameForNapolitaShouldBeCorrect() {
        Napolita pizza = new Napolita();
        assertEquals(pizza.getName(), Napolita.NAME);
        assertEquals(pizza.getPrice(), Napolita.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForNapolita() {
        Pizzaiolo jane = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.gvetter.Napolita";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Napolita.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}