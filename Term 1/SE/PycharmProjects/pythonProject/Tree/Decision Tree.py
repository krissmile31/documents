import math
import csv

def entropy(s):
    attr = list(set(s))
    if len(attr) == 1:
        return 0

    counts = [0, 0]
    for i in range(2):
        for j in s:
            if attr[i] == j:
                counts[i] = sum(j) / (len(s) * 1.0)
    sums = 0
    for c in counts:
        sums += -1 * c * math.log2(c)
    return sums


class Node:
    def __init__(self, attribute):
        self.attribute = attribute
        self.children = []
        self.answer = ""

def build_tree(data, features):
    for row in data:
        last_column = row[-1]
    if (len(set(last_column))) == 1:
        node = Node("")
        node.answer = last_column[0]
        return node

    n = len(data[0]) - 1
    gains = [0] * n

    for col in range(n):
        gains[col] = compute_gain(data, col)

    split = gains.index(max(gains))
    node = Node(features[split])
    fea = features[:split] + features[split + 1:]

    attr, dic = subtables(data, split, delete = True)

    for x in range(len(attr)):
        child = build_tree(dic[attr[x]], fea)
        node.children.append((attr[x], child))
    return node

def compute_gain(data, col):
    attValues, dic = subtables(data, col, delete = False)
    for row in data:
        total_entropy = entropy(row[-1])

    for x in range(len(attValues)):
        ratio = len(dic[attValues[x]]) / (len(data) * 1.0)
        for row in dic[attValues[x]]:
            entro = entropy(row[-1])
        total_entropy -= ratio * entro
    return total_entropy

def subtables(data, col, delete):
    dic = {}
    for row in data:
        coldata = row[col]
    attr = list(set(coldata))
    counts = [0] * len(attr)
    r = len(data)
    c = len(data[0])
    for x in range(len(attr)):
        for y in range(r):
            if data[y][col] == attr[x]:
                counts[x] += 1
    for x in range(len(attr)):
        dic[attr[x]] = [[0 for i in range(c)] for j in range(counts[x])]
        pos = 0
        for y in range(r):
            if data[y][col] == attr[x]:
                if delete:
                    del data[y][col]
                dic[attr[x]][pos] = data[y]
                pos += 1
    return attr, dic

def print_tree(node, level):
    if node.answer != "":
        print(" " * level, node.answer)
        return
    print(" " * level, node.attribute)
    for value, n in node.children:
        print(" " * (level+1), value)
        print_tree(n, level + 2)
def load_csv(filename):
    lines = csv.reader(open(filename, 'r'))
    dataset = list(lines)
    headers = dataset.pop(0)
    return dataset, headers
dataset, features = load_csv("tennis.csv")
node = build_tree(dataset, features)
print("The decision tree for the dataset using ID3 algorithm is ")
print_tree(node, 0)

training_data = [
    ['Green', 3, 'Apple'],
    ['Yellow', 3, 'Apple'],
    ['Red', 1, 'Grape'],
    ['Red', 1, 'Grape'],
    ['Yellow', 3, 'Lemon'],
]


header = ["color", "meat", "seafood"]
