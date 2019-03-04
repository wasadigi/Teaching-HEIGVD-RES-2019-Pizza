package ch.heigvd.res.pizza.domain.jzaerin;

import ch.heigvd.res.pizza.domain.wasadigi.IProduct;


import java.math.BigDecimal;

public class Calabres implements IProduct {

    public String getName() {
        return "Hawai Pizza";
    }

    public BigDecimal getPrice(){
        return 15;
    }
}
