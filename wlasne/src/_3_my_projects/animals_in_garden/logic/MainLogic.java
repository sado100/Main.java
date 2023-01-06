package _3_my_projects.animals_in_garden.logic;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.animal.Cat;
import _3_my_projects.animals_in_garden.data.creature.animal.Turtle;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;

import java.util.ArrayList;
import java.util.Scanner;

//import static _3_my_projects.animals_in_garden.logic.AnimalLogic.printAnimalList;

public class MainLogic {
    static Scanner scanner = new Scanner(System.in);
    //ArrayList<Creature> creatureArrayList = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void equalsObjects(ArrayList<Creature> creatureArrayList) {
        int j = 0;
        System.out.println("Wybierz pierwszy obiekt z listy do porownania");
        for (Creature creature : creatureArrayList) {
            j++;
            System.out.println(j + ". " + creature);
        }
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wybierz drugi obiekt z listy do porownania");
        int k = 0;
        for (Creature creature : creatureArrayList) {
            k++;
            System.out.println(k + ". " + creature);
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        boolean result = creatureArrayList.get(i - 1).equals(creatureArrayList.get(n - 1));
        System.out.println(result);
    }

    public static void managing(ArrayList<Creature> creatureArrayList) {
        System.out.println("PANEL ZARZADZANIA");
        System.out.println("MENU GLOWNE PROGRAMU");
        System.out.println("Wybierz: \n1 - Dodaj czlowieka\n2 - Dodaj zwierze\n3 - Usun Obiekt" +
                "\n4 - Przydziel zwierzatko\n0 - Powrot");

        int i = scanner.nextInt();
        scanner.nextLine();
        switch (i) {
            case 1:
                System.out.println("DODAWANIE LUDZI");
                Owner.add(creatureArrayList);
                break;
            case 2:
                System.out.println("DODAWANIE ZWIERZAT");
                System.out.println("1 - Dodaj Kota\n2 - Dodaj zolwia");
                int j = scanner.nextInt();
                scanner.nextLine();
                switch (j) {
                    case 1:
                        Cat.add(creatureArrayList);
                        break;
                    case 2:
                        Turtle.add(creatureArrayList);
                        break;
                }
                break;
            case 3:
                System.out.println("USUWANIE OBIEKTOW");
                Creature.erase(creatureArrayList);
                break;
            case 4:
                AnimalLogic.assigningPet(creatureArrayList);
                break;
            default:
                return;
        }

    }


    public static void printList(ArrayList<Creature> creatureArrayList) {
        int i = 0;
        for (Creature creature : creatureArrayList) {
            i++;
            System.out.println(i + ". " + creature.toString());
        }
    }


}
