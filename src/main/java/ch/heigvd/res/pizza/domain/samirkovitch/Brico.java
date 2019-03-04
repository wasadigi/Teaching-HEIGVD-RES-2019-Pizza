package ch.heigvd.res.pizza.domain.samirkovitch;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Brico implements IProduct {

  public final static String NAME = "Brico";
  public final static BigDecimal PRICE = new BigDecimal(12.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
