package Homework5.Program.Classes;

import Homework5.Program.Classes.Parser.InfixParser;
import Homework5.Program.Classes.Parser.RPNParser;
import Homework5.Program.Classes.Tokenizer.Tokenizer;

public class Calculator {
    public double calculate(String expr) {
        return RPNParser.parse(InfixParser.parse(Tokenizer.tokenize(expr)));
    }
}
