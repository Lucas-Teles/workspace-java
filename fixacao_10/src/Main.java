import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double  x, y;

        System.out.println("Escolha o valor de x: ");
        x = sc.nextDouble();
        System.out.println("Escolha o valor de y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Q2");
        }

        Scanner.close();

    }
}