package Homework5.Program.View;

import java.util.Scanner;

public class Menu {
    String[] menu;
    static Scanner sc = new Scanner(System.in);
    public Menu(String[] menu){
        this.menu = menu;
    }
    public void show() {
        View.printMessage("===========");
        for (int i = 0; i < menu.length; i++) {
            View.printMessage(String.format("%d - %s", i + 1, menu[i]));
        }
        View.printMessage("===========");
    }

    public String getUserChoice(String prompt){
        return View.getUserInput(prompt, sc);
    }
    
    public int count(String[] menu){
        return menu.length;
    }
}
