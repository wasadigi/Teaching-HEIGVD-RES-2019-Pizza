package ch.heigvd.res.pizza.domain.lougranou;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Pescatore implements IProduct {

  public final static String NAME = "Pescatore";
  public final static BigDecimal PRICE = new BigDecimal(24.95);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
