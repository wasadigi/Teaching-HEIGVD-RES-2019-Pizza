package ch.heigvd.res.pizza.domain.waltharnack;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Calabrese implements IProduct {

  public final static String NAME = "Calabrese";
  public final static BigDecimal PRICE = new BigDecimal(18.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
