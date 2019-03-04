package ch.heigvd.res.pizza.domain.boosterloop;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Romana implements IProduct {

    public final static String NAME = "Romana";
    public final static BigDecimal PRICE = new BigDecimal(15.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
