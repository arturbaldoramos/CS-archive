import java.io.IOException;
import java.util.Scanner;
public class ativ1005 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        System.out.printf("MEDIA = %.5f\n", (((A*3.5)+(B*7.5))/11));

        sc.close();
    }

}