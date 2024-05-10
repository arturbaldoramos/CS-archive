package Beecrowd;

import java.util.Scanner;

public class ativ1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float renda = sc.nextFloat();

         if (renda <= 2000) {
             System.out.println("Isento");
         } else if (renda > 2000 && renda <= 3000) {
             System.out.printf("R$ %.2f\n", ((renda-2000)*0.08));
         } else if (renda > 3000 && renda <= 4500) {
             System.out.printf("R$ %.2f\n", ((1000*0.08)+(renda-3000)*0.18));
         } else if (renda > 4500) {
             System.out.printf("R$ %.2f\n", ((1000*0.08)+(1500*0.18)+(renda-4500)*0.28));
         }

         sc.close();
    }
}

