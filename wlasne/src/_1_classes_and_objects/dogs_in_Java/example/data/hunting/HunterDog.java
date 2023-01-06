package _1_classes_and_objects.dogs_in_Java.example.data.hunting;

import _1_classes_and_objects.dogs_in_Java.example.data.Dog;

public abstract class HunterDog extends Dog {

    public abstract void hunting();

    public HunterDog() {
    }

    public HunterDog(String name, int age) {
        super(name, age);
    }
}
