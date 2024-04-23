import java.io.IOException;
import java.util.Scanner;

public class ativ1003 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.printf("SOMA = %d\n", (A+B));

        sc.close();

    }

}