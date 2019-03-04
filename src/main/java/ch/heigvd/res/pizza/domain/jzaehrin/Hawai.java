package ch.heigvd.res.pizza.domain.jzaerin;

import ch.heigvd.res.pizza.domain.wasadigi.IProduct;

import java.math.BigDecimal;

public class Hawai implements IProduct {

    public final static String NAME = "Hawai Pizza";
    public final static BigDecimal PRICE = new BigDecimal(15);

    public String getName() {
        return NAME;
    }

    public BigDecimal getPrice(){
        return PRICE;
    }
}
