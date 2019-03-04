package ch.heigvd.res.pizza.domain.yoann0000;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Mergez implements IProduct {

  public final static String NAME = "Pizza Mergez";
  public final static BigDecimal PRICE = new BigDecimal(17.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
