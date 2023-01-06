package _3_my_projects.animals_in_garden.data.creature.animal;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Animal extends Creature {

    private Owner owner;
    private Point point;



    public void assigningPet(ArrayList<Creature> creatureArrayList) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(owner, animal.owner) && Objects.equals(point, animal.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, point);
    }

    abstract void moveUp();

    abstract void moveDown();

    abstract void moveRight();

    abstract void moveLeft();

    public abstract void print();



    public Animal() {

    }

    public Animal(String name, int age, String gender) {
        super(name, age, gender);
        this.owner = null;
    }

    public Animal(String name, int age, String gender, Owner owner, Point point) {
        super(name, age, gender);
        this.owner = owner;
        this.point = point;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
