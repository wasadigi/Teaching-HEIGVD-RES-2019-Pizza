package ch.heigvd.res.pizza.domain.Remy;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Ananas implements IProduct {

  public final static String NAME = "Ananas";
  public final static BigDecimal PRICE = new BigDecimal(21.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
