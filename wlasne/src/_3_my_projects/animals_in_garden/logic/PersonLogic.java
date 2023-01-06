package _3_my_projects.animals_in_garden.logic;

import _3_my_projects.animals_in_garden.data.creature.Creature;
import _3_my_projects.animals_in_garden.data.creature.animal.Animal;
import _3_my_projects.animals_in_garden.data.creature.human.Owner;
import _3_my_projects.animals_in_garden.data.creature.interfaces.PersonLogicInterface;

import java.util.ArrayList;

public class PersonLogic {

    private static void printOwnerList(ArrayList<Creature> creatureArrayList) {
        ArrayList<Creature> ownerList = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (Creature creature : creatureArrayList) {
            if (creature instanceof Owner) {
                ownerList.add(creature);
                i++;
            }
        }
        System.out.println("Lista zwierzakow: ");
        for (Creature creature1 : ownerList) {
            j++;
            System.out.println(j + ". " + creature1);
        }
    }

    public static void assigningPet(ArrayList<Creature> creatureArrayList) {
        printOwnerList(creatureArrayList);
        System.out.println("Wybierz wlasciciela z powyzszej listy podajac jego numer");
    }




}
