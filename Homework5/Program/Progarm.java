package Homework5.Program;

import java.util.Scanner;
import Homework5.Program.Classes.Calculator;
import Homework5.Program.View.Menu;
import Homework5.Program.View.View;

public class Progarm {
    public static void main(String[] args) {
        String[] mainMenuItems = new String[] {
                "Вычислить выражение",
                "Установить точность",
                "Выход" };
        Menu mainMenu = new Menu(mainMenuItems);
        String prompt;
        String choice;
        String expr;
        
        // test expression =
        // "15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))";
        // result is -30,072165
        
        Scanner sc = new Scanner(System.in);
        boolean stopMainMenu = false;
        do {
            mainMenu.show();
            choice = mainMenu.getUserChoice("Ваш выбор: ");
            switch (choice) {
                case "1":
                    prompt = "Введите выражение: ";
                    expr = View.getUserInput(prompt, sc);
                    Calculator calc = new Calculator();
                    System.out.printf("\nРезультат: %f\n\n", calc.calculate(expr));
                    break;
                case "2":
                    prompt = "Введите желаемую точность";
                    break;
                case "3":
                    prompt = "До свидания!";
                    stopMainMenu = true;
                    break;
                default:
                    prompt = "Неверный ввод!";
                    break;
            }
        } while (!stopMainMenu);
        
    }
}
