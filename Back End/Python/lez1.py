import math


print("dc\ntuttobbene") # questo è un commento

prezzoUnitario=45.6
quantita=10
imponibile=prezzoUnitario*quantita
iva=imponibile*0.22
print("Imponibile:", imponibile)
print("IVA:", iva)
print("Totale:", imponibile+iva)

triangleBase = 33
triangleHeight = 20
area = triangleBase * triangleHeight / 2
perimeter = triangleBase + triangleHeight + math.sqrt((triangleBase**2 + triangleHeight**2))
print("Area:", area)
print("Perimetro:", perimeter)