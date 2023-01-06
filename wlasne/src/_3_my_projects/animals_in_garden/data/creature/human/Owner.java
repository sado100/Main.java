package _3_my_projects.animals_in_garden.data.creature.human;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.animal.Animal;
import _3_my_projects.animals_in_garden.data.creature.animal.Cat;
import _3_my_projects.animals_in_garden.data.creature.animal.Turtle;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Owner extends Person {
    private static Creature animal;

    private ArrayList<Animal> petList = new ArrayList<>();


    static int i;

    public static Owner create() {
        ArrayList<Animal> petList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie czlowieka:");
        String name = scanner.nextLine();
        System.out.println("Nazwisko czlowieka:");
        String surName = scanner.nextLine();
        System.out.println("Wiek czlowieka: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Plec czlowieka: ");
        String gender = scanner.nextLine();
        Owner owner = new Owner(name, age, gender, surName, petList);
        return owner;
    }


    public static void add(ArrayList<Creature> creatureArrayList) {
        creatureArrayList.add(create());
        //i++;
    }

    @Override
    public void print() {
        System.out.println("WLASCICIEL: " + toString());
    }

    private StringBuilder builder = new StringBuilder();


    @Override
    public String toString() {
        String result = ". ";
        if (!petList.isEmpty()) {
            result = super.toString() + ", Zwierzatko:  " + printIt();
        } else {
            result = super.toString();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(animal, owner.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal);
    }

    public Owner() {
    }

    public Owner(String name, int age, String gender, String surName, ArrayList<Animal> petList) {
        super(name, age, gender, surName);
        this.petList = petList;
    }

    public Owner(String name, int age, String gender, String surName, Animal animal) {
        super(name, age, gender, surName);
        this.animal = animal;
    }

    public Creature getAnimal() {
        return animal;
    }

    public void setPetList(ArrayList<Animal> petList) {
        this.petList = petList;
    }

    public ArrayList<Animal> getPetList() {
        return petList;
    }


    public String printIt() {
        StringBuilder builder = new StringBuilder();
        for (int m = 0; m < petList.size(); m++) {
            //System.out.println(petList.get(i).getName());
            if (petList.get(m) instanceof Cat) {
                builder.append("KOT: ");
            } else if (petList.get(m) instanceof Turtle) {
                builder.append("ZOLW: ");
            }
            builder.append(petList.get(m).getName());
            builder.append(", ");
        }
        String res = builder.toString();
        return res;
    }


}
