import java.util.Arrays;

public class FizzBuzz {
        public static void main(String[] args){
            String[] strArr = fizzBuzz();
            System.out.println(Arrays.toString(strArr));
        }

        public static String[] fizzBuzz() {
            String[] results = new String[101];
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 5 == 0) {
                    results[i] ="Buzz";
                } else if (i % 3 == 0) {
                    results[i] ="Fizz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }
            return results;
        }
}
