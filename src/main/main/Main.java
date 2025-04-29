package main;

import java.util.Scanner;

import model.Veiculo;
import model.CarroPasseio;
import model.Caminhao;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        CarroPasseio carro = new CarroPasseio();
        Caminhao caminhao = new Caminhao();
        boolean fim = false;
        int a = 0;

        while (fim == false) {
            System.out.println("Digite o que quer fazer: \n 1) Entrada de dados carro \n 2) Entrada de dados Caminhão \n 3) Imprimir dados \n 4) Sair");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    a = 1;
                    carro.leitura();
                    break;
                case 2:
                    a = 2;
                    caminhao.leitura();
                    break;
                case 3:
                    if (a == 1) {
                        carro.imprimir();
                    } else if (a == 2) {
                        caminhao.imprimir();
                    } else {
                        System.out.println("Nenhum dado foi encontrado!");
                    }
                    break;
                case 4:
                    fim = true;
                    break;
            }
        }
    }
}
