from collections import deque
ops_priority = {"(": 0, "-": 1, "+": 1, "/": 2, "*": 2, "^": 3}
ops = ops = ['(', ')', '-', '+', '/', '*', '^']

rpn_expr = deque()


def parse(tokens: deque) -> deque:
    oper_stack = deque()
    while len(tokens) > 0:
        token = tokens.popleft()
        print(token)
        if token in ops:
            if token == ')':
                while len(oper_stack) > 0 and oper_stack[len(oper_stack)-1] != '(':
                    print(oper_stack[0])
                    print("logic", oper_stack[0] != '(')
                    rpn_expr.append(oper_stack.pop())
                    print("brace", oper_stack)
                    print("rpn", rpn_expr)
                print("over")
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
        print("rpn", rpn_expr)
        print("opstack", oper_stack)
    rpn_expr.append(oper_stack.pop())
    return rpn_expr
