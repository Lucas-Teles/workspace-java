import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        } else if (number == 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
}