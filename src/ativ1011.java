import java.io.IOException;
import java.util.Scanner;

public class ativ1011 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double RAIO = sc.nextDouble();
        double PI = 3.14159;

        System.out.printf("VOLUME = %.3f\n", ( ((4/3.0) * PI) * (RAIO * RAIO * RAIO)));
        sc.close();
    }

}  