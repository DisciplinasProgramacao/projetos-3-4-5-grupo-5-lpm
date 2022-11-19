
public class Caminhao extends Veiculo implements ICusto{
	
	private double precoManutencao = 1000;
	private double precoVistoria = 1000;
	
	public Caminhao(int tanque, double tanqueTotal, double ipva, double seguro, double autonomiaDiaria, String placa) {
		super(placa, tanque, tanqueTotal, ipva, seguro, autonomiaDiaria, placa);
		this.tanque = 250;
		this.placa = placa;
		this.autonomiaDiaria = autonomiaDiaria;
	}
	public double precoVenda() {
		return 0;
	}
	@Override
	public double calcularIpva() {
		this.ipva = 1;

		return (this.ipva * precoVenda())/100 ;
	}
	@Override
	public double calcularSeguro() {
		this.seguro = 2;
		return (this.seguro * precoVenda()/100)+2000;
	}
	@Override
	public double calcularCusto() {

		return (calcularManutencao()+(this.precoManutencao*20000)+(this.precoVistoria*3000))/this.kmRodados;
	}
	@Override
	public double calcularManutencao(){
		System.out.println("Há alguma manutenção extra?");
		String manutencao = ler.nextLine();
		double valorManutencao=0;
		if (manutencao == "sim"){
			System.out.println("Digite o valor da manunteção");
		 valorManutencao = ler.nextDouble();		
		}
		return valorManutencao;
	}

}
