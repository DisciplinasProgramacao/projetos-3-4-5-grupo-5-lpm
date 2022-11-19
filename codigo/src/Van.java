
public class Van extends Veiculo implements ICusto{
	private double precoAlinhamento = 120;
	private double precoVistoria = 500;
	
	public Van(int tanque, double tanqueTotal, double ipva, double seguro, double autonomiaDiaria, String placa) {
		super(placa, tanque, tanqueTotal, ipva, seguro, autonomiaDiaria, placa);
		this.tanque = 60;
		this.placa = placa;
		this.autonomiaDiaria = autonomiaDiaria;
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
		return (calcularManutencao()+(this.precoAlinhamento*10000) + (this.precoVistoria*10000))/this.kmRodados;
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
