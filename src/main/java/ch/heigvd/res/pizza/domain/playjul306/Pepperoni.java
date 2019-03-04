package ch.heigvd.res.pizza.domain.playjul306;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Pepperoni implements IProduct {

  public final static String NAME = "Pepperoni";
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
