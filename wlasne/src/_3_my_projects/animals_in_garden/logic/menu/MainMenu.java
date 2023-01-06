package _3_my_projects.animals_in_garden.logic.menu;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.logic.AnimalLogic;
import _3_my_projects.animals_in_garden.logic.MainLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    ArrayList<Creature> creatureArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {

        while (true) {
            System.out.println("MENU GLOWNE PROGRAMU");
            System.out.println("Wybierz: \n1 - ZARZADZANIE\n2 - PORUSZANIE\n3 - WYDRUK\n4 - POROWNAJ obiekty\n0 - WYJSCIE");

            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i) {
                case 1:
                    MainLogic.managing(creatureArrayList);
                    enterPress();
                    break;
                case 2:
                    AnimalLogic.moving(creatureArrayList);
                    enterPress();
                    break;
                case 3:
                    MainLogic.printList(creatureArrayList);
                    enterPress();
                    break;
                case 4:
                    MainLogic.equalsObjects(creatureArrayList);
                    enterPress();
                    break;
                case 0:
                    System.out.println("Bye - Bye");
                    return;
                default:
                    return;
            }

        }

    }

    private void enterPress() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Wcisnij ENTER aby kontynuowac");
        scanner.nextLine();
    }

}
