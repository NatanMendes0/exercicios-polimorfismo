package Modelos;

import javax.sound.midi.Soundbank;

public class ContaBancaria {

    protected double saldo;

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public void sacar(double valor){
        if (saldo<valor){
            System.out.println("Saldo insuficiente para sacar valor desejado!");
        } else {
            System.out.println("Saque realizado!");
            saldo -= valor;
        }
    }

    public void consultarSaldo(){
        System.out.println(String.format("""
                Olá! Consulte aqui seu saldo bancário:
                Saldo: R$%.2f""", saldo));
    }
}
