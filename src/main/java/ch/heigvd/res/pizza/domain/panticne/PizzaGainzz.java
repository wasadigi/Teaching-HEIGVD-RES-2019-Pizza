package ch.heigvd.res.pizza.domain.panticne;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class PizzaGainzz implements IProduct {

    public final static String NAME = "PizzaGainzz";
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
