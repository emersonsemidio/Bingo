package br.com.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    int numeroAleatorio = 0;


    public static void main(String[] args) {
        int numeroJogadores = 1;
        int numeroGerado =0;
        List<Jogador> jogadores = new ArrayList<>();

        Sacola sacola = new Sacola();
        Sorteador sorteador = new Sorteador();
        Cartela cartela = new Cartela();
        Jogador jogador = new Jogador();

        jogadores = jogador.criarJogadores(numeroJogadores);

        for(int i=0; i<numeroJogadores; i++){
            jogadores.get(i).guardarCartelas(new Cartela());
            jogadores.get(i).imprimirCartelasDosJogadores();
        }

        boolean fim = false;
        int vencedor = -1;
        for(int i=1; i<=75; i++){
            if (fim) {
                break;
            }
            numeroGerado = sacola.pegarUmNumero(i);
            for(int j=0; j<jogadores.size(); j++){
                if(jogadores.get(j).ouvir(numeroGerado)){
                    System.out.println("Jogador " + j + " Pontuou");
                }
                if (jogadores.get(j).pontuacao == 24) {
                    fim = true;
                    vencedor = j;
                    break;
                }
            }
        }

        System.out.println("O jogador ganhador foi " + vencedor);




    }
}
