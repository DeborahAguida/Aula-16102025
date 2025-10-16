import carro.Carro;
import carro.CarroBugatti;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.desacelerar();
        carro.desligar();

        CarroBugatti carroBugatti = new CarroBugatti();
        carroBugatti.ligar();
        carroBugatti.desacelerar();
        carroBugatti.desligar();
    }
}