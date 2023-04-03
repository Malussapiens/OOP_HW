package Homework5.Program.Classes.Parser;

import java.util.Stack;

import Homework5.Program.Classes.Calc.Calc;

public class RPNParser {
    private static Stack<Float> stack = new Stack<>();

    public static float parse(Stack<String> tokens) {
        while (!tokens.isEmpty()) {
            String token = tokens.pop();
            try {
                stack.push(Float.parseFloat(token));
            } catch (Exception e) {
                float b = stack.pop();
                float a = stack.pop();
                switch (token.charAt(0)) {
                    case '+':
                        stack.push(Calc.sum(a, b));
                        break;
                    case '-':
                        stack.push(Calc.sub(a, b));
                        break;
                    case '*':
                        stack.push(Calc.mul(a, b));
                        break;
                    case '/':
                        stack.push(Calc.div(a, b));
                        break;
                }
            }
        }
        return stack.pop();
    }
}
