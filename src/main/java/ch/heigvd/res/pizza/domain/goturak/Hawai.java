package ch.heigvd.res.pizza.domain.goturak;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Hawai implements IProduct {

  public final static String NAME = "Hawai";
  public final static BigDecimal PRICE = new BigDecimal(11.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
