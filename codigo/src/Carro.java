public class Carro extends Veiculo implements Custo{

    private static final int precoAlinhamento=80;
    private static final int kmRodado=10000;

    protected Carro(int tanque, double ipva, double seguro, String autonomiaDiaria, String placa) {
        super(tanque, ipva, seguro, autonomiaDiaria, placa);
    }

    @Override
    public double calcularCusto() {

    }

    @Override
    public void setTanque(int tanque) {
        tanque=50;
        super.setTanque(tanque);
    }
 
    @Override
    public void setIpva(double ipva) {
        ipva= 4/100*(getValorVenda());
        super.setIpva(ipva);
    }
    @Override
    public void setSeguro(double seguro) {
        seguro = 5 / 100 * getValorVenda() + 300;
        super.setSeguro(seguro);
    }
}
