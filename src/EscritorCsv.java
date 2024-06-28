import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class EscritorCsv {
  public void escreverCsv(String caminho, List<Pessoa> pessoas) {
    try(FileWriter writer = new FileWriter(caminho)){
      writer.append("id;nome;idade\n");
      
      for (Pessoa pessoa : pessoas) {
        writer.append(pessoa.toString()).append("\n");
      }
    }catch(IOException e) {
      e.printStackTrace();
    }
  }
}
