package logic;

import data.Creature;
import data.animal.Animal;
import data.animal.Cat;
import data.human.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static ArrayList<Creature> creatureArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Animal> petList = new ArrayList<>();

    public static void menu() {
        while (true) {
            System.out.println("MENU GLOWNE PROGRAMU");
            System.out.println("1 - tworzenie ludzi");
            System.out.println("2 - tworzenie kotow");
            System.out.println("3 - tworzenie psow");
            System.out.println("4 - tworzenie zolwi");
            System.out.println("5 - wyswietl liste");
            System.out.println("6 - usuwanie z listy");
            System.out.println("7 - przypisywanie wlascicieli zwierzetom");
            System.out.println("0 - KONIEC");
            int y = scanner.nextInt();
            scanner.nextLine();
            switch (y) {
                case 1:
                    System.out.println("tworzenie ludzi");
                    Human.add(creatureArrayList);
                    enterPress();
                    break;
                case 2:
                    System.out.println("tworzenie kotow");
                    Cat.add(creatureArrayList);
                    enterPress();
                    break;
                case 3:
                    System.out.println("tworzenie psow");
                    enterPress();
                    break;
                case 4:
                    System.out.println("tworzenie zolwi");
                    enterPress();
                    break;
                case 5:
                    System.out.println("LISTA WSZYSTKICH POSTACI");
                    for (Creature creature : creatureArrayList) {
                        System.out.println(creature);
                    }
                    enterPress();
                    break;
                case 6:
                    int i = 0;
                    System.out.println("USUWANIE Z LISTY");
                    for (Creature creature : creatureArrayList) {
                        System.out.println(i + ". " + creature);
                        i++;
                    }
                    System.out.println("wybierz z listy numer ktory chchesz usunac");
                    int choice = scanner.nextInt();
                    creatureArrayList.remove(choice);
                    break;
                case 7:
                    if(!creatureArrayList.isEmpty()) {
                        printAnimalList(creatureArrayList);
                        printOwnerList(creatureArrayList);
                    }else {
                        System.out.println("Brak zwierzat lub ludzi na liscie glownej");
                    }
                    enterPress();
                    break;
                case 0:
                    System.out.println("Bye - Bye");
                    return;
            }

        }
    }

    private static void enterPress() {

        System.out.println("Wcisnij ENTER aby kontynuowac");
        scanner.nextLine();
    }


    /*public static void assigningPet(ArrayList<Creature> creatureArrayList) {
         int listCounter = 0;
        try {
            System.out.println("listCounter = " + listCounter);
            Animal animal = printAnimalList(creatureArrayList);
            Human owner =printOwnerList(creatureArrayList);
            owner.getPetList().add(animal);
            animal.setOwner(owner);
        } catch (ClassCastException e) {
            System.out.println(e.fillInStackTrace());
        }
    }*/

    private static Human printOwnerList(ArrayList<Creature> creatureArrayList) {
        ArrayList<Human> ownerList = new ArrayList<>();
        int ownerCounter;
        int i = 0;
        int j = 0;
        System.out.println("i = " + i);
        System.out.println("i = " + j);
        for (Creature creature : creatureArrayList) {
            if (creature instanceof Human) {
                ownerList.add((Human) creature);
                i++;
            }
        }
        System.out.println("Lista ludzi: ");
        for (Human creature1 : ownerList) {
            j++;
            System.out.println(j + ". " + creature1);
        }
        System.out.println("Wybierz czlowieka, ktoremu chcesz przypisac zwierze");
        ownerCounter = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wybrales: " + ownerList.get(ownerCounter - 1));
        Human owner = ownerList.get(ownerCounter - 1);
        return owner;
    }


    private static Animal printAnimalList(ArrayList<Creature> creatureArrayList) {
        ArrayList<Animal> animalList = new ArrayList<>();
        int animalNumber;
        int i = 0;
        int j = 0;
        System.out.println("Oto lista bezpanskich zwierzat:");
        for (Creature creature : creatureArrayList) {
            if (creature instanceof Animal && ((Animal) creature).getOwner() == null) {
                animalList.add((Animal) creature);
                i++;
            }
        }

        for (Animal creature1 : animalList) {
            j++;
            System.out.println(j + ". " + creature1);
        }
        System.out.println("Wybierz zwierze z powyzszej listy podajac jego numer");
        animalNumber = scanner.nextInt();
        scanner.nextLine();
        Animal animal = animalList.get(animalNumber - 1);
        System.out.println("Wybrales: " + animal);
        return animal;
    }

}
