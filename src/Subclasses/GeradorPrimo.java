package Subclasses;

import Modelos.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos {
    private int valorInicial;
    public void gerarProximoPrimo(int valor){
        valorInicial = valor;

        if (valor % 2 != 0) {valor++;}

        while (valor % 2 == 0){
            valor++;
        }

        System.out.println("O próximo número primo de "+valorInicial+" será "+valor);
    }
}
