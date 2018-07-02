package fizzbuzz;

public class JBuzz {
    public static String play(int n)
    {
        if ((n % 15) == 0) {
            return "fizzbuzz";
        } else if((n % 3) == 0) {
            return "fizz";

        } else {
            return return_integer(n);
        }
    }

    public static String return_integer(int n)
    {
        return Integer.toString(n);
    }

    public static String[] jbuzz(String numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            if ((Integer.parseInt(numbers[i]) % 15) == 0) {
                System.out.println(numbers[i]);
                numbers[i] = "fizzbuzz";
            } else if(Integer.parseInt(numbers[i]) % 5 == 0){
                numbers[i] = "buzz";
            } else if (Integer.parseInt(numbers[i]) % 3 == 0) {
                numbers[i] = "fizz";
            }
            return numbers;
        }
        return numbers;
    }
}
