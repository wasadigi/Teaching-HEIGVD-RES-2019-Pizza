package ch.heigvd.res.pizza.domain.MichaelDaSilva;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Raclette implements IProduct {

  public final static String NAME = "Raclette";
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
