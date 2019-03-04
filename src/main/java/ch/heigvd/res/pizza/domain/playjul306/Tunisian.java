package ch.heigvd.res.pizza.domain.playjul306;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Tunisian implements IProduct {

  public final static String NAME = "Tunisian";
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
