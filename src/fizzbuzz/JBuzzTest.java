package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JBuzzTest {
    JBuzz fizzbuzz = new JBuzz();

    @Test
    public void fizz3() {
        String fizz_3 = fizzbuzz.play(3);
        assertEquals("fizz", fizz_3);
    }
    public void fizz7() {
        int fizz_7 = fizzbuzz.play(7);
        assertEquals(7, fizz_7);
    }

}