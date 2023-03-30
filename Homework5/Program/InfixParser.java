package Homework5.Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixParser {
    static Stack<String> rpn_out;
    static Map<String, Integer> opsPriority = new HashMap<>(Map.of(
            "(", 0, "-", 1, "+", 1, "/", 2, "*", 2, "^", 3));

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Stack<String> parse(Stack<String> tokens) {
        rpn_out = new Stack<>();
        Stack<String> operStack = new Stack<>();
        while (!tokens.empty()) {
            String token = tokens.pop();
            switch (token) {
                // if open brace token, push to operation stack
                case "(":
                    operStack.push(token);
                    break;
                // if close brace token, push all from operation stack to output stack until
                // open
                // brace
                case ")":
                    while (operStack.size() > 0 && !operStack.peek().equals("(")) {
                        rpn_out.push(operStack.pop());
                    }
                    // and pop open brace
                    operStack.pop();
                    break;
                default:
                    // if operation, push all higher or equal priority ops from operation stack
                    // to output stack
                    if (opsPriority.containsKey(token)) {
                        while (operStack.size() > 0
                                && opsPriority.get(operStack.peek()) >= opsPriority.get(token)) {
                            rpn_out.push(operStack.pop());
                        }
                        // push operation token to operation stack
                        operStack.push(token);
                        break;
                    }
                    // push number token to output stack
                    rpn_out.push(token);
                    break;
            }
        }
        // after all, push all remaining operations tokens to output stack
        while (!operStack.empty()) {
            rpn_out.push(operStack.pop());
        }
        return rpn_out;
    }

}
