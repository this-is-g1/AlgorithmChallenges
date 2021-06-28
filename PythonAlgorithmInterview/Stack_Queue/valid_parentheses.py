if __name__ == "__main__":
    customInput = "()[]{}"
    # Algorithm here
    stack = []
    mappings = {
        ')': '(',
        ']': '[',
        '}': '{'
    }

    for s in customInput:
        if s not in mappings:
            stack.append(s)
        elif not stack or mappings[s] != stack.pop():
            print(False)
    print(len(stack) == 0)