import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int correctPass = 2002;

        System.out.println("Insira a senha: ");
        int pass = sc.nextInt();

        while (pass != correctPass){
            System.out.println("Senha Invalida");
            pass = sc.nextInt();
        }
        sc.close();
        System.out.println("Acesso Permitido");

    }
}