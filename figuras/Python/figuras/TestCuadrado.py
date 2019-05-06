'''
Created on 5 abr. 2019

Clase TestCuadrado para testear el funcionamiento de la Clase Cuadrado.

@author: Francisco Javier González Sabariego
'''

from figuras.Cuadrado import Cuadrado
import time

a = Cuadrado(5)
b = Cuadrado(5)
c = Cuadrado(4)

print("Cuadrado a:")
print(a)
print("Cuadrado b:")
print(b)
print("Cuadrado c:")
print(c)

time.sleep(1)

print("Comprobamos si a y b son iguales")
if a==b:
    print("Son iguales")
else:
    print("No son iguales")

time.sleep(1)

print("Comprobamos si b y c son iguales")
if b==c:
    print("Son iguales")
else:
    print("No son iguales")
    


print("Comprobamos si a es mayor que b")
if a>b:
    print("(a>b): Es mayor")
else:
    print("(a>b): No es mayor")

time.sleep(1)

print("Comprobamos si b es mayor que c")
if b>c:
    print("(b>c): Es mayor")
else:
    print("(b>c): No es mayor")



print("Comprobamos si a es mayor o igual que b")
if a>=b:
    print("(a>=b): Es mayor")
else:
    print("(a>=b): No es mayor")

time.sleep(1)

print("Comprobamos si b es mayor o igual que c")
if b>=c:
    print("(b>=c): Es mayor o igual")
else:
    print("(b>=c): Es menor")



print("Comprobamos si a es menor que b")
if a<b:
    print("(a<b): Es menor")
else:
    print("(a<b): No es menor")

time.sleep(1)

print("Comprobamos si b es menor que c")
if b<c:
    print("(b<c): Es menor")
else:
    print("(b<c): No es menor")



print("Comprobamos si a es menor o igual que b")
if a<=b:
    print("(a<=b): Es menor o igual")
else:
    print("(a<=b): Es mayor")

time.sleep(1)

print("Comprobamos si b es menor o igual que c")
if b<=c:
    print("(b<=c): Es menor o igual")
else:
    print("(b<=c): Es mayor")