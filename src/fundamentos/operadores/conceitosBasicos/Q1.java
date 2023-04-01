//1.Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

package fundamentos.operadores.conceitosBasicos;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit: ");
        double tempF = teclado.nextDouble();

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        double tempC = (tempF - AJUSTE) * FATOR;

        System.out.printf("A temperatura em graus celcius é %.2f Cº.", tempC);

        teclado.close();
    }
}
