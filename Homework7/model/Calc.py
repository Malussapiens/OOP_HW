import Tokenizer
import InfixParser
import RPNParser

class Calculator:
    def calculate (self, infix_expression: str):
        tokenizer = Tokenizer.Tokenizer()
        tokens = tokenizer.tokenize(infix_expression)
        infix_parser = InfixParser.Parser()
        rpn = infix_parser.parse(tokens)
        rpn_parser = RPNParser.RPN_Parser()
        return rpn_parser.parse(rpn)
