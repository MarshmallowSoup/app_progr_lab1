import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first argument");
        double a1 = input.nextDouble();
        CustomDouble a = new CustomDouble(a1);
        System.out.println("Insert second argument");
        double b1 = input.nextDouble();
        CustomDouble b = new CustomDouble(b1);
        System.out.println("Insert operator(+,-,*,/)");
        char operator = input.next().charAt(0);


        CustomDouble result = new CustomDouble();

        if (operator == '+'){ result = a.sum(b);}
        else if(operator == '-'){result = a.subtraction(b);}
        else if(operator == '*'){result = a.multiplication(b);}
        else if(operator == '/'){result = a.division(b);}
        else{System.out.println("Try again after restart");}

        System.out.println(a1 + " " + operator + " " + b1 + " = " + result.toDouble());

    }

}
