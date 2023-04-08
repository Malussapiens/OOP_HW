from collections import deque as queue
tokens = queue()
ops = ['(', ')', '-', '+', '/', '*', '^']


def tokenize(expression: str) -> queue:
    token = ''

    for char in expression:
        if char in ops:
            if len(token) > 0:
                tokens.append(token)
                token = ''
            if char == '-':
                if len(token) == 0:
                    token += char
                continue
            token = char
            tokens.append(token)
            token = ''
        elif str.isdigit(char) or char == '.':
            token += char
    
    if token != '':
        tokens.append(token)
    return tokens

