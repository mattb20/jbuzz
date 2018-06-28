package fizzbuzz;

public class JBuzz {
    public static String play(int n)
    {
        if ((n % 3) == 0) {
            return "fizz";
        } else {
            return "You lost";
        }
    }
}
