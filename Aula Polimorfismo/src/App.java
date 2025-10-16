import carro.Carro;
import carro.CarroMonstro;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        carro.acelerar();

        CarroMonstro carroMonstro = new CarroMonstro();
        carroMonstro.ligar();
        carroMonstro.desligar();
        carroMonstro.acelerar();
    }
}
