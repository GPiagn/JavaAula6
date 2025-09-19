package view;
import business.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        do{
            System.out.println("Tipo de veículo: 1- Carro\n2- Moto");
            op = sc.nextInt();
            if(op > 2 || op < 1 ){
                System.out.println("Opção invalida");
            }
        }while(op >2 || op <1);

        System.out.println("Insira o modelo: ");
        String modelo = sc.next();
        System.out.println("Insira o Fabricante: ");
        String fabricante = sc.next();
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();

        Veiculo a =null;
        switch (op){
            case 1:
                System.out.println("Quantidade de portas:");
                int qtd = sc.nextInt();
                a = new Carro(modelo, fabricante, ano, qtd);
                break;
            case 2:
                a = new Moto(modelo, fabricante, ano);
                break;
        }
        int i = 0;
    while(i!=1) {
        do {
            System.out.println("Escolha o que fazer: \n1- Acelerar\n2- Desacerar\n3- Parar\n4-sair");
            op = sc.nextInt();
            if (op > 4 || op < 1) {
                System.out.println("Opção invalida");
            }
        } while (op > 4 || op < 1);

        switch (op) {
            case 1:
                a.acelerar();
                System.out.println(a.toString());
                break;
            case 2:
                a.desaclerar();
                System.out.println(a.toString());
                break;
            case 3:
                a.parar();
                System.out.println(a.toString());
                break;
            case 4:
                i = 1;
                break;
        }
    }
    }
}