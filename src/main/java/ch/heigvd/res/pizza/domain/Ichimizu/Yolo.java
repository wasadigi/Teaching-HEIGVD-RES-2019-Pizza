package ch.heigvd.res.pizza.domain.Ichimizu;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Yolo implements IProduct {

  public final static String NAME = "Yolo";
  public final static BigDecimal PRICE = new BigDecimal(13.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
