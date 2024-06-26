package Subclasses;

import Modelos.NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int valor){
        if (valor % 2 == 0){
            System.out.println("O número "+valor+" não é primo!");
        } else {
            System.out.println("O número "+valor+" é primo!");
        }
    }
}
