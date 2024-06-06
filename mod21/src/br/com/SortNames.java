package mod21.src.br.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("henrique");
        names.add("joao");
        names.add("brenno");
        names.add("vinicius");
        names.add("thais");

        System.out.println("names");
        names.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\n");

        List<String> sortedNames = names.stream()
                .sorted(Comparator.comparing(String::toString))
                .toList();

        System.out.println("sorted names");
        sortedNames.forEach(n -> System.out.print(n + " "));
    }
}
