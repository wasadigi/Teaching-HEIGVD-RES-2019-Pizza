package ch.heigvd.res.pizza.domain.lionelburgbach;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Lard implements IProduct {

  public final static String NAME = "Margherita";
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
