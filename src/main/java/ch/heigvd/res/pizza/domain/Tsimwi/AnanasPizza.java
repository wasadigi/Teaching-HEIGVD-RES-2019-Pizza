package ch.heigvd.res.pizza.domain.Tsimwi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class AnanasPizza implements IProduct {

  public final static String NAME = "Ananas Pizza";
  public final static BigDecimal PRICE = new BigDecimal(17.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
