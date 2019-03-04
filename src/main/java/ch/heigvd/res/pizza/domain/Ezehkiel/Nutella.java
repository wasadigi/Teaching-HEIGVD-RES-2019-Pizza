package ch.heigvd.res.pizza.domain.Ezehkiel;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Nutella implements IProduct {

  public final static String NAME = "Nutella";
  public final static BigDecimal PRICE = new BigDecimal(17.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
