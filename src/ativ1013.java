import java.io.IOException;
import java.util.Scanner;

public class ativ1013 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int highestNumber = 0;
        int[] numbers = {A,B,C};

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] > highestNumber){
                highestNumber = numbers[i];
            };
        };

        System.out.printf("%d eh o maior\n", highestNumber);

        sc.close();
    }

}