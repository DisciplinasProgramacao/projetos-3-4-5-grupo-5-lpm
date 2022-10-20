public class Frota{

    Veiculo [] veiculo;
    private double rotas;
    private double kmRodados;



    public void carregarVeiculo() {

    }

    public void salvarVeiculo() {

    }


    public Veiculo localizarPorPlaca(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (placa.equals(veiculos.getPlaca())) {
                return veiculo;
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