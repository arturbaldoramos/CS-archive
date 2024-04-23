import java.io.IOException;
import java.util.Scanner;

public class ativ1010 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int codPeca1, quantPeca1, codPeca2, quantPeca2;
        double valorUniPeca1, valorUniPeca2, totalPagar;

        codPeca1 = sc.nextInt();
        quantPeca1 = sc.nextInt();
        valorUniPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        quantPeca2 = sc.nextInt();
        valorUniPeca2 = sc.nextDouble();

        totalPagar = (quantPeca1*valorUniPeca1) + (quantPeca2*valorUniPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

        sc.close();

    }

}