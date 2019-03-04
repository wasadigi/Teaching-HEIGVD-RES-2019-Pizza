package ch.heigvd.res.pizza.domain.mullerPierrickHeig;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Crudo implements IProduct {

  public final static String NAME = "Crudo";
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
