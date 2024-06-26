import Modelos.Carro;
import Modelos.ContaBancaria;
import Modelos.NumerosPrimos;
import Subclasses.*;

public class Principal {
    public static void main(String[] args) {

        //exercicio 1
        Carro carro = new Carro();
        carro.setNome("Opala");
        carro.setModelo("Sedan");
        carro.definirPrecos(12032.0,2321.7,28432.2);
        carro.exibeInfo();

        System.out.println("\n");

        //exercicio 2
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        Gato gato = new Gato();
        gato.emitirSom();

        System.out.println("\n");

        //exercicio 3
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        System.out.println("\n");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        System.out.println("\n");

        //exercicio 4
        NumerosPrimos num = new NumerosPrimos();
        num.listarPrimos(80);

        GeradorPrimo proxPrimo = new GeradorPrimo();
        proxPrimo.gerarProximoPrimo(79);

        VerificadorPrimo verPrimo = new VerificadorPrimo();
        verPrimo.verificarSeEhPrimo(784);
    }
}
