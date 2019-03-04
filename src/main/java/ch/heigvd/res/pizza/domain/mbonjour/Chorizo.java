package ch.heigvd.res.pizza.domain.mbonjour;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Chorizo implements IProduct {

    public final static String NAME = "Chorizo";
    public final static BigDecimal PRICE = new BigDecimal(18.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
            return PRICE;
        }

}
