import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a, b, c, d, e;
        int somaX, somaY, somaZ;

        a = 10;
        b = 30;
        c = -30;
        d = 0;
        e = 0;

        somaX = a + b;
        somaY = c + a;
        somaZ = d + e;

        System.out.println("SOMA = " + somaX);
        System.out.println("SOMA = " + somaY);
        System.out.println("SOMA = " + somaZ);
    }
}