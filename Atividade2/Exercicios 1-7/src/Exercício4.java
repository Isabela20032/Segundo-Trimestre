import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        int x = 0;
        int i = 1;
        while(x <= 20){
            if (num % i == 0) {
                x++;
                System.out.print(i + " ");
            }
            i++;
        }
    }
}