package Homework5.Program;

import java.util.LinkedList;
import java.util.Queue;

public class Parser2 {
    private static Queue<Double> stack = new LinkedList<>();

    public static Double parse(Queue<String> tokens) {
        while (!tokens.isEmpty()) {
            String token = tokens.poll();
            try {
                stack.add(Double.parseDouble(token));
            } catch (Exception e) {
                double a = stack.poll();
                double b = stack.poll();
                switch (token.charAt(0)) {
                    case '+':
                        stack.add(Calc.sum(a, b));
                        break;
                    case '-':
                        stack.add(Calc.sub(a, b));
                        break;
                    case '*':
                        stack.add(Calc.mul(a, b));
                        break;
                    case '/':
                        stack.add(Calc.div(a, b));
                        break;
                }
            }
        }
        return stack.poll();
    }
}
