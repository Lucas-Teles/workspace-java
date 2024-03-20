import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do combustivel desejado");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Sair");

        int option = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (option != 4){

            if (option == 1){
                alcool += 1;
            } else if (option == 2) {
                gasolina += 1;
            } else if (option == 3) {
                diesel += 1;
            } else {
                System.out.println("Codigo invalido digite novamente");
            }

            System.out.println("Digite o codigo do combustivel desejado");
            System.out.println("1 - Alcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Sair");

            option = sc.nextInt();
        }
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("Muito obrigado");
    }
}