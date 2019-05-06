'''
Created on 5 abr. 2019



@author: Francisco Javier González Sabariego
'''
from figuras.Rectangulo import Rectangulo

class Cuadrado(Rectangulo):
    def __init__(self, lado):
        Rectangulo.__init__(self, lado, lado)
    
    
    def __eq__(self, other):
        '''
        Método equals, compara dos objetos
        '''
        if self.ancho == other.ancho:
            return True
        else:
            return False
    
    
    def __gt__(self, other):
        '''
        Método greater than, retorna verdadero si el objeto (self) que llama al método
        es mayor que el objeto se le pasa como parámetro, de lo contrario devuelve falso.
        '''
        if self.ancho > other.ancho:
            return True
        else:
            return False
    
    
    def __ge__(self, other):
        '''
        Método greater than or equals to, retorna verdadero si el objeto (self) que llama al método
        es mayor o igual que el objeto se le pasa como parámetro, de lo contrario devuelve falso.
        '''
        if self.ancho > other.ancho or self.ancho == other.ancho:
            return True
        else:
            return False
    
    
    def __lt__(self, other):
        '''
        Método less than, retorna verdadero si el objeto (self) que llama al método
        es menor que el objeto se le pasa como parámetro, de lo contrario devuelve falso.
        '''
        if not self.__gt__(other):
            return True
        else:
            return False
    
    
    def __le__(self, other):
        '''
        Método less than or equals to, retorna verdadero si el objeto (self) que llama al método
        es menor que el objeto se le pasa como parámetro, de lo contrario devuelve falso.
        '''
        if self.ancho < other.ancho or self.ancho == other.ancho:
            return True
        else:
            return False
    
    
    @property
    def lado(self):
        return self.__ancho
    
    
    @lado.setter
    def lado(self, l):
        if l<1 or l>10:
            raise ArithmeticError
        else:
            self.__ancho=l 
