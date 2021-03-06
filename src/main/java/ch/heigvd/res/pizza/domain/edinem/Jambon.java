package ch.heigvd.res.pizza.domain.edinem;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Jambon implements IProduct {

  public final static String NAME = "Jambon";
  public final static BigDecimal PRICE = new BigDecimal(19.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
