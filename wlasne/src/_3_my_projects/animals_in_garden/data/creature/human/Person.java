package _3_my_projects.animals_in_garden.data.creature.human;

import _3_my_projects.animals_in_garden.data.creature.Creature;

public class Person extends Creature {
    String surName;


    @Override
    public void print() {
        //System.out.println(getName()+" "+getSurName()+" "+getAge()+" "+getGender());
        System.out.println("CZLOWIEK: "+toString());

    }

    @Override
    public String toString() {

        return getName()+" "+getSurName()+" "+getAge()+" "+getGender();
    }

    public Person() {
    }

    public Person(String name, int age, String surName) {
        super(name, age);
        this.surName = surName;
    }

    public Person(String name, int age, String gender, String surName) {
        super(name, age, gender);
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
