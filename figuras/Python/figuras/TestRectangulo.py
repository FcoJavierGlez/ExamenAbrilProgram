'''
Created on 5 abr. 2019

Clase TestRectangulo para testear el funcionamiento de la Clase Rectángulo

@author: Francisco Javier González Sabariego
'''
import sys
import time

from figuras.Rectangulo import Rectangulo

print("Intentemos un rectángulo a de 7 de ancho y 5 de alto")
try:
    a = Rectangulo(7,5)
    
    print("\nRectángulo a:")
    print(a)
    
except ArithmeticError:
    sys.stderr.write("Valores incorrectos.")

time.sleep(1)

print("Intantemos crear un rectángulo b de 0 de ancho y 5 de alto")

time.sleep(1)

try:
    b = Rectangulo(0,5)
    
    print("\nRectángulo b:")
    print(b)
    
except ArithmeticError:
    sys.stderr.write("Valores incorrectos.")