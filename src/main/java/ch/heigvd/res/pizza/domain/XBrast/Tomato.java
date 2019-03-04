package ch.heigvd.res.pizza.domain.XBrast;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Tomato implements IProduct {

  public final static String NAME = "Tomato";
  public final static BigDecimal PRICE = new BigDecimal(2.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
