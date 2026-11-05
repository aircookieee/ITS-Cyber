EUR_USD = 1.13
EUR_JPY = 178.35
EUR_GBP = 0.83

eur = float(input("EUR: "))
print(f"USD: {round(eur*EUR_USD, 2)}\nJPY: {round(eur*EUR_JPY, 2)}\nGBP: {round(eur*EUR_GBP, 2)}")