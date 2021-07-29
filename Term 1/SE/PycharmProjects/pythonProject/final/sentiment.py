from collections import Counter

def dict():
    d = {}

def readFile(fileName):
    with open(fileName) as file:
        b = " ".join([l.rstrip() for l in file])
        print(b.lower().split())
    return b
        # words = file.read().splitlines()  # puts the file into an array
        # file.close()
        # return words
        # c = TextBlob(b)
        # print(b.sentiment)

def ord(text):
    # a = ord(s)
    # return a
    if text.isalpha():
        return text
    else:
        a =  chr(text)
        return a
def calculation(text):
    ord(text)
    a = Counter(text)
    # if s == 'best':
    #     score = 4


    print('score = ', score)
    return score


def score(s):
    calculation(s)
    score = []
    return score

def average(score, text):
    readFile()
    score()
    while True:
        if score > 2.01:
            print(text + 'is positive')
            positive = score

        elif score < 1.99:
            print(text + 'is negative')
            negative = score

        else:
            return

            while True:
                print('Am I right (yes/no)?')
                user = input()
                if user == 'yes':
                    break
                elif user == 'no':
                    print('What score should this sentence have (0 - 4 where 4 is the most positive)?')
                    correct = input()
                    break
                else:
                    print('Invalid input!')
        break
    return positive, negative

def bestScore(score, text):
    readFile()
    print('Maximum score is ', max(score), 'for', text)
    print('Minimum score is ', min(score), 'for', text)

def sortWords(score):
    sort = average(score)
    pos = open('positives.txt', 'a')
    positive = sort[0]
    pos.write(positive)
    pos.close()
    neg = open('negatives.txt', 'a')
    negative = sort[1]
    neg.write(negative)
    neg.close()


def main():
    print('Learning data file name?', end = ' ')
    print('training.txt')
    enter = input()
    print('What would you like to do?')
    while True:
        print('1: Get the score of a word')
        print('2: Get the average score of words in a file')
        print('3: Find the highest / lowest scoring words in a file')
        print('4: Sort the words in a file into positive.txt and negative.txt')
        print('5: Exit the program')
        print('Enter a number 1 - 5:')
        inputt = int(input())
        if inputt == 1:
            print('which word?')
            score()
            average()
        if inputt == 2:
            print('file name?')
            average(score)

        if inputt == 3:
            print('file name?')
            bestScore(score)
        if inputt == 4:
            sortWords()
        if inputt == 5:
            break

main()
