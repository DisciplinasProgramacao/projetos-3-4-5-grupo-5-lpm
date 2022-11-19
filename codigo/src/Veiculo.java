import java.util.Scanner;
import java.util.regex.Pattern;

public class Veiculo {
    Scanner ler = new Scanner(System.in);

	protected String nome;
    protected double tanque;
    protected double tanqueAtual;
    protected double ipva;
    protected double seguro;
    protected double autonomiaDiaria;
    protected String placa;
    protected double kmRodados;
    protected Rota rota;
    
    public Veiculo(String nome,double tanque, double tanqueAtual, double ipva, double seguro, double autonomiaDiaria, String placa){
        this.nome = nome;
        this.tanque = tanque;
        this.tanqueAtual= tanqueAtual;
        this.ipva = ipva;
        this.seguro = seguro;
        this.autonomiaDiaria = autonomiaDiaria;
        this.placa = placa;
    }
  
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getTanque(){
        return tanque;
    }

    public void setTanque(double tanque){
        this.tanque = tanque;
    }

    public double getIPVA(){
        return ipva;
    }

    public void setIPVA(double ipva){
        this.ipva = ipva;
    }

    public double getSeguro(){
        return seguro;
    }

    public void setSeguro(double seguro){
        this.seguro = seguro;
    }

    public double getautonomiaDiaria(){
        return autonomiaDiaria;
    }
    
    public void setautonomiaDiaria(double autonomiaDiaria){
        this.autonomiaDiaria = autonomiaDiaria;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getTanqueAtual() {
        return tanqueAtual;
    }

    public void setTanqueAtual(double tanqueAtual) {
        this.tanqueAtual = tanqueAtual;
    }
    public void adicionarRota(){
        Veiculo veiculo = new Veiculo( nome, tanque, tanqueAtual,  ipva,  seguro,  autonomiaDiaria,  placa);
        if (rota.getKmRota()>= getautonomiaDiaria()){            
            veiculo.add(rota);
        }

    }


    public void cadastrar(String nome, String placa){
        this.setNome(nome);
        this.setPlaca(placa);
    }
    public void preencherTanque(double tanqueTotal, double tanque){
        System.out.println("Digite a quantidade a ser preenchida no tanque");
        double quantidade = ler.nextDouble();
        
        if (getTanque()-getTanqueAtual()< quantidade){
            System.out.println("Quantidade impossível de ser preenchida");
        } else {
            setTanqueAtual(getTanqueAtual()+ quantidade);
        }
    }

    @Override
	public String toString() {
		return "{\n" +
                "Nome=" + nome + "," + "\n" +
				"Tanque=" + tanque + "," + "\n" +
				"IPVA=" + ipva + "," + "\n" +
				"Seguro=" + seguro  + "," + "\n" +
				"Autonomia Diaria=" + autonomiaDiaria + "," + "\n" +
				"Placa=" + placa + "\n" +
				'}';
	}

}

