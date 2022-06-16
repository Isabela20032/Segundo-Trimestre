import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 100: ");
        int num = entrada.nextInt();

        if(num >= 0 && num <= 100){
            if(num%2 == 0){
                System.out.println("Número par");
            } else if (num%2 != 0) {
                System.out.println("Número impar");
            }
        }else{
            System.out.println("Este número não está entre 0 e 100");
        }
    }
}
