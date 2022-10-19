public class Rota {
    private Data data;
    private final double kmRota;

    public Rota(Data data, double kmRota) {
        this.data = data;
        this.kmRota = kmRota;
    }


    public double getKmRota() {

        return kmRota;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
