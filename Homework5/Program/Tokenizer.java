package Homework5.Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Tokenizer {
    static Stack<String> tokens;
    static Character[] ops = new Character[] { '(', ')', '-', '+', '/', '*', '^' };
    static List<Character> opTokens = Arrays.asList(ops);

    public static Stack<String> tokenize(String str) {
        tokens = new Stack<>();

        StringBuilder token = new StringBuilder();
        for (char chr : str.toCharArray()) {
            if (Character.isDigit(chr)) {
                token.append(chr);
            } else {
                switch (chr) {
                    case '.':
                        token.append(chr);
                        break;
                    // case '-'
                    case '-':
                        // if unary minus
                        if (token.length() < 1) {
                            if (tokens.empty()) {
                                token.append(chr);
                            } else if (tokens.peek().length() == 1) {
                                opTokens.contains(tokens.peek().charAt(0));
                                token.append(chr);
                            }
                            break;
                        }
                    // case '+', '-' (not unary), '*', '/', '(', ')':
                    default:
                        if (token.length() > 0) {
                            tokens.push(token.toString());
                            token.setLength(0);
                        }
                        tokens.push(String.valueOf(chr));
                        break;
                }
            }
        }
        if (token.length() > 0) {
            tokens.push(token.toString());
            token.setLength(0);
        }
        Collections.reverse(tokens);
        return tokens;
    }
}
