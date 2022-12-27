package Automoveis;

import Automoveis.Carro;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro();
        
        carro1.setModelo("Fiat");
        carro1.setCor("azul");
        carro1.setCapacidadeDoTanque(20);
        
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.valorTotal(30));
        
    }
    
}
