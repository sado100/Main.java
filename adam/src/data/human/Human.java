package data.human;

import data.Creature;
import data.animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human extends Creature {
    private String lastName;
    private List<Animal> animalList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Human() {
    }

    public Human(String name, int age, String gender, String lastName) {
        super(name, age, gender);
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return super.toString() + ", Nazwisko: " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private static Human create() {
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj plec: ");
        String gender = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Human human = new Human(name, age, gender, lastName);
        return human;
    }

    public static void add(ArrayList<Creature> creatureArrayList) {
        creatureArrayList.add(create());

    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
