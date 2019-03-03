package ch.heigvd.res.pizza.protocol;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponse implements IMessage {

  private final BigDecimal totalPrice;

}
