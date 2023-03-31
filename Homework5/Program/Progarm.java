package Homework5.Program;

import java.util.Stack;

import Homework5.Program.Parser.InfixParser;
import Homework5.Program.Parser.RPNParser;
import Homework5.Program.Tokenizer.Tokenizer;

public class Progarm {
    public static void main(String[] args) {
        String str = "15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))";

        // TODO: реализовать калькулятор выражений из постфиксной нотации
        System.out.println("Expression: ");
        System.out.println(str);
        Stack<String> tokens = Tokenizer.tokenize(str);
        System.out.println("\nRPN:");
        tokens = InfixParser.parse(tokens);
        System.out.println(tokens);
        // Collections.reverse(tokens);
        // System.out.println(tokens);
        // Queue<String> rpn = new LinkedList<>();
        // while (!tokens.empty()) {
        //     rpn.add(tokens.pop());
        // }        
        System.out.printf("%.2f ", RPNParser.parse(tokens));
    }
}
