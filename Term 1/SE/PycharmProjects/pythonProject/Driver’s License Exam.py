

answerDict = ['A', 'C', 'A', 'A', 'D', 'B', 'C', 'A', 'C', 'B', 'A', 'D', 'C', 'A', 'D', 'C', 'B', 'B', 'D', 'A']
question = ['Before backing up, you should', 'It is best to keep a space cushion', 'When no signs, signals, or police tell you what to do at an intersection, the law states that',
            'You must yield the right-of-way to an approaching vehicle when you are', 'You have the right-of-way when you are', 'If an approaching train is near enough or going fast enough to be a danger, you must',
            'You are waiting to turn left at a multilane intersection, and opposing traffic is blocking your view, you should', 'The extra space in front of a large truck is needed for',
            'When you enter traffic from a stop (away from the curb), you', 'Which of the following statements is true', 'When traveling behind a motorcycle', 'This sign means',
            'When passing another vehicle, it is safe to return to your lane if you', 'You may legally block an intersection when', 'A traffic light which has a green arrow and a red light means that',
            'The driver(see in picture) is', 'You can avoid dangerous last minute maneuvers by looking ____ ahead of your vehicle at all times.', 'If someone is driving aggressively behind you, you should',
            'If you are driving and a dust storm blows across the freeway causing reduced visibility, you should reduce your speed and turn on your', 'You drive defensively when you']
key = ['A. Rely on your mirrors to see if it is clear to proceed\nB. Flash your lights\nC. Open your door to see if it is clear to proceed\nD. Turn your head and look through the rear wind',
       'A. Only in back of your vehicle\nB. Only on the left and right side of your vehicle\nC. Only in front of the vehicle\nD. On all sides of the vehicle',
       'A. Drivers on the right must yield to drivers on the left\nB. There are no laws stating who must yield\nC. Drivers going straight must yield to drivers turning left at the intersection\nD. Drivers turning left must yield to drivers going straight through the intersection',
       'A. Already in a traffic circle.\nB. Already in an intersection.\nC. Going straight ahead.\nD. Turning left.',
       'A. Entering a traffic circle.\nB. Backing out of a driveway.\nC. Leaving a parking space.\nD. Already in a traffic circle.',
       'A. Slow down and proceed with caution.\nB. Not cross the tracks until the train has completely passed.\nC. Cross the tracks at your own risk.\nD. Find an alternative route across tracks.',
       'A. Accelerate rapidly when the first lane you need to cross is clear\nB. Wait until you can see all the lanes you need to cross before going ahead with your turn\nC. Wait for the opposing driver to wave you across the intersection\nD. Edge your car into each lane of opposing traffic as soon as it clears',
       'A. Other drivers when merging onto a freeway.\nB. The truck driver to stop the vehicle.\nC. Other drivers when they want to slow down.',
       'A. Should drive slower than other traffic for 200 feet.\nB. Need a large enough gap to get up to the speed of traffic.\nC. Should wait for the first two vehicles to pass, then drive into the lane.',
       'A. When an animal is seen in the road or on the road shoulder, you should slow down and, if necessary, yield the right-of-way.\nB. Horses have excellent side vision and are not easily frightened by loud noises or sudden movements.\nC. Often an animal\'s fur shining in the headlight beams will be seen first at night.\nD. all of the above',
       'A. Allow a following distance of at least 2 car lengths\nB. Allow at least 2 seconds of following distance\nC. Allow at least 4 seconds of following distance\nD. Allow a following distance of at least 4 motorcycle lengths',
       "A. General service sign for a hospital.\nB. General service sign for a doctor's office.\nC. General service sign for a pharmacy.\nD. General service sign for parking.",
       'A. Cannot see the vehicle directly to your right.\nB. See the vehicle’s headlights in your rear view mirror.\nC. Have passed the other vehicle’s front bumper.',
       'A. You entered on a green light.\nB. There is extremely heavy traffic.\nC. It is never legal to block an intersection.\nD. I do this all the time.',
       'A. You may only drive straight ahead.\nB. You may drive only in the direction of the green arrow.\nC. You must wait for a green light.\nD. Vehicles moving in any direction must stop.',
       'A. Turning left\nB. Slowing\nC. Stopping\nD. Turning right',
       'A. 10 to 15 seconds\nB. 20 to 25 seconds\nC. 15 to 30 Seconds/nD. I never stop for school buses.',
       'A. Try to get out of the aggressive driver`s way\nB. Stare at the driver as he or she is passing you\nC. Speed up as he or she is passing you\nD. Block the passing lane',
       'A. Emergency flashers.\nB. Parking lights.\nC. Head lights.\nD. Horn',
       'A. Always put one car length between you and the car ahead.\nB. Look only at the car in front of you while driving.\nC. Keep your eyes moving to look for possible hazards.' ]


# initialise count
count = 0
print('Driver’s License Exam!')
print()
print('press Enter key to test')
s = input()
# 20 questions + answers
for i in range(20):
    # ordinal number
    print(i+1, end='. ')

    # Test with multiple choices
    print(question[i] + '?')
    print()
    print(key[i])

    # enter your answer
    answer = input()

    # each element in array answerDict
    for x in answerDict:
        # correct answer
        if answer == answerDict[i]:
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







