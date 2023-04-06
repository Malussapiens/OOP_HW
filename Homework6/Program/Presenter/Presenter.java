package Homework6.Program.Presenter;

import Homework6.Program.View.Menu;
import Homework6.Program.Model.Calculator;
import Homework6.Program.View.ConsoleView;

public class Presenter {
    public void run() {
        ConsoleView view = new ConsoleView();
        
        String[] mainMenuItems = new String[] {
                "Вычислить выражение",
                "Установить точность",
                "Выход" };
        Menu mainMenu = new Menu(view, mainMenuItems);
        
        String prompt;
        String choice;
        String expr;

        // test expression =
        // "15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))";
        // result is -30,072165

        Calculator calc = new Calculator();
        boolean stopMainMenu = false;
        
        do {
            mainMenu.show();
            choice = mainMenu.getUserChoice("Ваш выбор: ");
            switch (choice) {
                case "1":
                    prompt = "Введите выражение: ";
                    expr = view.getUserInput(prompt);
                    String result = String.format(
                            "\nРезультат: %s\n\n", calc.calculate(expr));
                    view.printMessage(result);
                    break;
                case "2":
                    prompt = "Текущая точность: " + calc.getAccuracy() + " знака.";
                    view.printMessage(prompt);
                    prompt = "Введите желаемую точность";
                    try {
                        int accuracy = Integer.parseInt(view.getUserInput(prompt));
                        if (!calc.setAccuracy(accuracy)) {
                            view.printMessage("Неверный ввод!");
                        } else {
                            view.printMessage("Установлена точность: " + calc.getAccuracy() + " знаков");
                        }
                    } catch (Exception e) {
                        System.out.println("Неверный ввод!");
                    }
                    break;
                case "3":
                    prompt = "До свидания!";
                    stopMainMenu = true;
                    view.printMessage(prompt);
                    break;
                default:
                    prompt = "Неверный ввод!";
                    view.printMessage(prompt);
                    break;
            }
        } while (!stopMainMenu);
    }
}
