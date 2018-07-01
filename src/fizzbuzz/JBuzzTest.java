package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    public void will_return_correct_array() {
        String numbers[] = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        JBuzz javabuzz = new JBuzz();
        String game[] = javabuzz.fizzbuzz(numbers);
        String expected[] = new String[]{"1","2","fizz","4","buzz","fizz","7","8","fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"};
        assertArrayEquals(game, expected);
    }

}