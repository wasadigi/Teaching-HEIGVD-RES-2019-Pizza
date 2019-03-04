package ch.heigvd.res.pizza.domain.nyg;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Hawaii implements IProduct {

  public final static String NAME = "Hawaii";
  public final static BigDecimal PRICE = new BigDecimal(20.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
