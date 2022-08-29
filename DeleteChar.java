import java.util.Scanner;

public class DeleteChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type string: ");
        String str = in.next();

        System.out.println("Type character to remove: ");
        char c = in.next().charAt(0);
        char e = Character.MIN_VALUE; // empty char

        str = str.replace(c,e);

        System.out.println("c =  " + c);

        System.out.println("String after deleting: " + str);
    }
}
