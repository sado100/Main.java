package _1_classes_and_objects.dogs_in_Java.example.data.working;

import _1_classes_and_objects.dogs_in_Java.example.data.Dog;
import _1_classes_and_objects.dogs_in_Java.example.interfaces.Working;

public class Husky extends Dog implements Working {
    @Override
    public void work() {
        System.out.println("Ciagnie !");
    }
}
