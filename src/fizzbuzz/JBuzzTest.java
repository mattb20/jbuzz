package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JBuzzTest {
    @Test
    public void fizz3() {
        JBuzz fizzbuzz = new JBuzz();
        String fizz_3 = fizzbuzz.play(3);
        assertEquals("fizz", fizz_3);
    }

}