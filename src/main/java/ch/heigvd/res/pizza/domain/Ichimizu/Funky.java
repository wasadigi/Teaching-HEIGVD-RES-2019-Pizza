package ch.heigvd.res.pizza.domain.Ichimizu;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Funky implements IProduct {

  public final static String NAME = "Funky";
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
