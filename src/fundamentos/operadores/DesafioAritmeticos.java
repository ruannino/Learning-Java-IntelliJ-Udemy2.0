package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double valorA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;
        double supA = valorA / denA;
        double supB = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);

        double superiorAB = Math.pow(supA - supB, 3);
        double inferior = Math.pow(10, 3);

        double total = superiorAB / inferior;
        System.out.println(total);

    }
}
