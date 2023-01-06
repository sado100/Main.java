package _3_my_projects.animals_in_garden.data.creature;

import _3_my_projects.animals_in_garden.data.creature.animal.Animal;
import _3_my_projects.animals_in_garden.data.creature.animal.Cat;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;
import _3_my_projects.animals_in_garden.data.creature.human.Person;
import _3_my_projects.animals_in_garden.data.creature.interfaces.Information;
import _3_my_projects.animals_in_garden.logic.MainLogic;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Creature implements Information {
    private String name;
    private int age;
    private String gender;

    static Scanner scanner = new Scanner(System.in);

    public abstract void print();

    public static void erase(ArrayList<Creature> creatureArrayList) {
        MainLogic.printList(creatureArrayList);
        System.out.println("Wyberz obiekt z listy powyzej podajac nr porzadkowy:");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (creatureArrayList.get(n - 1) instanceof Owner) {
            System.out.println("Usuwasz czlowieka: " + creatureArrayList.get(n - 1));
            for (Animal animal : ((Owner) creatureArrayList.get(n - 1)).getPetList()) {
                animal.setOwner(null);
            }
        } else if (creatureArrayList.get(n - 1) instanceof Animal) {
            System.out.println("Usuwasz zwierze: " + creatureArrayList.get(n - 1));
            ((Animal) creatureArrayList.get(n - 1)).getOwner().getPetList().remove(creatureArrayList.get(n - 1));
        }
        creatureArrayList.remove(n - 1);
    }

    static Object object = new Object();
    static int i = 0;

    public static void printList(ArrayList<Creature> creatureArrayList) {
        for (Creature creature : creatureArrayList) {

            i++;
            System.out.println(i + ". " + creature.toString());
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return age == creature.age && Objects.equals(name, creature.name) && Objects.equals(gender, creature.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }


    public Creature() {
    }

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Creature(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

}
