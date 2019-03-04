package ch.heigvd.res.pizza.domain.ecarpita93;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class romana implements IProduct {

    public final static String NAME = "romana";
    public final static BigDecimal PRICE = new BigDecimal(16.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}