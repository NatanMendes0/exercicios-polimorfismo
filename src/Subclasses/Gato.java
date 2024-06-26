package Subclasses;

import Modelos.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Sou um gato! Miau!");
        arranharMoveis();
    }

    private void arranharMoveis() {
        System.out.println("Arranhando sofá!");
    }
}
