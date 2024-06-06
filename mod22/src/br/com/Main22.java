package mod22.src.br.com;

import java.util.*;
import java.util.stream.Stream;

public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Idade");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Genero");
            String genero = scanner.nextLine();

            pessoas.add(new Pessoa(nome, idade, genero.toLowerCase()));

        }
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getGenero().equals("fem"))
                .toList();

        for(Pessoa mulher : mulheres) {
            System.out.println(mulher.getNome());
            System.out.println(mulher.getIdade());
            System.out.println(mulher.getGenero());
        }
    }

}
//    Stream<String> stream = List.of("Vinicius", "Jaeger", "Teste").stream();
//
//    Stream<String> set = Set.of("Lista", "Set", "String").stream();
//
//    Map<String, String> map = Map.of("Chave", "Valor");
//    Stream<String> chave = map.keySet().stream();
//    Stream<String> valor = map.values().stream();
//
//    Stream<String> stream2 = Stream.of("String", "Teste");