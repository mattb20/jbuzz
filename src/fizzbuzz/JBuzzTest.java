package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JBuzzTest {
    JBuzz fizzbuzz = new JBuzz();

    @Test
    public void will_fizz3() {
        String fizz_3 = fizzbuzz.play(3);
        assertEquals("fizz", fizz_3);
    }
    public void will_return7() {
        String number_7 = fizzbuzz.play(7);
        assertEquals(7, number_7);
    }
    public void will_fizz_buzz15() {
        String fizz_buzz15 = fizzbuzz.play(15);
        assertEquals("fizzbuzz", fizz_buzz15);
    }

}