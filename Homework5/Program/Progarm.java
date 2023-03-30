package Homework5.Program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Progarm {
    public static void main(String[] args) {
        String str = "(24.2+(-4.5-3))*6";
        //str = "(-4.5-3.5)*5";

        // TODO: реализовать алгоритм "Сортировочной станции" Дейкстры
        System.out.println("Expression: ");;
        System.out.println(str);
        Stack<String> tokens =Tokenizer.tokenize(str);
        System.out.println("\nRPN:");
        System.out.println(InfixParser.parse(tokens));

        // Parser parser = new Parser();
        // System.out.println(st);
        // System.out.println(Parser2.parse(st));

    }
}
