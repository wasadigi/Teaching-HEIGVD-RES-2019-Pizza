package ch.heigvd.res.pizza.domain.sjaubain;

import ch.heigvd.res.pizza.domain.Pizzaiolo;
import ch.heigvd.res.pizza.domain.wasadigi.Margherita;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaEcoTest {

    @Test
    void thePriceAndNameForPizzaEcoShouldBeCorrect() {
        PizzaEco pizza = new PizzaEco();
        assertEquals(pizza.getName(), PizzaEco.NAME);
        assertEquals(pizza.getPrice(), PizzaEco.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForPizzaEco() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.sjaubain.PizzaEco";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = PizzaEco.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}