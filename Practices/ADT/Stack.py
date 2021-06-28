from Node import Node

class Stack:
    def __init__(self):
        self.last = None

    def push(self, item):
        self.last = Node(item, self.last)
    
    def pop(self):
        if self.last is None:
            raise Exception("Stack is Empty")
        item = self.last.item
        self.last = self.last.next
        return item