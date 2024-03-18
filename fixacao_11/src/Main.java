import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double salario, imposto;
        System.out.print("Digite o salário em Rombus: ");

        salario = scanner.nextDouble();
        imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento de imposto de renda.");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        } else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }

        if (imposto > 0.0) {
            System.out.printf("Imposto de renda a pagar: R$ %.2f\n", imposto);
        }

        scanner.close();
    }
}