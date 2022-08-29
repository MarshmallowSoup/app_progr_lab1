import java.util.Arrays;
import java.util.Scanner;

public class StringCheck {

    static int countCharInString(String str, char c) {
        int total_count_of_characters = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == c) {
                total_count_of_characters++;
            }
        }
        return total_count_of_characters;
    }

    static void sortStringArray(String[] str, char c) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                String tmp = "";
                if (countCharInString(str[i], c) < countCharInString(str[j], c)) {
                    tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                } else if (countCharInString(str[i], c) == countCharInString(str[j], c)) {
                    if (str[i].length() > str[j].length()) {
                        tmp = str[i];
                        str[i] = str[j];
                        str[j] = tmp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type character: ");
        char c = in.next().charAt(0);

        String[] str_arr = {"Dog", "Cat", "Fish", "Turtle", "Penguin"};
        System.out.println("Array before sort: " + Arrays.toString(str_arr));

        sortStringArray(str_arr, c);

        System.out.println("Array after sort: " + Arrays.toString(str_arr));
    }
}