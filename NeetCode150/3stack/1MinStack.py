class MinStack:

    # Time O(1)
    def __init__(self):
        self.stack = []
        self.min_list = []

    # Time O(1)
    def push(self, val: int) -> None:
        if not self.min_list: self.min_list.append(val)
        elif val <= self.min_list[-1]: self.min_list.append(val)
        self.stack.append(val)

    # Time O(1)
    def pop(self) -> None:
        popped_val = self.stack.pop()    
        if popped_val == self.min_list[-1]: self.min_list.pop()

    # Time O(1)
    def top(self) -> int:
        return self.stack[-1]

    # Time O(1)
    def getMin(self) -> int:
        return self.min_list[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()