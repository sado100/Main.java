package data.animal;

import data.TurtleKind;
import data.human.Human;

public class Turtle extends Animal{
    private TurtleKind kind;

    public Turtle() {
    }

    public Turtle(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Turtle(String name, int age, String gender, Human owner) {
        super(name, age, gender, owner);
    }

    public TurtleKind getKind() {
        return kind;
    }

    public void setKind(TurtleKind kind) {
        this.kind = kind;
    }
}
