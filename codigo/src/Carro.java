public class Carro extends Veiculo implements ICusto{
	
	private double precoAlinhamento = 80;
	
	public Carro(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) {
		super(placa, tanque, ipva, seguro, autonomiaDiaria, placa);
		this.tanque = 50;
		this.placa = placa;
		this.autonomiaDiaria = autonomiaDiaria;
	}
	@Override
	public double calcularIpva() {
		this.ipva = 4;
		return (this.ipva * precoVenda())/100 ;
	}
	@Override
	public double calcularSeguro() {
		this.seguro = 5;
		return (this.seguro * precoVenda()/100)+300;
	}
	public double precoVenda() {
		return 0;
	}
	@Override
	public double calcularCusto() {
		return this.precoAlinhamento*1000/this.kmRodados;
	}

}