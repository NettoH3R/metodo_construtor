public class Principal {
    public static void main(String[] args) {
        Carro carAro = new Carro(20);
        Carro car = new Carro(20, "gol g1", 13000, "vermelho");
        Carro car2 =  new Carro(28, "gol G1", 24000, "preto");
    
        System.out.println(car.getModelo());
        System.out.println(car2.getModelo());
        System.out.println(carAro.getAro());
    }
}
