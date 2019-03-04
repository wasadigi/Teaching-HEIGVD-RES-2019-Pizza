package ch.heigvd.res.pizza.domain.Cell00phane;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Funghi implements IProduct {

    public final static String NAME = "Funghi";
    public final static BigDecimal PRICE = new BigDecimal(14.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
