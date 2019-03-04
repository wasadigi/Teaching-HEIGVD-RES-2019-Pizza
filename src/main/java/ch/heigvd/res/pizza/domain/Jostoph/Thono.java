package ch.heigvd.res.pizza.domain.Jostoph;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Thono implements IProduct {

  public final static String NAME = "Thono";
  public final static BigDecimal PRICE = new BigDecimal(15.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
