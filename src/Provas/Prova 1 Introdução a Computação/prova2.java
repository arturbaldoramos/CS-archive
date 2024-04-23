import java.util.Scanner;

public class prova2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Setor1 = "C";
        String Setor2 = "E";
        String Setor3 = "A";

        String INPUT = scanner.next();
        String upperCaseInput = INPUT.toUpperCase();

        if(upperCaseInput.equals(Setor1)){
            System.out.println("Setor Casual");
        }
        else if(upperCaseInput.equals(Setor2)){
            System.out.println("Setor Esportivo");
        }
        else if(upperCaseInput.equals(Setor3)){
            System.out.println("Setor Moda Alternativa");
        }
        else {
            System.out.println("Entrada Inválida");
        }

    }
}
