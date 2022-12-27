
package ConceitosBasicos;


public class Carro {  
        //Atributos
        String cor;
        String modelo;
        int capacidadeDoTanque;
        //Construtor
        Carro(){
            
        }
        //Sobrecarga do construtor
        Carro(String cor,String modelo,int capacidadeDoTanque){
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeDoTanque = capacidadeDoTanque;
        }
    //Getters e Setters
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }
    //Métodos
    double valorTotal(double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    }
}

