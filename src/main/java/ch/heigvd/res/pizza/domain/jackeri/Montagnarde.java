package ch.heigvd.res.pizza.domain.jackeri;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Montagnarde implements IProduct {

    public final static String NAME = "Montagnarde";
    public final static BigDecimal PRICE = new BigDecimal(19.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}