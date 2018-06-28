package fizzbuzz;

public class JBuzz {
    public static String play(int n)
    {
        if ((n % 3) == 0) {
            return "fizz";
        } else {
            return return_integer(n);
        }
    }

    public static String return_integer(int n)
    {
        return Integer.toString(n);
    }
}
