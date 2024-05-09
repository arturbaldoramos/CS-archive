package Beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class ativ1038 {

    public static void main(String[] args) throws IOException {

        class Produto {
            public int codigo;
            public double valor;
            public String especificacao;
        }

        Produto cachorroQuente = new Produto();
        cachorroQuente.codigo = 1;
        cachorroQuente.valor = 4.0;
        cachorroQuente.especificacao = "Cachorro Quente";

        Produto xSalada = new Produto();
        xSalada.codigo = 2;
        xSalada.valor = 4.5;
        xSalada.especificacao = "X-Salada";

        Produto xBacon = new Produto();
        xBacon.codigo = 3;
        xBacon.valor = 5.0;
        xBacon.especificacao = "X-Bacon";

        Produto torradaSimples = new Produto();
        torradaSimples.codigo = 4;
        torradaSimples.valor = 2.0;
        torradaSimples.especificacao = "Torrada simples";

        Produto refrigerante = new Produto();
        refrigerante.codigo = 5;
        refrigerante.valor = 1.5;
        refrigerante.especificacao = "Refrigerante";


        Produto[] Produtos = {cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante};

        Scanner sc = new Scanner(System.in);

        System.out.println("Código do produto: ");
        int cod = sc.nextInt();
        System.out.println("Quantidade do produto: ");
        int quant = sc.nextInt();

        double total = 0;

        for (int i = 0; i < Produtos.length; i++) {
            if (cod == Produtos[i].codigo) {
                total = (Produtos[i].valor * quant);
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            }
        }

        sc.close();
    }

}