package ch.heigvd.res.pizza.domain;

import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import ch.heigvd.res.pizza.protocol.OrderRequest;
import ch.heigvd.res.pizza.protocol.OrderResponse;

import java.math.BigDecimal;

public class Calabres implements IProduct {

    public String getName() {
        return "Calabres Pizza";
    }

    public BigDecimal getPrice(){
        return 14.2;
    }
}
