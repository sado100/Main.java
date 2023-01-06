package _1_classes_and_objects.dogs_in_Java.example.data.hunting;

public class Pointer extends HunterDog {
    public Pointer() {
    }

    public Pointer(String name, int age) {
        super(name, age);
    }

    @Override
    public void hunting() {
    System.out.println("Wystawia !");
    }


}
