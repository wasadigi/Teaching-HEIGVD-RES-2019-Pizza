package ch.heigvd.res.pizza.domain.Ezehkiel;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Calson implements IProduct {

  public final static String NAME = "Calson";
  public final static BigDecimal PRICE = new BigDecimal(20.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
