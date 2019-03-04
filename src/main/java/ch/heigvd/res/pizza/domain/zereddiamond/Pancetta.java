package ch.heigvd.res.pizza.domain.zereddiamond;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Pancetta implements IProduct {

  public final static String NAME = "Pancetta";
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
