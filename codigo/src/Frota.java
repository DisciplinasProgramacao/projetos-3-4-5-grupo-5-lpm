import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Frota{

    Veiculo [] veiculo;
    private double rotas;
    private double kmRodados;



    public void carregarVeiculo() {

    }

    public void salvarVeiculo() {

    }


    /* public Veiculo localizarPorPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (placa.equals(veiculos.getPlaca())) {
                return veiculo;
            }
        }
        return null;
    } */

    /* public void carregar(String nomeArquivo) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(nomeArquivo);
        InputStreamReader reader = new InputStreamReader(stream);
        try (BufferedReader br = new BufferedReader(reader)) {
            String line = br.readLine();
            for (String item : line.split(" "))
                if (item.trim().length() > 0)
                    this.addVertice(Integer.parseInt(item) - 1);

            br.readLine();

            String linha = br.readLine();
            int i = 0;
            while (linha != null) {
                var valido = linha.split("\\| ")[0];
                int j = 0;

                for (var item : valido.split(" ")) {
                    if (item.equals("1"))
                        this.addAresta(i, j);

                    j++;
                }

                linha = br.readLine();
                i++;
            }
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
 */
    /* public void salvar(String nomeArquivo) {
        FileWriter arq;
        try {
            arq = new FileWriter(nomeArquivo);
            PrintWriter gravarArq = new PrintWriter(arq);
            for (int i = 1; i <= veiculo.length; i++)
                gravarArq.printf("%d ", i);

            gravarArq.println();

            for (int i = 1; i <= veiculo.length; i++)
                gravarArq.printf("--");

            gravarArq.printf("---\n");

            for (int i = 0; i < veiculo.length; i++) {
                for (int j = 0; j < veiculo.length; j++) {
                    String resultado = this.existeVeiculo(i, j);
                    String space = j == veiculo.length - 1 ? String.format(" | %d", i + 1) : " ";
                    gravarArq.printf("%d%s", resultado, space);
                }
                gravarArq.println();
            }

            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } */

    public void imprimirRelatorio() {

    }

    public void addVeiculo() {

    }

    /* public boolean addRota(Rota nova) {
        boolean resposta = false;
        if (this.rotas.adicionar(nova)) {
            this.kmRodados += nova.getKmRota();
            resposta = true;
        }
        return resposta;
    } */
}