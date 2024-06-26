package Subclasses;

import Modelos.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 120.0;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$"+tarifaMensal+" cobrada da conta! Saldo atual: R$"+saldo);
    }
}
