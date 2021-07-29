with open('Question.txt') as f1, open('Answer.txt') as f2:
    line_file1 = f1.readline()
    line_file2 = f2.readline()
    print(line_file1, line_file2)