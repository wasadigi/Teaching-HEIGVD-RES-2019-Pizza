package ch.heigvd.res.pizza.protocol;

import lombok.Data;

@Data
public class GreetingsRequest implements IMessage {

  private final String text;

}
