package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a temperatura atual em fahrenheit ?: ");
        double fahrenheit = teclado.nextDouble();

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        double celcius = (fahrenheit - AJUSTE) * FATOR;

        System.out.printf("O resultado é %.2f ªC.", celcius);

        teclado.close();
    }
}
