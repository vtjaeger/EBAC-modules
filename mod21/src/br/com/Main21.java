package mod21.src.br.com;

import java.util.ArrayList;
import java.util.List;

public class Main21 {
    public static void main(String[] args) {
        List<String> alfabeto = new ArrayList<>();

        for(char letra = 'A'; letra <= 'Z'; letra++) {
            alfabeto.add(String.valueOf(letra));
        }
        System.out.println("com lambda");
        alfabeto.forEach(letra -> System.out.print(letra + " "));

        System.out.println("\n\n");

        System.out.println("sem lambda");
        imprimir(alfabeto);
    }
    static void imprimir(List<String> lista){
        int size = lista.size();
        for(int i = 0; i < size; i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
}