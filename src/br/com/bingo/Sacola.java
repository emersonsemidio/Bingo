package br.com.bingo;

import java.util.*;
import java.util.ArrayList;


public class Sacola implements Set{

    public List<Integer> elementos = new ArrayList<>();
    HashMap<Integer, Integer> numerosEmbaralhadosEmHashMap = new HashMap();

    public Sacola(){
        numerosEmbaralhadosEmHashMap = this.embaralharNumeros();
    }


    public List gerarNumeros(){
        for(int i=0; i<75; i++){
            elementos.add(i+1);
        }
        return elementos;
    }

    public HashMap embaralharNumeros(){
        int cont = 1;
        List<Integer> numerosEmbaralhados = new ArrayList();

        numerosEmbaralhados = gerarNumeros();

        Collections.shuffle(numerosEmbaralhados);

        for (Integer ob: numerosEmbaralhados) {
            numerosEmbaralhadosEmHashMap.put(cont, ob);
            cont++;
        }
        return numerosEmbaralhadosEmHashMap;
    }

    public int pegarUmNumero(int chaveAleatoria){
        int numeroAleatorio = 0;

        numeroAleatorio = numerosEmbaralhadosEmHashMap.get(chaveAleatoria);

        System.out.println(numerosEmbaralhadosEmHashMap);
        numerosEmbaralhadosEmHashMap.remove(chaveAleatoria);


        System.out.println(numeroAleatorio);


        return numeroAleatorio;
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {

        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}






