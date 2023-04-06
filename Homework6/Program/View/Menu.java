package Homework6.Program.View;

import Homework6.Program.View.Base.IView;

public class Menu {
    IView view;
    String[] menu;

    public Menu(IView view, String[] menu){
        this.view = view;
        this.menu = menu;
    }

    public void show() {
        view.printMessage("===========");
        for (int i = 0; i < menu.length; i++) {
            view.printMessage(String.format("%d - %s", i + 1, menu[i]));
        }
        view.printMessage("===========");
    }

    public String getUserChoice(String prompt){
        return view.getUserInput(prompt);
    }
    
    public int count(String[] menu){
        return menu.length;
    }
}
