package ch.heigvd.res.pizza.domain.jackeri;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Calzone implements IProduct {

    public final static String NAME = "Calzone";
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
