package Beecrowd;

import java.util.Scanner;

public class ativ1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[6];

        for (int i = 0; i < 6; i++) {
            nums[i] = sc.nextDouble();
        }

        int positiveCount = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                positiveCount++;
            }
        }

        System.out.println( positiveCount+ " valores positivos");

        sc.close();
    }
}
