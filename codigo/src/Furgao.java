public class Furgao extends Veiculo implements ICusto{
	private double precoAlinhamento = 120;
	private double precoVistoria = 500;

	public Furgao(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) {
		super(placa, tanque, ipva, seguro, autonomiaDiaria, placa);
		this.tanque = 80;
		}
	
	@Override
	public double calcularIpva() {
		this.ipva = 3;
		return (this.ipva * precoVenda())/100 ;
	}
	@Override
	public double calcularSeguro() {
		this.seguro = 3;
		return (this.seguro * precoVenda()/100);
	}
	public double precoVenda() {
		return 0;
	}

	@Override
	public double calcularCusto() {
		return ((this.precoAlinhamento*10000) + (this.precoVistoria*1000))/this.kmRodados;
	}
}
