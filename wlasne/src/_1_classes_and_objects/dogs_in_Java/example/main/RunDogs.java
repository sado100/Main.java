package _1_classes_and_objects.dogs_in_Java.example.main;

import _1_classes_and_objects.dogs_in_Java.example.data.hunting.Basset;
import _1_classes_and_objects.dogs_in_Java.example.data.Dog;
import _1_classes_and_objects.dogs_in_Java.example.data.hunting.Pointer;
import _1_classes_and_objects.dogs_in_Java.example.data.SausageDog;
import _1_classes_and_objects.dogs_in_Java.example.data.working.Bernardyn;

public class RunDogs {
    public static void main() {
        Dog burek = new Dog("Fafik", 10);
        burek.setName("Reks");
        System.out.println(burek.getName());
        System.out.println(burek.old());

        SausageDog bagsio = new SausageDog("Bagsio", 8, 113);
        bagsio.birthday();
        bagsio.growth(10);
        System.out.println("Jamnik imie: " + bagsio.getName() + "\nJamnik wiek: " + bagsio.getAge() +
                "\ndlugosc: " + bagsio.getLength());

        Basset basset = new Basset();
        basset.hunting();

        Pointer pointer = new Pointer();
        pointer.hunting();

        Bernardyn bernardyn = new Bernardyn();
        bernardyn.work();

    }
}
