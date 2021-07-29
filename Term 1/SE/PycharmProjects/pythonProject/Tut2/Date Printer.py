#ask user the date in form
fullDate = input("Please enter a date in the form mm/dd/yyyy: ")

# Split date on a "/" delimiter to 3 elements: {month, day, year}
date = fullDate.split("/")

#12 months in a year in word form
monthName=["January", "Febrary", "March", "April", "May", "June", "July",
           "August", "September", "October", "November", "December"]
# month element(convert to integer) corresponding with month name (index: 0,..., 12)
date[0] = monthName[int(date[0])-1]

#month day, year
print(date[0] + " " + date[1] + ", " + date[2])