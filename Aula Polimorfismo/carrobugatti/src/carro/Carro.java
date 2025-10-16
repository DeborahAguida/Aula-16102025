package carro;
public class Carro {
    private String cor;
    private int ano;
    private int quilometragem;


    public void ligar(){
        System.out.println("ligando o carro");
    }
    public void desacelerar(){
        System.out.println("desacelerando o carro");
    }
    public void desligar(){
        System.out.println("desligando o carro");
    }
}