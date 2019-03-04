package ch.heigvd.res.pizza.domain.mtutic;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Jambon implements IProduct {

  public final static String NAME = "Jambon";
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
