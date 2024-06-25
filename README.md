# Herança e Polimorfismo em Programação Orientada a Objetos

Neste tutorial, exploraremos conceitos cruciais de herança e polimorfismo em programação orientada a objetos. Vamos abordar os seguintes tópicos:

## 1. Herança
- A palavra-chave `extends` indica que uma classe herda de outra.
- Sobrescrever métodos herdados usando a anotação `@Override`.

## 2. Polimorfismo
- Evitar duplicação de métodos para uma estrutura de código mais eficiente e coesa.

## Atividades Práticas (Opcionais)
Para consolidar essas ideias, propomos as seguintes atividades:

### 1. Classe Carro
- Crie uma classe `Carro` com métodos para representar um modelo específico ao longo de três anos.
- Implemente métodos para definir o nome do modelo, os preços médios para cada ano e calcular e exibir o menor e o maior preço.
- Adicione uma subclasse `ModeloCarro` para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

### 2. Classe Animal
- Crie uma classe `Animal` com um método `emitirSom()`.
- Crie duas subclasses: `Cachorro` e `Gato`, que herdam da classe `Animal`.
- Sobrescreva o método `emitirSom()` nas subclasses, utilizando a anotação `@Override`.
- Adicione métodos específicos para cada subclasse, como `abanarRabo()` para o `Cachorro` e `arranharMoveis()` para o `Gato`.

### 3. Classe ContaBancaria
- Crie uma classe `ContaBancaria` com métodos para realizar operações bancárias, como `depositar()`, `sacar()` e `consultarSaldo()`.
- Crie uma subclasse `ContaCorrente` que herda da classe `ContaBancaria`.
- Adicione um método específico para a subclasse, como `cobrarTarifaMensal()`, que desconta uma tarifa mensal da conta corrente.

### 4. Classe NumerosPrimos
- Crie uma classe `NumerosPrimos` com métodos como `verificarPrimalidade()` e `listarPrimos()`.
- Crie duas subclasses: `VerificadorPrimo` e `GeradorPrimo`, que herdam da classe `NumerosPrimos`.
- Adicione um método específico para cada uma das subclasses, como `verificarSeEhPrimo()` para o `VerificadorPrimo` e `gerarProximoPrimo()` para o `GeradorPrimo`.
