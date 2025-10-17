package carro;
public class CarroBugatti extends Carro {

    @Override

    public void ligar(){
        System.out.println("ligado");
    }
    public void desacelerar(){
        System.out.println("reduzindo");
    }
    public void desligar(){
        System.out.println("desligado");
    }

}
