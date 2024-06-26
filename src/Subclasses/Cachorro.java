package Subclasses;

import Modelos.Animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Sou um cachorro! Au au!");
        abanarRabo();
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo!");
    }
}
