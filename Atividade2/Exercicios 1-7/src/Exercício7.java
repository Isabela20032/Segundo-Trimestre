import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que você deseja: ");
        int num = entrada.nextInt();

        int i = 1;

        int soma = 0 ;

        while(i <= num){
            System.out.print("Digite um valor: ");
            int valor = entrada.nextInt();

            if(valor%3 == 0){
                soma = soma + valor;
            }
            i++;
        }
        float media = (float) soma/num;
        System.out.println("A média entre esses números é: " + media);

    }
}
