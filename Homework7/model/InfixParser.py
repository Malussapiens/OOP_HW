from collections import deque
class Parser:
    ops_priority = {"(": 0, "-": 1, "+": 1, "/": 2, "*": 2, "^": 3}
    ops = ops = ['(', ')', '-', '+', '/', '*', '^']

    rpn_expr = deque()


    def parse(self, tokens: deque) -> deque:
        ops = self.ops
        ops_priority = self.ops_priority
        rpn_expr = self.rpn_expr
        oper_stack = deque()
        while len(tokens) > 0:
            token = tokens.popleft()
            if token in ops:
                if token == ')':
                    while len(oper_stack) > 0 and oper_stack[len(oper_stack)-1] != '(':
                        rpn_expr.append(oper_stack.pop())
                    oper_stack.pop()
                elif token == '(':
                    oper_stack.append(token)
                else:
                    while len(oper_stack) > 0 and \
                            ops_priority[oper_stack[len(oper_stack)-1]] >= ops_priority[token]:
                        rpn_expr.append(oper_stack.pop())
                    oper_stack.append(token)
            else:
                rpn_expr.append(token)
        while len(oper_stack) > 0:
            rpn_expr.append(oper_stack.pop())
        return rpn_expr
