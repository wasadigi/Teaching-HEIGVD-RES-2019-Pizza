package ch.heigvd.res.pizza.domain.lougranou;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Mascarpone implements IProduct {

  public final static String NAME = "Mascarpone";
  public final static BigDecimal PRICE = new BigDecimal(19.50);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
