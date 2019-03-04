package ch.heigvd.res.pizza.domain.mullerPierrickHeig;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Crudo2 implements IProduct {

  public final static String NAME = "Crudo2";
  public final static BigDecimal PRICE = new BigDecimal(16.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
