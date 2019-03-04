package ch.heigvd.res.pizza.domain.SamuelMettler;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class TresBonne implements IProduct {

  public final static String NAME = "TresBonne";
  public final static BigDecimal PRICE = new BigDecimal(26.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
