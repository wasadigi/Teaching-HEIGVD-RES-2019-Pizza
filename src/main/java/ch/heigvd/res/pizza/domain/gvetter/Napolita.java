package ch.heigvd.res.pizza.domain.gvetter;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Napolita implements IProduct {

    public final static String NAME = "Napolita";
    public final static BigDecimal PRICE = new BigDecimal(13.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
