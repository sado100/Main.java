package _3_my_projects.animals_in_garden.data.creature.animal;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cat extends Animal {
    String breed;


    private static Cat create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie kota:");
        String name = scanner.nextLine();
        System.out.println("Wiek kota: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Rasa kota: ");
        String breed = scanner.nextLine();
        System.out.println("Plec kota: ");
        String gender = scanner.nextLine();
        Cat cat = new Cat(name, age, gender, breed);
        Point point = new Point(0, 0);
        cat.setPoint(point);
        return cat;
    }

    static int i = 0;

    public static void add(ArrayList<Creature> creatureArrayList) {
        creatureArrayList.add(create());
        //i++;
    }


    public void moveUp() {
        getPoint().setyCord(getPoint().getyCord() + 1);
    }

    @Override
    public void moveDown() {
        getPoint().setyCord(getPoint().getyCord() - 1);
    }

    @Override
    public void moveRight() {
        getPoint().setxCord(getPoint().getxCord() + 1);
    }

    @Override
    public void moveLeft() {
        getPoint().setxCord(getPoint().getxCord() - 1);
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        if (getOwner() != null) {
            return "KOT: Imie: " + getName() + ", Rasa: " + getBreed() + ",Plec: " + getGender() + ",Wiek: " + getAge() +
                    ", Wlasciciel: " + getOwner().getName()+" "+getOwner().getSurName() + ", Polozenie: " + getPoint();
        }
        return "KOT: Imie: " + getName() + ", Rasa: " + getBreed() + ",Plec: " + getGender() + ",Wiek: " + getAge() +
                ", Wlasciciel: Bezpanski, Polozenie: " + getPoint();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    public Cat() {
        Point point = new Point();
    }

    public Cat(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    public Cat(String name, int age, String gender, Owner owner, Point point, String breed) {
        super(name, age, gender, owner, point);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
