package ch.heigvd.res.pizza.domain.francoisburgener;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Margerita implements IProduct {

  public final static String NAME = "Margerita";
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
