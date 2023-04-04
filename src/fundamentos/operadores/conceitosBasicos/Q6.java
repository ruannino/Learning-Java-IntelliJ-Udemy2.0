// 6.Criar um programa que resolve equações
// do segundo grau (ax2 + bx + c = 0) utilizando
// a fórmula de Bhaskara. Use como exemplo a = 1,
// b = 12 e c = -13. Encontre o delta

package fundamentos.operadores.conceitosBasicos;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Equação: ax² + bx = c :");

        System.out.println("\nDigite o valor de A: ");
        int a = teclado.nextInt();

        System.out.println("\nDigite o valor de B: ");
        int b = teclado.nextInt();

        System.out.println("\nDigite o valor de C: ");
        int c = teclado.nextInt();

        int delta = (b * b) - (4 * a * c);
        System.out.printf("\nSua equação é: %dx² + %dx + %d = 0 .", a, b, c);

        System.out.println("\n\nO delta é: " + delta);

        double x1 = (-b - Math.sqrt(delta) / (2 * a));
        System.out.printf("\n\nO x1 da equação é: %.2f.", x1);

        double x2 = (-b + Math.sqrt(delta) / (2 * a));
        System.out.printf("\n\nO x2 da equação é: %.2f.", x2);

        teclado.close();
    }
}
