import java.io.IOException;
import java.util.Scanner;

public class ativ1014 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int kmPercorrido = sc.nextInt();
        double totalCombustivel = sc.nextDouble();

        System.out.printf("%.3f km/l\n", (kmPercorrido/totalCombustivel));

        sc.close();

    }

}