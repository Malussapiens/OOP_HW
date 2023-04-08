import Tokenizer
import InfixParser
import Ops as op

from collections import deque

ops = ['(', ')', '-', '+', '/', '*', '^']
stack = deque()

def parse(rpn:deque):
    while len(rpn)>0:
        token = rpn.popleft()
        print("token", token)
        print("rpn", rpn)
        if token in ops:
            b = float(stack.pop())
            a = float(stack.pop())
            if token == '+':
                stack.append(op.sum(a, b))
            elif token == "-":
                stack.append(op.sub(a, b))
            elif token == '*':
                stack.append(op.mul(a, b))
            elif token == '/':
                stack.append(op.div(a, b))
        else:
            stack.append(token)
        print("stack", stack)
    return stack.pop()

exp_str =  '15/(7-(1+1))*3-(2+(1+1))*15/(7-(200+1))*3-(2+(1+1))*(15/(7-(1+1))*3-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1)))'
# exp_str = "(1+(4-(2*2)))/2"
tokens = Tokenizer.tokenize(exp_str)
print('tokens', tokens)
rpn = InfixParser.parse(tokens)
print('rpn', rpn)
print("parsing")
print("res", parse(rpn))
