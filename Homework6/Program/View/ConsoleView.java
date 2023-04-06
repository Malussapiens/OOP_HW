package Homework6.Program.View;

import java.util.Scanner;

import Homework6.Program.View.Base.IView;

public class ConsoleView implements IView {
    Scanner sc = new Scanner(System.in);

    public void printMessage(String message){
        System.out.println(message);
    }

    public String getUserInput(String prompt){
        printMessage(prompt);
        return sc.nextLine();
    }
}
