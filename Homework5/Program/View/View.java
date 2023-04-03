package Homework5.Program.View;

import java.util.Scanner;

public class View {
    static void printMessage(String message){
        System.out.println(message);
    }

    public static String getUserInput(String message, Scanner sc){
        printMessage(message);
        return sc.nextLine();
    }
}
