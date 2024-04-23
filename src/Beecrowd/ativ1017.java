import java.io.IOException;
import java.util.Scanner;

public class ativ1017 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double combustivelGasto = (velocidadeMedia * tempoGasto) / 12.0; // Convertendo para double
        combustivelGasto = Math.round(combustivelGasto * 1000.0) / 1000.0; // Arredondando para três casas decimais
        System.out.printf("%.3f\n", combustivelGasto);

        sc.close();

    }

}
