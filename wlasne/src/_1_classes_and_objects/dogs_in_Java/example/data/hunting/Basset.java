package _1_classes_and_objects.dogs_in_Java.example.data.hunting;

public class Basset extends HunterDog{
    @Override
    public void hunting() {
        System.out.println("Tropi !");
    }

    public Basset() {
    }

    public Basset(String name, int age) {
        super(name, age);
    }


}
