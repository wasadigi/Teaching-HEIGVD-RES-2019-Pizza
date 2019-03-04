package ch.heigvd.res.pizza.domain.jzaehrin;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Calabres implements IProduct {

    public final static String NAME = "Calabres Pizza";
    public final static BigDecimal PRICE = new BigDecimal(14.2);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}
