import java.util.regex.Pattern;

public class Veiculo {

    private String nome;
    private String tanque;
    private String ipva;
    private String seguro;
    private String autonomiaDiaria;
    private String placa;

    /* public Veiculo(){} */

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

    public String getTanque(){
        return tanque;
    }

    public void setTanque(String tanque){
        this.tanque = tanque;
    }

    public String getIPVA(){
        return ipva;
    }

    public void setIPVA(String ipva){
        this.ipva = ipva;
    }

    public String getSeguro(){
        return seguro;
    }

    public void setSeguro(String seguro){
        this.seguro = seguro;
    }

    public String getautonomiaDiaria(){
        return autonomiaDiaria;
    }
    
    public void setautonomiaDiaria(String autonomiaDiaria){
        this.autonomiaDiaria = autonomiaDiaria;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

    @Override
	public String toString() {
		return "{\n" +
                "nome=" + nome + "," + "\n" +
				"tanque=" + tanque + "," + "\n" +
				"IPVA='" + ipva + '\'' + "," + "\n" +
				"seguro='" + seguro + '\'' + "," + "\n" +
				"autonomia Diaria='" + autonomiaDiaria + '\'' + "," + "\n" +
				"placa='" + placa + '\'' + "\n" +
				'}';
	}

}

