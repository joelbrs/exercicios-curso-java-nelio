import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque o endereço completo do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Map<String, Integer> votos = new HashMap<>();
            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String nome = fields[0];
                Integer numeroVotos = Integer.parseInt(fields[1]);

                if (votos.containsKey(nome)) {
                    int maisVotos = votos.get(nome);
                    votos.put(nome, numeroVotos + maisVotos);
                } else {
                    votos.put(nome, numeroVotos);
                }

                line = br.readLine();

            }     
                       
            for (String chave : votos.keySet()) {
                System.out.println(chave + ": " + votos.get(chave));

            }
        }
    }
}
