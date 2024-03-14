import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.print("Insira a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        }
        sc.close();
    }
}