package ch.heigvd.res.pizza.domain.briskocube;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Blue implements IProduct {

    public final static String NAME = "Blue";
    public final static BigDecimal PRICE = new BigDecimal(30.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
