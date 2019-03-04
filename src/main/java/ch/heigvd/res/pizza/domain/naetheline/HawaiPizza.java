package ch.heigvd.res.pizza.domain.naetheline;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

/**
 * Created by nathalie on 04/03/19.
 */
public class HawaiPizza implements IProduct {

    public final static String NAME = "Hawai";
    public final static BigDecimal PRICE = new BigDecimal(18.0);


    public String  getName()
    {
        return NAME;
    }

    public BigDecimal getPrice()
    {
        return PRICE;
    }
}
