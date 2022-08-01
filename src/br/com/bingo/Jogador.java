package br.com.bingo;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    List<Cartela> cartelas = new ArrayList<>();
    public int pontuacao =0;

    public void guardarCartelas(Cartela card){
        cartelas.add(card);
    }

    public List<Jogador> criarJogadores(int numeroJogadores){
          List<Jogador> jogadores = new ArrayList();

          for(int i=0; i<numeroJogadores; i++){
              jogadores.add(new Jogador());
          }

          return jogadores;
    }

    public boolean ouvir(int numeroAleatorio){
        //System.out.println(this.cartela.toArray());
        //this.print(this.cartela.toArray());

        if(this.cartelas.get(0).checarNumero(numeroAleatorio)) {
            this.pontuacao++;
            return true;
        }
        return false;
    }

    public void imprimirCartelasDosJogadores(){
            System.out.println("--------------");
            for(int i=0; i<cartelas.get(0).cartela.length; i++){
                String espaco = "[ ";
                for(int j=0; j<cartelas.get(0).cartela.length; j++){
                    espaco += cartelas.get(0).cartela[i][j] + " ";
                }
                espaco += " ]";
                System.out.println(espaco);
            }

            System.out.println("---------------");
    }
}
