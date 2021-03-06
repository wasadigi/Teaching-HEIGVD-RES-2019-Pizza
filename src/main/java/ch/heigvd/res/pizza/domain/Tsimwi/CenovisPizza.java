package ch.heigvd.res.pizza.domain.Tsimwi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class CenovisPizza implements IProduct {

  public final static String NAME = "Cenovis Pizza";
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
