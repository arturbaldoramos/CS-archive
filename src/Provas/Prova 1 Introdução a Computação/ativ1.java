import java.util.Scanner;

public class ativ1{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira multa");
        int multa1 = scanner.nextInt();
        System.out.println("Segunda multa");
        int multa2 = scanner.nextInt();
        System.out.println("Terceira multa");
        int multa3 = scanner.nextInt();

        if(multa1  == 0|| multa2 ==0|| multa3 == 0){
            System.out.println("Nenhuma multa pode ter valor zero");
            System.exit(0);
        }

        System.out.println("\n\n Menu de Operações - digite o número da opção para realizar a ação \n\n 0) Multa mais alta \n 1) Multa mais baixa \n 2) Imprimir multas em order crescente \n 3) Média das multas pagas");

        switch (scanner.nextInt()) {
            case 0:
                System.out.println("Opção 0");
                int multaMaisAlta = 0;
                if(multa1 > multaMaisAlta){
                    multaMaisAlta = multa1;
                }
                if (multa2 > multaMaisAlta) {
                    multaMaisAlta = multa2;
                }
                if (multa3 > multaMaisAlta) {
                    multaMaisAlta = multa3;
                }
                System.out.println("\nMulta mais alta: " + multaMaisAlta +" reais");
                break;
            case 1:
                System.out.println("Opção 1");
                int multaMaisBaixa = 0;
                if(multa1 > multaMaisBaixa){
                    multaMaisBaixa = multa1;
                }
                if (multa2 < multaMaisBaixa) {
                    multaMaisBaixa = multa2;
                }
                if (multa3 < multaMaisBaixa) {
                    multaMaisBaixa = multa3;
                }
                System.out.println("\nMulta mais baixa: " + multaMaisBaixa +" reais");
                break;
            case 2:
                System.out.println("Opção 2");

                break;
            case 3:
                System.out.println("Opção 3");
                System.out.printf("Média das multas: %f", (multa1+multa2+multa3)/3);
                break;
        }
    }
}
