package ch.heigvd.res.pizza.domain.sjaubain;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Pizza7fromages implements IProduct {

    public final static String NAME = "Pizza 7 fromages";
    public final static BigDecimal PRICE = new BigDecimal(10.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
