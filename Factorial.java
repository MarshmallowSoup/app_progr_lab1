public class Factorial {
    static int IterFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    static int RecFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * RecFactorial(number - 1);
        }
    }

    public  void main(String[] args) {
        int num = 4;
        if (IterFactorial(num) == RecFactorial(num)){
        System.out.println("Loop method  = " + IterFactorial(num) + " and equals to recursional:  " + RecFactorial(num));
        } else{
            System.out.println("there are problems with calculation");
        }
    }
}
