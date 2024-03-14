import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if ( a >= b && a % b == 0){
            System.out.println("Sao multiplos");
        } else if (b >= a && b % a == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Não sao multiplos");
        }
        sc.close();
    }
}