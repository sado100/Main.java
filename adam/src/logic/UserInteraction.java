package logic;

import java.util.Scanner;

public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString(){
        return scanner.nextLine();
    }
}

