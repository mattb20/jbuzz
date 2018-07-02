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
        for (int i = 0; i < numbers.length; i++) {
            if ((Integer.parseInt(numbers[i]) % 3) == 0) {
                numbers[i] = "fizz";
            } else if(Integer.parseInt(numbers[i]) % 5 == 0){
                numbers[i] = "buzz";
            } else if (Integer.parseInt(numbers[i]) % 15 == 0) {
                numbers[i] = "fizzbuzz";
            }
            return numbers;
        }
        return numbers;
    }
}
