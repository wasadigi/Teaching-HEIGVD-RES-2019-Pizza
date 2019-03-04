package ch.heigvd.res.pizza.domain.jzaehrin;

import ch.heigvd.res.pizza.domain.IProduct;

import java.math.BigDecimal;

public class Calabres implements IProduct {

    public String getName() {
        return "Calabres Pizza";
    }

    public BigDecimal getPrice(){
        return 14.2;
    }
}
