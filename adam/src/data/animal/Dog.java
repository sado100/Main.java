package data.animal;

import data.Creature;
import data.human.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class Dog extends Animal{
    private String breed;
    private static Scanner scanner = new Scanner(System.in);

    public Dog() {
    }

    public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    public Dog(String name, int age, String gender, Human owner, String breed) {
        super(name, age, gender, owner);
        this.breed = breed;
    }

    private static Dog create() {
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj plec: ");
        String gender = scanner.nextLine();
        System.out.println("Podaj rase: ");
        String breed = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Dog dog = new Dog(name, age, gender, breed);
        return dog;
    }

    public static void add(ArrayList<Creature> creatureArrayList) {
        creatureArrayList.add(create());

    }


    @Override
    public String toString() {
        return super.toString() + ", Piesek Rasy: " + breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
