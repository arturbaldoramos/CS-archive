import java.io.IOException;
import java.util.Scanner;

public class ativ1008 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int funcionarioNumero = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", funcionarioNumero, (horasTrabalhadas*valorHora));
        sc.close();
    }

}