import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = entrada.nextInt();

        int f = 1;

        int i = 1;
        while ( i <= num){
            f = f * i;
            i++;
        }

        System.out.println(num + "! = " + f);
    }
}