import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.io.*;
import java.util.*;

public class Frota{

    List<Veiculo> veiculos = new ArrayList<Veiculo>();
    private double rotas;
    private double kmRodados;

    public static List<Veiculo> read(String fileName) throws IOException {
        File arquivo = new File(fileName);
        StringBuilder content = new StringBuilder();
        List<Veiculo> veiculos = new LinkedList<Veiculo>();
        if (arquivo.exists()) {
            FileReader fr = new FileReader(arquivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                while (br.ready()) {
                    content.append(br.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fr.close();
            String resp = "";
            List<String> dadosVeiculo = new LinkedList<String>();
            for(int i = 0; i < content.length(); i++){
                char letra = content.charAt(i);
                if (letra == '=') {
                    i++;
                    while (content.charAt(i) != ',' && content.charAt(i) != '}') {
                        resp += content.charAt(i);
                        i++;
                    }
                    dadosVeiculo.add(resp);
                    resp = "";
                }
                if(content.charAt(i) == '}'){
                    veiculos.add(new Veiculo(dadosVeiculo.get(0), Double.parseDouble(dadosVeiculo.get(1)), Double.parseDouble(dadosVeiculo.get(2)), Double.parseDouble(dadosVeiculo.get(3)), Double.parseDouble(dadosVeiculo.get(4)), dadosVeiculo.get(5)));
                    dadosVeiculo.clear();
                }
            }
            
        }else {
            throw new FileNotFoundException();
        }
        return veiculos;
    }

    public static void write(String fileName, String content) throws IOException {
        File arquivo = new File(fileName);
        if (!arquivo.exists() && !arquivo.createNewFile()) {
            throw new FileNotFoundException();
        }
        FileWriter fw = new FileWriter(arquivo, true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
        }
        fw.close();
    }

    public void carregarVeiculo() {

    }

    public void salvarVeiculo() {

    }


    /* public Veiculo localizarPorPlaca(String placa) {
        for (Veiculo veiculos : veiculo) {
            if (placa.equals(veiculos.getPlaca())) {
                return veiculos;
            }
        }
        return null;
    } */

    public void imprimirRelatorio() {

    }

    public void addVeiculo() {

    }
}
