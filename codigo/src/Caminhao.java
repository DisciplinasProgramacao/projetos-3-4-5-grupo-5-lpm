public class Caminhao extends Veiculo{

   protected Caminhao(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) {
        super(tanque, ipva, seguro, autonomiaDiaria, placa);
    }

    @Override
    public void setTanque(int tanque) {
        tanque=250;
        super.setTanque(tanque);
    }

    @Override
    public void setIpva(double ipva) {
        ipva= 1/100*(getValorVenda());
        super.setIpva(ipva);
    }
    @Override
    public void setSeguro(double seguro) {
        seguro=2/100*getValorVenda()+2000;
        super.setSeguro(seguro);
    }
}
