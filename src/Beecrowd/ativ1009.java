import java.io.IOException;
import java.util.Scanner;

public class ativ1009 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", (salario+(vendas*0.15)));
        sc.close();
    }

}