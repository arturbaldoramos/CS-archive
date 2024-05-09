package Beecrowd;

import java.util.Scanner;

public class ativ1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo1 = scanner.nextLine();
        String tipo2 = scanner.nextLine();
        String tipo3 = scanner.nextLine();

        if (tipo1.equals("vertebrado")) {
            if (tipo2.equals("ave")) {
                if (tipo3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (tipo3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (tipo2.equals("mamifero")) {
                if (tipo3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (tipo3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (tipo1.equals("invertebrado")) {
            if (tipo2.equals("inseto")) {
                if (tipo3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (tipo3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (tipo2.equals("anelideo")) {
                if (tipo3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (tipo3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        scanner.close();
    }
}
