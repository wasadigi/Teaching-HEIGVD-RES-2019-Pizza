package ch.heigvd.res.pizza.domain.joshuaGomesDaCosta;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Season4 implements IProduct {

    public final static String NAME = "Season4";
    public final static BigDecimal PRICE = new BigDecimal(20.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
