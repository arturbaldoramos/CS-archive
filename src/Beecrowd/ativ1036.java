import java.io.IOException;
import java.util.Scanner;

public class ativ1036 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (b*b - (4*a*c));

        if(a == 0.0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else {

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("R1 = %.5f%n", r1);
        System.out.printf("R2 = %.5f%n", r2);
        }

        sc.close();
    }

}