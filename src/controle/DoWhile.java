package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("você precisa falar" +
                    "\nas palavras mágicas...");
            System.out.println("Quer sair? ");
            texto = teclado.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        teclado.close();
    }
}


    // if(...) sentença; ou {}
    // while(...) setença; ou {}
    // for(...; ...; ...) setença; ou {}

    // do senteça; ou {} while(...);