package ch.heigvd.res.pizza.domain.GODOmegaPi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Apple implements IProduct {

  public final static String NAME = "Apple";
  public final static BigDecimal PRICE = new BigDecimal(25.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
