package ch.heigvd.res.pizza.domain.ecarpita93;


        import ch.heigvd.res.pizza.domain.Pizzaiolo;
        import ch.heigvd.res.pizza.protocol.OrderRequest;
        import ch.heigvd.res.pizza.protocol.OrderResponse;
        import org.junit.jupiter.api.Test;

        import java.math.BigDecimal;

        import static org.junit.jupiter.api.Assertions.assertEquals;

class NapoletanaTest {

    @Test
    void thePriceAndNameForMNapoletanaShouldBeCorrect() {
        Napoletana beer = new Napoletana();
        assertEquals(beer.getName(), Napoletana.NAME);
        assertEquals(beer.getPrice(), Napoletana.PRICE);
    }

    @Test
    void aPizzaioloShouldAcceptAnOrderForNapoletana() {
        Pizzaiolo mario = new Pizzaiolo();
        String productName = "ch.heigvd.res.pizza.domain.ecarpita93.Napoletana";
        int numberOfPizzas = 2;
        OrderRequest request = new OrderRequest(numberOfPizzas, productName);
        OrderResponse response = mario.order(request);
        BigDecimal expectedTotalPrice = Napoletana.PRICE.multiply(new BigDecimal(numberOfPizzas));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}