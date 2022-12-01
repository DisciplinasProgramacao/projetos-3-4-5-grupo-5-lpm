
public class Carro extends Veiculo implements ICusto {

	private double precoAlinhamento = 80;

	public Carro(int tanque, double tanqueTotal, double ipva, double seguro, double autonomiaDiaria, String placa,
			double precoVenda) {
		super(placa, tanque, tanqueTotal, ipva, seguro, autonomiaDiaria, placa, precoVenda);
		this.tanque = 50;
		this.placa = placa;
		this.autonomiaDiaria = autonomiaDiaria;
		this.precoVenda = precoVenda;
	}

	@Override
	public double calcularIpva() {
		this.ipva = 4;
		return (this.ipva * getPrecoVenda()) / 100;
	}

	@Override
	public double calcularSeguro() {
		this.seguro = 5;
		return (this.seguro * getPrecoVenda() / 100) + 300;
	}

	@Override
	public double calcularCusto() {
		return (calcularManutencao() + this.precoAlinhamento * 1000 / this.kmRodados);
	}

	@Override
	public double calcularManutencao() {
		System.out.println("Há alguma manutenção extra?");
		String manutencao = ler.nextLine();
		double valorManutencao = 0;
		if (manutencao == "sim") {
			System.out.println("Digite o valor da manunteção");
			valorManutencao = ler.nextDouble();
		}
		return valorManutencao;
	}

}
