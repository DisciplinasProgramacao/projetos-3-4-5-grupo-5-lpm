import java.util.regex.Pattern;

public abstract class Veiculo {

    private int tanque;
    private double ipva;
    private double seguro;
    private double autonomiaDiaria;
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getIpva() {
        return ipva;
    }

    public void setIpva(double ipva) {
        this.ipva = ipva;
    }
    public double getAutonomiaDiaria() {
        return autonomiaDiaria;
    }

    public void setAutonomiaDiaria(double autonomiaDiaria) {
        this.autonomiaDiaria = autonomiaDiaria;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    /**
     * Construtor. Lança exceção se a placa não coincidir com o padrão
     * @param placa Placa no padrão Mercosul/Brasil: AAA0A00
     * @throws PlacaInvalidaException Em caso de placa fora do padrão
     */
    public Veiculo(int tanque, double ipva, double seguro, double autonomiaDiaria, String placa) throws PlacaInvalidaException {
        if (!Pattern.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}", placa))
            throw new PlacaInvalidaException(placa);
    }

}

