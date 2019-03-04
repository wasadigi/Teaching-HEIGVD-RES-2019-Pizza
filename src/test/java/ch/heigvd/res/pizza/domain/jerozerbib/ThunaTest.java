 package ch.heigvd.res.pizza.domain.jerozerbib;
 
 import ch.heigvd.res.pizza.domain.Pizzaiolo;
 import ch.heigvd.res.pizza.protocol.OrderRequest;
 import ch.heigvd.res.pizza.protocol.OrderResponse;
 import org.junit.jupiter.api.Test;
 
 import java.math.BigDecimal;
 
 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 class ThunaTest {
 
   @Test
   void thePriceAndNameForThunaShouldBeCorrect() {
     Thuna beer = new Thuna();
     assertEquals(beer.getName(), Thuna.NAME);
     assertEquals(beer.getPrice(), Thuna.PRICE);
   }
 
   @Test
   void aPizzaioloShouldAcceptAnOrderForThuna() {
     Pizzaiolo mario = new Pizzaiolo();
     String productName = "ch.heigvd.res.pizza.domain.jerozerbib.Thuna";
     int numberOfPizzas = 2;
     OrderRequest request = new OrderRequest(numberOfPizzas, productName);
     OrderResponse response = mario.order(request);
     BigDecimal expectedTotalPrice = Thuna.PRICE.multiply(new BigDecimal(numberOfPizzas));
     assertEquals(expectedTotalPrice, response.getTotalPrice());
   }
 
 }
