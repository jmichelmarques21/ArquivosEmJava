
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCsv {

    public List<Pessoa> lerCsv(String caminho) {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int idade = Integer.parseInt(campos[2]);
                pessoas.add(new Pessoa(id, nome, idade));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pessoas;

    }
}
