package Homework5.Program;

import java.text.DecimalFormat;
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
        String accTemplate = "#.##";

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
                    String result = String.format(
                            "\nРезультат: %s\n\n",
                            new DecimalFormat(accTemplate).format(calc.calculate(expr)));
                    View.printMessage(result);
                    break;
                case "2":
                    prompt = "Введите желаемую точность";
                    try {
                        int accuracy = Integer.parseInt(View.getUserInput(prompt, sc));
                        if (accuracy >= 0) {
                            StringBuilder sb = new StringBuilder().append("#");
                            if (accuracy > 0) {
                                sb.append(".");
                                for (int i = 0; i < accuracy; i++) {
                                    sb.append("#");
                                }
                            }
                            accTemplate = sb.toString();
                        } else if (accuracy < 0) {
                            System.out.println("Неверный ввод!");
                        }
                    } catch (Exception e) {
                        System.out.println("Неверный ввод!");
                    }
                    break;
                case "3":
                    prompt = "До свидания!";
                    stopMainMenu = true;
                    View.printMessage(prompt);
                    sc.close();
                    break;
                default:
                    prompt = "Неверный ввод!";
                    View.printMessage(prompt);
                    break;
            }
        } while (!stopMainMenu);
    }
}
