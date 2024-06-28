
import java.util.List;

public class Programa {

    public static void main(String[] args) throws Exception {

        LeitorCsv leitor = new LeitorCsv();
        List<Pessoa> pessoas = leitor.lerCsv("dados.csv");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        List<Pessoa> pessoas2 = List.of(
                new Pessoa(3, "Jean", 30),
                new Pessoa(4, "Gabrielle", 26),
                new Pessoa(5, "Marianinha", 5),
                new Pessoa(6, "Julia Batatinha", 2)
        );

        EscritorCsv escritor = new EscritorCsv();
        escritor.escreverCsv("dados_saida.csv", pessoas2);

    }
}
