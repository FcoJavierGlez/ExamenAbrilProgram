'''
Created on 5 abr. 2019

@author: Francisco Javier González Sabariego
'''

import sys
import time

class Rectangulo():
    
    def __init__(self, ancho, alto):
        '''
        constructor
        '''
        Rectangulo.__verificaAncho(ancho)  
        Rectangulo.__verificaAlto(alto) 
        self.__ancho = ancho
        self.__alto = alto
    
    
    @property    
    def ancho(self):
        '''
        Devuelve el valor del ancho del objeto
        '''
        return self.__ancho
    
    @ancho.setter
    def ancho(self, ancho):
        '''
        Asigna el valor del ancho del objeto
        '''
        if ancho<1 or ancho>10:
            raise ArithmeticError
        else:
            self.__ancho = ancho
        
    @property    
    def alto(self):
        '''
        Devuelve el valor del alto del objeto
        '''
        return self.__alto
    
    @alto.setter
    def alto(self, alto):
        '''
        Asigna el valor del alto del objeto
        '''
        if alto<1 or alto>10:
            raise ArithmeticError
        else:
            self.__alto = alto
    
    
    @staticmethod
    def __verificaAncho(ancho):
        if ancho<1 or ancho>10:
            raise ArithmeticError("Valor inválido")
    
    @staticmethod
    def __verificaAlto(alto):
        if alto<1 or alto>10:
            raise ArithmeticError("Valor inválido")
    
    
    def __str__(self):
        salida ="";
        for i in range (0, self.__alto):     
            if i==0 or i==self.__alto-1:
                for k in range (0, self.__ancho):
                    salida += "[]"
                    if k==self.__ancho-1: #Si es igual al ancho de la figura introduzco un salto de línea
                        salida += "\n"
            else:
                for j in range (0,self.__ancho):
                    if self.__ancho==1:
                        salida += "[]\n"
                    elif j==0:
                        salida += "[]"
                    elif j==self.__ancho-1:
                        salida += "[]\n"
                    else:
                        salida += "  "
        return salida;
    
    
    
if __name__=="__main__":
    
    print("Intentemos un rectángulo a de 7 de ancho y 5 de alto")
    try:
        a = Rectangulo(7,5)
        
        print("\nRectángulo a:")
        print(a)
        
    except ArithmeticError:
        sys.stderr.write("Valores incorrectos.")
    
    time.sleep(1)
    
    print("Intentemos un rectángulo b de 0 de ancho y 5 de alto")
    try:
        b = Rectangulo(0,5)
        
        print("\nRectángulo b:")
        print(b)
        
    except ArithmeticError:
        sys.stderr.write("Valores incorrectos.")
    
    
    