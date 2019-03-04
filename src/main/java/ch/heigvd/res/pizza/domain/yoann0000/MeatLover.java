package ch.heigvd.res.pizza.domain.yoann0000;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class MeatLover implements IProduct {

  public final static String NAME = "Meat Lover's Pizza";
  public final static BigDecimal PRICE = new BigDecimal(19.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
