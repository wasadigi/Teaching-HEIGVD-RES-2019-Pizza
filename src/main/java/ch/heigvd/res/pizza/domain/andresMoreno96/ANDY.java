package ch.heigvd.res.pizza.domain.andresMoreno96;

import ch.heigvd.res.pizza.domain.IProduct;
import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;

import java.math.BigDecimal;

public class ANDY {

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
