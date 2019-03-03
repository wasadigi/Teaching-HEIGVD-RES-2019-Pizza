package ch.heigvd.res.pizza.protocol;

import lombok.Data;

@Data
public class GreetingsResponse implements IMessage {

  private final String text;

}
