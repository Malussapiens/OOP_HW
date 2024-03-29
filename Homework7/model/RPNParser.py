import Ops as op
from collections import deque

class RPN_Parser:
    ops = ['(', ')', '-', '+', '/', '*', '^']
    stack = deque()

    def parse(self, rpn:deque):
        stack = self.stack
        ops = self.ops
        while len(rpn)>0:
            token = rpn.popleft()
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
        return stack.pop()


