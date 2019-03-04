package ch.heigvd.res.pizza.domain.pagedidier;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Diavola implements IProduct {

    public final static String NAME = "Diavola";
    public final static BigDecimal PRICE = new BigDecimal(24.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
