package Modelos;

public class Carro {
    private String nome,
                   modelo;
    private double precoAno1,
                   precoAno2,
                   precoAno3,
                   maiorPreco,
                   menorPreco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaMaiorPreco(){
        if (precoAno1 > precoAno2 && precoAno1 > precoAno3){
            maiorPreco = precoAno1;
        }
        if (precoAno2 > precoAno1 && precoAno2 > precoAno3){
            maiorPreco = precoAno2;
        }
        if (precoAno3 > precoAno2 && precoAno3 > precoAno1){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public double calculaMenorPreco(){
        if (precoAno1 < precoAno2 && precoAno1 < precoAno3){
            menorPreco = precoAno1;
        }
        if (precoAno2 < precoAno1 && precoAno2 < precoAno3){
            menorPreco = precoAno2;
        }
        if (precoAno3 < precoAno2 && precoAno3 < precoAno1){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public void exibeInfo(){
        System.out.println(String.format("""
                O nome do carro é: %s,
                Seu modelo é: %s,
                O seu maior preço foi: %.2f,
                O seu menor preço foi: %.2f""", nome, modelo, calculaMaiorPreco(), calculaMenorPreco()));
    }
}
