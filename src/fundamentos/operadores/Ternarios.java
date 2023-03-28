package fundamentos.operadores;

import java.sql.SQLOutput;

public class Ternarios {

    public static void main(String[] args) {

        double media = 3.6;

        String resultadoParcial = media >= 5.0 ?
                "em Recuperação" : "Reprovado";
        String resultadoFinal = media >= 7.0 ?
                "Aprovado" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal + ".");

        boolean bomComportamento = true;
        boolean passouPorMedia = media >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoAB = temDesconto ? "Sim." : "Não.";

        System.out.printf("Tem desconto ? %s", resultadoAB);
    }
}
