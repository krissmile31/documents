import math
from collections import Counter

def entropy(s):
    p, lns = Counter(s), float(len(s))
    return -sum( count/lns * math.log(count/lns, 2) for count in p.values())

class Question:
    def __init__(self, col, val):
        self.column = col
        self.value = val

    def match(self, ex):
        val = ex[self.column]
        if is_numeric(val):
            return val >= self.value
        else:
            return val == self.value


Question(1, 3)
q = Question(0, 'Green')
