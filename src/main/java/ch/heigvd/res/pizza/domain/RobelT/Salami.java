package ch.heigvd.res.pizza.domain.RobelT;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Salami implements IProduct {

    public final static String NAME = "Salami";
    public final static BigDecimal PRICE = new BigDecimal(18.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
