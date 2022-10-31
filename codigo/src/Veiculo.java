import java.util.regex.Pattern;

public class Veiculo {

    private String nome;
    private double tanque;
    private double ipva;
    private double seguro;
    private double autonomiaDiaria;
    private String placa;

    public Veiculo(String nome,double tanque, double ipva, double seguro, double autonomiaDiaria, String placa){
        this.nome = nome;
        this.tanque = tanque;
        this.ipva = ipva;
        this.seguro = seguro;
        this.autonomiaDiaria = autonomiaDiaria;
        this.placa = placa;
    }

    /**
     * Construtor. Lança exceção se a placa não coincidir com o padrão
     * @param placa Placa no padrão Mercosul/Brasil: AAA0A00
     * @throws PlacaInvalidaException Em caso de placa fora do padrão
     */
    /* public Veiculo(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) throws PlacaInvalidaException {
        if (!Pattern.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}", placa))
            throw new PlacaInvalidaException(placa);
    } */

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

    public void cadastrar(String nome, String placa){
        this.setNome(nome);
        this.setPlaca(placa);
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

