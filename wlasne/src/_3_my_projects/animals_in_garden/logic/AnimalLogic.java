package _3_my_projects.animals_in_garden.logic;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.animal.Animal;
import _3_my_projects.animals_in_garden.data.creature.animal.Cat;
import _3_my_projects.animals_in_garden.data.creature.animal.Turtle;
import _3_my_projects.animals_in_garden.data.creature.enums.TurtleEnum;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalLogic {

    static Scanner scanner = new Scanner(System.in);

    public static void moving(ArrayList<Creature> creatureArrayList) {
        while (true) {
            System.out.println("PORUSZANIE ZWIERZETAMI");
            System.out.println("1 - kontynuuj\n0 - Powrot");
            int m = scanner.nextInt();
            scanner.nextLine();
            if (m == 0) {
                return;
            } else {

                MainLogic.printList(creatureArrayList);
                System.out.println("Wybierz zwierze z listy powyzej");
                int n = scanner.nextInt();
                scanner.nextLine();
                if (creatureArrayList.get(n - 1) instanceof Owner) {
                    System.out.println("MOZESZ PORUSZAC TYLKO ZWIERZETAMI, A WYBRALES CZLOWIEKA!!!");
                    enterPress();
                } else {
                    if (creatureArrayList.get(n - 1) instanceof Turtle) {
                        System.out.println("Twoje zwierze jest klasy: " + creatureArrayList.get(n - 1).getClass());
                        System.out.println("Jego obecne polozenie: " + ((Turtle) creatureArrayList.get(n - 1)).getPoint());

                        while (true) {
                            if (((Turtle) creatureArrayList.get(n - 1)).getState()==TurtleEnum.INSIDE) {
                                System.out.println("Musisz nakarmic zolwia, inaczej nigdzie nie pojdzie.");
                                System.out.println("1 - nakarm\n2 - nie karm");
                                int y = scanner.nextInt();
                                scanner.nextLine();
                                switch (y) {
                                    case 1:
                                        ((Turtle) creatureArrayList.get(n - 1)).setState(TurtleEnum.OUTSIDE);
                                        System.out.println("Pojedzone, zolw moze sie ruszyc.");
                                        break;
                                    case 2:
                                        System.out.println("Nie jemy, nie idziemy!!!");
                                        return;
                                }
                            }
                            System.out.println("1 - gora\n2 - dol\n3 - prawo\n4 - lewo\n0 - WYJSCIE");
                            int j = scanner.nextInt();
                            scanner.nextLine();

                            if (j == 1) {

                                ((Turtle) creatureArrayList.get(n - 1)).moveUp();
                                System.out.println("Polozenie: " + ((Turtle) creatureArrayList.get(n - 1)).getName() + " "
                                        + ((Turtle) creatureArrayList.get(n - 1)).getPoint());
                            } else if (j == 2) {
                                ((Turtle) creatureArrayList.get(n - 1)).moveDown();
                                System.out.println("Polozenie: " + ((Turtle) creatureArrayList.get(n - 1)).getName() + " "
                                        + ((Turtle) creatureArrayList.get(n - 1)).getPoint());
                            } else if (j == 3) {
                                ((Turtle) creatureArrayList.get(n - 1)).moveRight();
                                System.out.println("Polozenie: " + ((Turtle) creatureArrayList.get(n - 1)).getName() + " "
                                        + ((Turtle) creatureArrayList.get(n - 1)).getPoint());
                            } else if (j == 4) {
                                ((Turtle) creatureArrayList.get(n - 1)).moveLeft();
                                System.out.println("Polozenie: " + ((Turtle) creatureArrayList.get(n - 1)).getName() + " "
                                        + ((Turtle) creatureArrayList.get(n - 1)).getPoint());
                            } else if (j == 0) {
                                return;
                            }
                            ((Turtle) creatureArrayList.get(n - 1)).setState(TurtleEnum.INSIDE);
                        }

                    } else if (creatureArrayList.get(n - 1) instanceof Cat) {
                        Cat cat = (Cat) creatureArrayList.get(n - 1);
                        System.out.println("Twoje zwierze jest klasy: " + cat.getClass());

                        while (true) {
                            System.out.println("1 - gora\n2 - dol\n3 - prawo\n4 - lewo\n0 - WYJSCIE");
                            int j = scanner.nextInt();
                            scanner.nextLine();

                            if (j == 1) {
                                cat.moveUp();
                                System.out.println("Polozenie: " + (cat.getName() + " x = " + cat.getPoint().getxCord() + " y = "
                                        + cat.getPoint().getyCord()));
                                //((Cat) creatureArrayList.get(i - 1)).moveUp();
                            } else if (j == 2) {
                                cat.moveDown();
                                System.out.println("Polozenie: " + (cat.getName() + " x = " + cat.getPoint().getxCord() + " y = "
                                        + cat.getPoint().getyCord()));
                                //((Cat) creatureArrayList.get(i - 1)).moveDown();
                            } else if (j == 3) {
                                cat.moveRight();
                                System.out.println("Polozenie: " + (cat.getName() + " x = " + cat.getPoint().getxCord() + " y = "
                                        + cat.getPoint().getyCord()));
                                //((Cat) creatureArrayList.get(i - 1)).moveRight();
                            } else if (j == 4) {
                                cat.moveLeft();
                                System.out.println("Polozenie: " + (cat.getName() + " x = " + cat.getPoint().getxCord() + " y = "
                                        + cat.getPoint().getyCord()));
                                //((Cat) creatureArrayList.get(i - 1)).moveLeft();
                            } else if (j == 0)
                                return;
                        }
                    }
                }
            }
        }
    }

    private static void enterPress() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Wcisnij ENTER aby kontynuowac");
        scanner.nextLine();
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

    private static Owner printOwnerList(ArrayList<Creature> creatureArrayList) {
        ArrayList<Owner> ownerList = new ArrayList<>();
        int ownerCounter;
        int i = 0;
        int j = 0;
        System.out.println("i = " + i);
        System.out.println("i = " + j);
        for (Creature creature : creatureArrayList) {
            if (creature instanceof Owner) {
                ownerList.add((Owner) creature);
                i++;
            }
        }
        System.out.println("Lista ludzi: ");
        for (Owner creature1 : ownerList) {
            j++;
            System.out.println(j + ". " + creature1);
        }
        System.out.println("Wybierz czlowieka, ktoremu chcesz przypisac zwierze");
        ownerCounter = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wybrales: " + ownerList.get(ownerCounter - 1));
        Owner owner = ownerList.get(ownerCounter - 1);
        return owner;
    }


    static int listCounter = 0;

    public static void assigningPet(ArrayList<Creature> creatureArrayList) {

        try {
            System.out.println("listCounter = " + listCounter);
            Animal animal = printAnimalList(creatureArrayList);
            Owner owner =printOwnerList(creatureArrayList);
            owner.getPetList().add(animal);
            animal.setOwner(owner);
        } catch (ClassCastException e) {
            System.out.println(e.fillInStackTrace());
        }

        //((Owner) printOwnerList(creatureArrayList)).setAnimal(printAnimalList(creatureArrayList));
    }
}
