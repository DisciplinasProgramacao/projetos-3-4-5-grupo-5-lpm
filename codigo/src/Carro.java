public class Carro extends Veiculo{


    protected Carro(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) {
        super(tanque, ipva, seguro, autonomiaDiaria, placa);
    }

    @Override
    public void setTanque(int tanque) {
        tanque=50;
        super.setTanque(tanque);
    }

    @Override
    public void setIpva(double ipva) {
        ipva= 4/100*getValorVenda();
        super.setIpva(ipva);
    }
    @Override
    public void setSeguro(double seguro) {
        seguro=5/100*getValorVenda()+300;
        super.setSeguro(seguro);
    }
}