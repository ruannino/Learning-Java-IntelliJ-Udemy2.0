//2. Criar um programa informa se o ano atual é um ano bissexto;

package controle.estruturasDeControle;

import java.time.Year;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = teclado.nextInt();

        if (Year.isLeap(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        teclado.close();
    }
}
