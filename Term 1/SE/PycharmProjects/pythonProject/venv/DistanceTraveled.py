

speed = 70
timeTravel = [6, 10, 15]
i = 0
for time in timeTravel:
    i += 1
    distance = speed * time
    print(i, end = ". ")
    print("The distance the car will travel in ", time, "hours: ", distance , "(miles)")


