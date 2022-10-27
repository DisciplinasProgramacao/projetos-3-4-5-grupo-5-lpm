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


    public Veiculo localizarPorPlaca(String placa) {
        for (Veiculo veiculos : veiculo) {
            if (placa.equals(veiculos.getPlaca())) {
                return veiculos;
            }
        }
        return null;
    }



    public void imprimirRelatorio() {

    }

    public void addVeiculo() {

    }

    public boolean addRota(Rota nova) {
        boolean resposta = false;
        if (this.rotas.adicionar(nova)) {
            this.kmRodados += nova.getKmRota();
            resposta = true;
        }
        return resposta;
    }
}