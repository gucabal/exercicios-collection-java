package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    ExemploList() {
    }

    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        ArrayList<Double> list = new ArrayList();
        list.add(9.0D);
        list.add(1.4D);
        list.add(1.2D);
        list.add(9.0D);
        list.add(5.0D);
        list.add(2.76D);
        list.add(10.0D);
        System.out.println(list.toString());
        System.out.println("Exiba a posição da nota 5.0: " + list.indexOf(5.0D));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        list.add(4, 8.0D);
        System.out.println(list);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        list.set(list.indexOf(5.0D), 6.0D);
        System.out.println(list);
        System.out.println("Confira se a nota 5.0 está na lista: " + list.contains(5.0D));
        System.out.println("Exiba a terceira nota adicionada: " + list.get(2));
        System.out.println(list.toString());
        System.out.println("Exiba a menor nota: " + Collections.min(list));
        System.out.println("Exiba a maior nota: " + Collections.max(list));
        Iterator<Double> iterator = list.iterator();

        Double soma;
        Double next;
        for(soma = 0.0D; iterator.hasNext(); soma = soma + next) {
            next = (Double)iterator.next();
        }

        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + soma / (double)list.size());
        System.out.println("Remova a nota 0: ");
        list.remove(0.0D);
        System.out.println(list);
        System.out.println("Remova a nota da posição 0");
        list.remove(0);
        System.out.println(list);
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator iterator1 = list.iterator();

        while(iterator1.hasNext()) {
             next = (Double)iterator1.next();
            if (next < 7.0D) {
                iterator1.remove();
            }
        }

        System.out.println(list);
        System.out.println("Confira se a lista está vazia: " + list.isEmpty());
    }
}
