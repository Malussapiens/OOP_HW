package Homework6.Program.Model;

import java.text.DecimalFormat;

import Homework6.Program.Model.Parser.InfixParser;
import Homework6.Program.Model.Parser.RPNParser;
import Homework6.Program.Model.Tokenizer.Tokenizer;

public class Calculator {
    private int accuracy;
    private String accTemplate;

    public Calculator() {
        setAccuracy(2);
    }

    public String calculate(String expr) {
        double result = RPNParser.parse(InfixParser.parse(Tokenizer.tokenize(expr)));
        return new DecimalFormat(accTemplate).format(result).replace(',', '.');
    }

    public boolean setAccuracy(int accuracy) {
        if (accuracy >= 0) {
            StringBuilder sb = new StringBuilder().append("#");
            if (accuracy > 0) {
                sb.append(".");
                for (int i = 0; i < accuracy; i++) {
                    sb.append("#");
                }
                this.accuracy = accuracy;
            }
            this.accTemplate = sb.toString();
            return true;
        } else {
            return false;
        }
    }

    public int getAccuracy() {
        return accuracy;
    }
}
