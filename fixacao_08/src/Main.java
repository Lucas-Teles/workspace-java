import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cachorro Quente - R$ 4,00");
        System.out.println("2 - x-Salada - R$ 4,50");
        System.out.println("3 - X-Bacon - R$ 5,00");
        System.out.println("4 - Torrada simples - R$ 2,00");
        System.out.println("5 - Refrigerante - R$ 1,50");

        System.out.print("Insira o número do produto desejado: ");
        int codigo = sc.nextInt();
        System.out.print("Insira a quantidade: ");
        int quantidade = sc.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Total: R$ " + (double) quantidade * 4.00);
                break;
            case 2:
                System.out.println("Total: R$ " + (double) quantidade * 4.50);
                break;
            case 3:
                System.out.println("Total: R$ " + (double) quantidade * 5.00);
                break;
            case 4:
                System.out.println("Total: R$ " + (double) quantidade * 2.00);
                break;
            case 5:
                System.out.println("Total: R$ " + quantidade * 1.50);
                break;
            default:
                System.out.println("Codigo invalido");
        }
        sc.close();
    }
}