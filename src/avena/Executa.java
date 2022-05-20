package avena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Executa {
   public static void main(String[] args) throws IOException {
       URL url = new URL("https://www.claro.com.br");
       URLConnection abreconexao = url.openConnection();

       BufferedReader leitor = new BufferedReader(new InputStreamReader(abreconexao.getInputStream()));

       String linhas = "";

       while (leitor.readLine() != null){
           linhas = linhas.concat(leitor.readLine().concat(System.lineSeparator()));
       }
       System.out.println(linhas);


   }

}
