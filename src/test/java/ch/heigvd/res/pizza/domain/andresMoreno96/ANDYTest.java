package ch.heigvd.res.pizza.domain.andresMoreno96;

import ch.heigvd.res.pizza.domain.andresMoreno96.ANDY;
import ch.heigvd.res.pizza.protocol.GreetingsRequest;
import ch.heigvd.res.pizza.protocol.GreetingsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ANDYTest {

  @Test
  void ANDYShouldReplyToGreetings() {
    ANDY luigi = new ANDY();
    GreetingsRequest request = new GreetingsRequest("Hi there");
    GreetingsResponse response = luigi.greet(request);
    assertEquals("hello, how can I help you?", response.getText());
  }

}