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

    public static String[] fizzbuzz(String numbers[]) {
        for (String number : numbers) {
            int i = 0;
            if ((Integer.parseInt(number) % 3) == 0) {
                numbers[i] = "fizz";
            } else if(Integer.parseInt(number) % 5 == 0){

            }
        }
    }
}
