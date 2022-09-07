import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first argument");
        double a1 = input.nextDouble();
        CustomDouble a = new CustomDouble(a1);
        System.out.println("Insert operator(+,-,*,/)");
        char operator = input.next().charAt(0);
        System.out.println("Insert second argument");
        double b1 = input.nextDouble();
        CustomDouble b = new CustomDouble(b1);


        CustomDouble result = new CustomDouble();
        switch (operator){
            case '+':
                result = a.add(b);
                System.out.println(a1 + " " + operator + " " + b1 + " = " + result.toDouble());
                break;
            case '-':
                result = a.subtract(b);
                System.out.println(a1 + " " + operator + " " + b1 + " = " + result.toDouble());
                break;
            case '*':
                result = a.multiply(b);
                System.out.println(a1 + " " + operator + " " + b1 + " = " + result.toDouble());
                break;
            case '/':
                if(b.toDouble() == 0){
                    System.out.println("You can't divide by zero!!!");
                }else {
                    result = a.divide(b);
                    System.out.println(a1 + " " + operator + " " + b1 + " = " + result.toDouble());
                }
                break;
            default:
                System.out.println("invalid operator try again");
        }
    }

}
