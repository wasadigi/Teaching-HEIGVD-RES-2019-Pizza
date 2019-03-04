package ch.heigvd.res.pizza.domain.briskocube;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Fatty implements IProduct {

    public final static String NAME = "Fatty";
    public final static BigDecimal PRICE = new BigDecimal(23.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
