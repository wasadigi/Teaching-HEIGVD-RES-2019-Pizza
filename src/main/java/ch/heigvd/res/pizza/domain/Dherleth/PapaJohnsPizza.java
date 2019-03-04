package ch.heigvd.res.pizza.domain.Dherleth;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class PapaJohnsPizza implements IProduct {

  public final static String NAME = "Papa John's Pizza";
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
