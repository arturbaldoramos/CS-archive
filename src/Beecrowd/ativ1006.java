import java.io.IOException;
import java.util.Scanner;

public class ativ1006 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("MEDIA = %.1f\n", ((A*2) + (B*3) + (C*5))/10);
        sc.close();
    }

}