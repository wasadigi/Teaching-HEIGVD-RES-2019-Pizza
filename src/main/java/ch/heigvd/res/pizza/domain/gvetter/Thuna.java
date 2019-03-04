package ch.heigvd.res.pizza.domain.gvetter;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Thuna implements IProduct {

    public final static String NAME = "Thuna";
    public final static BigDecimal PRICE = new BigDecimal(15.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
