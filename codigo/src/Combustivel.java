public enum Combustivel {
    GASOLINA("gasolina", 12, 4.80),
    ETANOL("etanol", 8, 3.65),
    DIESEL("diesel", 3.5, 6.65);

    private String tipo;
    private double consumo;
    private double precoMedio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    Combustivel(String tipo, double consumo, double precoMedio) {
        this.tipo = tipo;
        this.consumo = consumo;
        this.precoMedio = precoMedio;
    }
    
}
