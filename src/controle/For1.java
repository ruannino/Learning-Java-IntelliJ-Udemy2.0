package controle;

public class For1 {

    public static void main(String[] args) {

        for(int contador = 1; contador <= 10; contador++) {
            System.out.printf("i = %d\n", contador);
        }

        int x = 2;
        for(;x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        for(;;) {
            System.out.println("Laço infinito!!!!");
        }
    }
}
