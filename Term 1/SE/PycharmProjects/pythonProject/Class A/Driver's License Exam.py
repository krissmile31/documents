
answerDict = ['A', 'C', 'A', 'A', 'D', 'B', 'C', 'A', 'C', 'B', 'A', 'D', 'C', 'A', 'D', 'C', 'B', 'B', 'D', 'A']
with open('Question.txt') as f1, open('Answer.txt') as f2:
    count = 0
    for i in range(20):
        question = f1.readline()
        answer = f2.readline()
        print(question)
        print(answer)
        ans = input()

        # each element in array answerDict
        for x in answerDict:
            # correct answer
            if ans == answerDict[i]:
                print("True\n")
                # count correct answer to check pass or fail
                count += 1
                break

            # incorect answer
            else:
                print("False\n")
                break
    print('Correct Answers: ', count + '\n')
    # more 15 correct answers
    if count >= 15:
        print("You passed Driver's License Exam!")
    else:
        print("You failed!")

