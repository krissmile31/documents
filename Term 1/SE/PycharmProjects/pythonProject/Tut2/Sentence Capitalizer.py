# a copy of string: 1st character of each sentence capitalized.
def Cap(string):
  #initialise result
  capital = ""

  #Convert string into list to access to elements of string
  string = list(string)

  #Loop over the list
  for i in range(len(string)):
    #the mark over sentence --> capitalise the sentence behind
    if string[i] == '.' or string[i] == '!' or string[i] == '?':
      #the next space after the punctuation mark
      if string[i+1] == ' ':
        #convert the required alphabets into upper case
        string[i+2] = string[i+2].upper()

      #without space
      else:
        #add space + capitalise the next sentence
        string[i+1] = ' ' + string[i+1].upper()

    #the first char in the first sentence
    if i == 0:
      #Capitalise
      string[i] = string[i].upper()

  #Convert the list back to string
  for j in string:
    #the complete sentence --> return the string
    capital += j
  return capital

#Take string from user
string = input("Enter the string: ")

print("The modified string: ", Cap(string))

