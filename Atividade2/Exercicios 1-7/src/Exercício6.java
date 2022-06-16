import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        while(i <= 10){
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();

            double raiz = Math.sqrt(num);

            System.out.println("A raiz quadrada deste número é " + raiz);

            i++;
        }

    }
}
