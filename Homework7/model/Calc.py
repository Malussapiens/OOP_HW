import Tokenizer
import InfixParser
import RPNParser

def calculate (infix_expression: str):
    tokens = Tokenizer.tokenize(infix_expression)
    rpn = InfixParser.parse(tokens)
    return RPNParser.parse(rpn)

