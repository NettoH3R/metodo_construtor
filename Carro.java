public class Carro {
    private String cor;
    private String modelo;
    private int aro;
    private double valorCarro;

    public Carro() {

    }

    public Carro(int aro) {
        this.aro = aro;
    }

    public Carro(int aro, String modelo, double valorCarro, String cor){
        this.aro = aro;
        this.modelo = modelo;
        this.valorCarro = valorCarro;
        this.cor = cor;
    }
}