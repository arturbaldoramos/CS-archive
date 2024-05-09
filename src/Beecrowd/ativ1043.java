package Beecrowd;

import java.util.Scanner;

public class ativ1043 {

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        scanner.close();
    }
}
