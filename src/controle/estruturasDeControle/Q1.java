//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

package controle.estruturasDeControle;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:  ");
        int numero = teclado.nextInt();

        if (numero >= 0 && numero <= 10 &&  numero % 2 == 0) {
            System.out.println("O número está entre 0 e 10 e é par: ");
        } else {
            System.out.println("O número não está entre 0 e 10 ou não é par!");
        }

        teclado.close();
    }
}
