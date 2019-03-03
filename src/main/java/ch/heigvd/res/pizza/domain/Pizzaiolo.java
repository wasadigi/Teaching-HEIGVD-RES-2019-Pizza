package ch.heigvd.res.pizza.domain;

import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;

import java.math.BigDecimal;

public class Pizzaiolo {

  public GreetingsResponse greet(GreetingsRequest request) {
    return new GreetingsResponse("hello, how can I help you?");
  }

  public OrderResponse order(OrderRequest request) {
    String productName = request.getProductName();

    try {
      // let Java reflection do its magic
      IProduct product = (IProduct) Class.forName(productName).newInstance();
      BigDecimal totalPrice = product.getPrice().multiply(new BigDecimal(request.getQuantity()));
      return new OrderResponse(totalPrice);
    } catch (Exception e) {
      return null;
    }
  }

}
