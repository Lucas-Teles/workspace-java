import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        while( x != 0 && y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();

        }

        sc.close();
    }
}