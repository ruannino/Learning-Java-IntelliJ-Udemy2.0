package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        // Operador Unário
        boolean maisSaudavel = !sorvete;

        System.out.println("Comprou TV50 ? : " + tv50);
        System.out.println("Comprou TV32 ? : " + tv32);
        System.out.println("Comprou Sorvete ? : " + sorvete);
        System.out.println("Mais saudável ? " + maisSaudavel);

    }
}
