package ch.heigvd.res.pizza.domain.Eric_Noel;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Napoli implements IProduct {

  public final static String NAME = "Napoli";
  public final static BigDecimal PRICE = new BigDecimal(16.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
