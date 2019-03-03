package ch.heigvd.res.pizza.protocol;

import lombok.Data;

@Data
public class OrderRequest implements IMessage {

  private final int quantity;
  private final String productName;

}
