import java.io.IOException;
import java.util.Scanner;

public class ativ1002 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double PI = 3.14159;

        System.out.printf("A=%.4f\n", (PI*(A*A)));

        sc.close();

    }

}