package _3_my_projects.animals_in_garden.data.creature.animal;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.enums.TurtleEnum;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Turtle extends Animal  {
    private TurtleEnum state;


    private static Turtle create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imie zolwia:");
        String name = scanner.nextLine();
        System.out.println("Wiek zolwia: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Plec zolwia: ");
        String gender = scanner.nextLine();
        Turtle turtle = new Turtle(name, age, gender);
        Point point = new Point(0,0);
        turtle.setPoint(point);
        return turtle;
    }



    public static void add(ArrayList<Creature> creatureArrayList) {
        creatureArrayList.add(create());
    }




    public void assigningPet() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Turtle turtle = (Turtle) o;
        return state == turtle.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), state);
    }

    @Override
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
        System.out.println("ZOLW " + toString());
    }

    public String toString() {
        if (getOwner() != null) {
            return "ZOLW: Imie: " + getName() + ", Stan: " + getState().getDescription() + ",Plec: " + getGender() + ",Wiek: " + getAge() +
                    ", Wlasciciel: " + getOwner().getName()+" "+getOwner().getSurName() + ", Polozenie: " + getPoint();
        } else
            return "ZOLW: Imie: " + getName() + ", Stan: " + getState().getDescription() + ",Plec: " + getGender() + ",Wiek: " + getAge() +
                    ", Wlasciciel: Bezpanski" + ", Polozenie: " + getPoint();
    }



    public Turtle(String name, int age, String gender) {
        super(name, age, gender);
        this.state = TurtleEnum.OUTSIDE;
    }

    public Turtle(String name, int age, String gender, Owner owner, Point point, TurtleEnum state) {
        super(name, age, gender, owner, point);
        this.state = state;
    }

    public TurtleEnum getState() {
        return state;
    }

    public void setState(TurtleEnum state) {
        this.state = state;
    }


}
