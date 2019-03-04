package ch.heigvd.res.pizza.domain.ercclpn;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class SuperHotPizza implements IProduct {

  public final static String NAME = "SuperHotPizza";
  public final static BigDecimal PRICE = new BigDecimal(27.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
