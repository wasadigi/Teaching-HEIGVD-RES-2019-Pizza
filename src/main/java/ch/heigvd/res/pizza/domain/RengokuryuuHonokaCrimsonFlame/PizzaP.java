package ch.heigvd.res.pizza.domain.wasadigi;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class PizzaP implements IProduct {

  public final static String NAME = "Pizza P";
  public final static BigDecimal PRICE = new BigDecimal(5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
