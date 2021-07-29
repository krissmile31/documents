

purchase = int(input("Enter the amount of a purchase: "))
stateTax = purchase * (5/100)
countryTax = purchase * (2.5/100)
salesTax = stateTax + countryTax
sale = purchase - salesTax
print("\nThe amount of the purchase: ", purchase)
print("The state sales tax: " , stateTax)
print("The country sales tax: " , countryTax)
print("The total sales tax: " , salesTax)
print("The total of the sale: " , sale)