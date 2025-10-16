package carro;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String rodas;


    public void ligar(){
        System.out.println("ligando");
    }
    public void desligar(){
        System.out.println("desligando");
    }
    public void acelerar(){
        System.out.println("acelerando");
    }
}
