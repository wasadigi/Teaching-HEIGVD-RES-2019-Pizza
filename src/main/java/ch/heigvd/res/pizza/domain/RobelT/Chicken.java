package ch.heigvd.res.pizza.domain.RobelT;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Chicken implements IProduct {

    public final static String NAME = "Chicken";
    public final static BigDecimal PRICE = new BigDecimal(25.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
