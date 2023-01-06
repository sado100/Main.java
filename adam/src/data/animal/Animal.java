package data.animal;

import data.Creature;
import data.human.Human;

import java.util.Scanner;

public abstract class Animal extends Creature {
private Human owner = new Human();

    public Animal() {
    }

    public Animal(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Animal(String name, int age, String gender, Human owner) {
        super(name, age, gender);
        this.owner = owner;
    }



    @Override
    public String toString() {
        return super.toString() + ", Wlasciciel: " + owner.getName();
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
