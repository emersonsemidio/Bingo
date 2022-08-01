package br.com.bingo;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;

public class Cartela {

    public Cartela(){
        this.cartela = this.criarCartela();
        this.inicializarListas();
    }
    int[][] cartela = new int[5][5];

    List<Integer> pontuacaoLinha = new ArrayList<>();
    List<Integer> pontuacaoColuna = new ArrayList<>();

    Sacola sacola = new Sacola();
    Random random = new Random();

    public void inicializarListas(){
        for(int i=0; i<5; i++){
            pontuacaoLinha.add(0);
            pontuacaoColuna.add(0);
        }
    }

    public int[][] criarCartela() {

        for (int i = 0; i < 5; i++) { //Varrer todas as linhas da cartela
                if (i == 0) {
                    List<Integer> numerosGerados = new ArrayList<>();

                    numerosGerados = gerarNumerosNoIntervalo(1, 15);

                    for(int col =0; col<5; col++){
                        cartela[i][col] = numerosGerados.get(col);
                    }

                } else if (i == 1) {

                    List<Integer> numerosGerados = new ArrayList<>();

                    numerosGerados = gerarNumerosNoIntervalo(16, 30);

                    for(int col =0; col<5; col++){
                        cartela[i][col] = numerosGerados.get(col);
                    }

                } else if (i == 2) {


                    List<Integer> numerosGerados = new ArrayList<>();

                    numerosGerados = gerarNumerosNoIntervalo(31, 45);

                    for(int col =0; col<5; col++){
                        if(pulaNumeroCentral(i, col)){
                            continue;
                        }
                        cartela[i][col] = numerosGerados.get(col);
                    }

                } else if (i == 3) {
                    List<Integer> numerosGerados = new ArrayList<>();

                    numerosGerados = gerarNumerosNoIntervalo(46, 60);

                    for(int col =0; col<5; col++){

                        cartela[i][col] = numerosGerados.get(col);
                    }

                } else {
                    List<Integer> numerosGerados = new ArrayList<>();

                    numerosGerados = gerarNumerosNoIntervalo(61, 75);

                    for(int col =0; col<5; col++){
                        cartela[i][col] = numerosGerados.get(col);
                    }
                }
            }

        //imprimirCartela(cartela);

        return cartela;
    }

    public List gerarNumerosNoIntervalo(int minimo, int maximo){
        List<Integer> numerosNoIntervalo = new ArrayList<>();
        List<Integer> cincoPrimeirosNumeros = new ArrayList<>();

        for(int i =minimo; i<=maximo; i++){
            numerosNoIntervalo.add(i);
        }

        Collections.shuffle(numerosNoIntervalo);

        for(int i=0; i<5; i++){
            cincoPrimeirosNumeros.add(numerosNoIntervalo.get(i));
        }
        return cincoPrimeirosNumeros;
    }

    public boolean checarNumero(int numeroSorteado){

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(cartela[i][j] == numeroSorteado){
                    pontuar(i, j);
                    return true;
                }
            }
        }
        return false;
    }

    public void pontuar(int linha, int coluna){
        pontuacaoLinha.set(linha, pontuacaoLinha.get(linha)+1);
        pontuacaoColuna.set(coluna, pontuacaoColuna.get(coluna)+1);

        this.imprimirPontuacaoDaColuna();
        this.imprimirPontuacaoDaLinha();
    }

    public void imprimirPontuacaoDaLinha(){

        System.out.println("-------LINHA-------");
        String espaco = "[ ";
        for(int i=0; i<pontuacaoLinha.size(); i++){
            espaco += pontuacaoLinha.get(i) + " ";
        }

        espaco += " ]";
        System.out.println(espaco);

        System.out.println("---------------");
    }

    public void imprimirPontuacaoDaColuna(){
        System.out.println("--------COLUNA------");
        String espaco = "[ ";
        for(int i=0; i<pontuacaoColuna.size(); i++){
            espaco += pontuacaoColuna.get(i) + " ";
        }

        espaco += " ]";
        System.out.println(espaco);

        System.out.println("---------------");
    }



    public static int gerarNumerosAleatorios(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    public boolean pulaNumeroCentral(int i, int j){
        return i==2 && j ==2;
    }
}


