package br.edu.iftm.rpgjava.testes;

import br.edu.iftm.rpgjava.classes.*;

import java.util.Random;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int valorAl = random.nextInt(100);

        Armadura armG = new Armadura("Armadura de prata", 54, 52, 70);
        Armadura armA = new Armadura("Armadura Acolchoada", 8, 25, 25);
        Armadura armM = new Armadura("Cota de Talas", 52, 60, 45);

        Arma maG = new Arma("Adaga", 54, 70);
        Arma maA = new Arma("Arco", 58, 90);
        Arma maM = new Arma("Alabarda", 55, 50);


        System.out.println("Vamos criar o Guerreiro");
        System.out.print("Digite o nome do Guerreiro: ");
        String nomeg = entrada.next();
        Guerreiro g = new Guerreiro(nomeg,25, 50,20, 20, 5, 70, 100, 69, 70, 0);
        g.setArmadura(armG);
        g.setArma(maG);

        System.out.println("Vamos criar o Arqueiro");
        System.out.print("Digite o nome do Arqueiro: ");
        String nomea = entrada.next();
        Arqueiro a = new Arqueiro(nomea,25, 50,20, 20, 5, 70, 100, 69, 70, 0);
        a.setArmadura(armA);
        a.setArma(maA);


        System.out.println("Vamos criar o mago");
        System.out.print("Digite o nome do Mago ");
        String nomem = entrada.next();
        Mago m = new Mago(nomem,30, 40,85, 95, 50, 60, 100, 40, 54, 85);
        m.setArmadura(armM);
        m.setArma(maM);


        //Hora dos combates
        Random dado = new Random();

        int round  = 1;



        while( (g.getVida() > 0 && a.getVida() > 0)|| (g.getVida() > 0 && m.getVida() > 0) || (a.getVida() > 0 && m.getVida() > 0)){
            System.out.println("Oponente 1: " + g.getNome());
            System.out.println("Oponente 2: " + a.getNome());
            System.out.println("Oponente 3: " + m.getNome());

            System.out.println("\nRound: " + round);
            System.out.println("Primeiro jogardor: Guerreiro");
            System.out.println("Qual oponente deseja atacar: Arqueiro ou Mago");
            String oponente = entrada.next();

            if (oponente == "Arqueiro" || oponente == "arqueiro") {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, armG.calculaDefesa(a.getResistencia()));
                a.defender(valorAtaque);


                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = g.atacar(valorDado, valorAtaque);
                g.defender(valorAtaque);




            } else if (oponente == "Mago" || oponente == "mago") {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = g.atacar(valorDado, armG.calculaDefesa(m.getResistencia()));
                m.defender(valorAtaque);


                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = g.atacar(valorDado, valorAtaque);
                g.defender(valorAtaque);
            }

            //Segundo turno
            System.out.println("\nRound: " + round);
            System.out.println("Segundo jogardor: Arqueiro");
            System.out.println("Qual oponente deseja atacar. Guerreiro ou Mago");
            oponente = entrada.next();

            if (oponente == "Guerreiro" || oponente == "guerreiro") {










                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, armG.calculaDefesa(g.getResistencia()));
                g.defender(valorAtaque);


                valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                valorAtaque = a.atacar(valorDado, valorAtaque);
                a.defender(valorAtaque);

                if(m.getVida() <= 0){
                    System.out.println(m.getNome() + " morreu!");
                    m = new Mago();
                }
                if(g.getVida() <= 0){
                    System.out.println(g.getNome() + " morreu!");
                    g = new Guerreiro();
                }
                if(a.getVida() <= 0) {
                    System.out.println(a.getNome() + " morreu!");
                    a = new Arqueiro();
                }

            } else if (oponente == "Mago" || oponente == "mago") {

                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = a.atacar(valorDado, m.getResistencia());
                m.defender(valorAtaque);
                if(m.getVida() <= 0){
                    System.out.println(m.getNome() + " morreu!");
                    m = new Mago();
                }
                if(g.getVida() <= 0){
                    System.out.println(g.getNome() + " morreu!");
                    g = new Guerreiro();
                }
                if(a.getVida() <= 0) {
                    System.out.println(a.getNome() + " morreu!");
                    a = new Arqueiro();
                }
            }

            //Terceiro turno
            System.out.println("\nRound: " + round);
            System.out.println("Terceiro jogardor: Mago");
            System.out.println("Qual oponente deseja atacar. Arqueiro ou Guerreiro");
            oponente = entrada.next();


            if (oponente == "Arqueiro" || oponente == "arqueiro") {




                if(m.getVida() <= 0){
                    System.out.println(m.getNome() + " morreu!");
                    m = new Mago();
                }
                if(g.getVida() <= 0){
                    System.out.println(g.getNome() + " morreu!");
                    g = new Guerreiro();
                }
                if(a.getVida() <= 0) {
                    System.out.println(a.getNome() + " morreu!");
                    a = new Arqueiro();
                }
            } else if (oponente == "Guerreiro" || oponente == "guerreiro") {
                //code
                int valorDado = dado.nextInt(6);
                System.out.println("Valor do dado: " + valorDado);
                int valorAtaque = m.atacar(valorDado, g.getResistencia());
                g.defender(valorAtaque);
                if(m.getVida() <= 0){
                    System.out.println(m.getNome() + " morreu!");
                    m = new Mago();
                }
                if(g.getVida() <= 0){
                    System.out.println(g.getNome() + " morreu!");
                    g = new Guerreiro();
                }
                if(a.getVida() <= 0) {
                    System.out.println(a.getNome() + " morreu!");
                    a = new Arqueiro();
                }
            }else{
            System.out.println("Personagem invalido");
            }
            round++;

        }
    }
}