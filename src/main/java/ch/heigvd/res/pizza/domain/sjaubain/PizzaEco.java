package ch.heigvd.res.pizza.domain.sjaubain;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class PizzaEco implements IProduct {

    public final static String NAME = "Pizza bon marche";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
