package mod21.src.br.com;

import java.util.ArrayList;
import java.util.List;

public class FilterPairs {
    public static void main(String[] args) {
        List<Integer> numebers = new ArrayList<>();
        for(int i = 1; i < 500; i+= 21) {
            numebers.add(i);
        }
        System.out.println("full list of numbers");
        System.out.print(numebers);

        System.out.println("\nlist of pairs numbers");
        numebers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }
}
