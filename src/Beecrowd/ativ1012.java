import java.util.Scanner;

public class ativ1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        float a = (A * C) / 2;
        double b = (3.14159 * (C * C));
        float c = ((A + B) * C) / 2;
        float d = B * B;
        float e = A * B;

        System.out.printf("TRIANGULO: %.3f%n", a);
        System.out.printf("CIRCULO: %.3f%n", b);
        System.out.printf("TRAPEZIO: %.3f%n",c);
        System.out.printf("QUADRADO: %.3f%n",d);
        System.out.printf("RETANGULO: %.3f%n", e);
        scanner.close();
    }
}