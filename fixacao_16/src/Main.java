import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        for (int  i = 1; i <= n; i++){
            System.out.print("Insira o valor do intervalo: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20){
                System.out.println(x + " in");
            }else {
                System.out.println(x + " out");
            }
        }
        sc.close();
    }
}