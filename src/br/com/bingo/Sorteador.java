package br.com.bingo;
import java.util.Random;
import java.util.Collections;

public class Sorteador {

    public int[] numerosEmbaralhados(int[] numerosGerados){
        Random random = new Random();

        for(int i = numerosGerados.length - 1; i>0; i--){

            int j = random.nextInt(i+1);

            int temp = numerosGerados[i];
            numerosGerados[i] = numerosGerados[j];
            numerosGerados[j] = temp;
            //System.out.println(numerosGerados[i]);
        }
        return numerosGerados;
    }
}
