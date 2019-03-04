package ch.heigvd.res.pizza.domain.petit1suisse;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Wasadigi  implements IProduct {

    public final static String NAME = "Wasadigi";
    public final static BigDecimal PRICE = new BigDecimal(23.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
