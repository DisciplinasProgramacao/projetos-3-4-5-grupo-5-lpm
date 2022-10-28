public class Furgao extends Veiculo implements Custo{

    private int precoAlinhamento=120;

    protected Furgao(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) {
        super(tanque, ipva, seguro, autonomiaDiaria, placa);
    }

    @Override
    public double calcularAlinhamento(double precoAlinhamento, double kmRodado) {
        return precoAlinhamento * 10000/kmRodado;
    }

    @Override
    public void setTanque(int tanque) {
        tanque=80;
        super.setTanque(tanque);
    }

    @Override
    public void setIpva(double ipva) {
        ipva= 3/100*(getValorVenda());
        super.setIpva(ipva);
    }
    @Override
    public void setSeguro(double seguro) {
        seguro=3/100*getValorVenda();
        super.setSeguro(seguro);
    }
}
