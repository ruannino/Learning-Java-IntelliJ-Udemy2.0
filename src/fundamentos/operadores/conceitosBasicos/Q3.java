// 3.Criar um programa que leia o peso e a
// altura do usuário e imprima no console o IMC.

package fundamentos.operadores.conceitosBasicos;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso atual em Kg: ");
        double peso = teclado.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = teclado.nextDouble();

        double incremento = Math.pow(altura, 2);
        double imc  = peso / incremento;

        System.out.printf("Seu IMC atual é de %.2f.", imc);

        teclado.close();
    }
}
