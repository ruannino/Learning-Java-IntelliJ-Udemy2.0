// 2.Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

package fundamentos.operadores.conceitosBasicos;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celcius? ");
        double tempC = teclado.nextDouble();

        final double FATOR = 9.0 / 5.0;
        final double AJUSTE = 32;
        double tempF = tempC * FATOR + AJUSTE;

        System.out.printf("A temperatura em graus fahrenheit é %.2f Fº.", tempF);

        teclado.close();
    }
}
