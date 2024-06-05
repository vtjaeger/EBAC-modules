package mod19.src.br.com;
@Tabela(name = "Emails do Dia")

public class Main {
    public static void main(String[] args) {
        Tabela tabela = Main.class.getAnnotation(Tabela.class);
        System.out.println("Nome da tabela: " + tabela.name());
    }
}
