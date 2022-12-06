from abc import ABC,abstractmethod #Abstract base class. Convierte una clase en abstracta
#Abstract method sirve para importar un metodo abstracto
class FiguraGeometrica(ABC): #Ahora figura geometrica va a ser hija de ABC
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
           self._ancho=ancho #Primero hacemos el encapsulamiento de ambos
        else:
            self._ancho=0
            print(f'Valor erroneo para el ancho:{ancho}')
        if self._validar_valores(alto):
            self._alto=alto
        else:     
            self._alto=0   
            print(f'Valor erroneo para el alto:{alto}')




@property
def ancho(self,ancho):
    return self._ancho

@ancho.setter
def ancho(self, ancho):
    if self._validar_valores(ancho):
        self._ancho=ancho
    else:
        print(f'Valor erroneo ancho:{ancho}')


@property
def alto(self):
    return self._alto

@alto.setter
def alto(self,alto):
    if self._validar_valores(alto):
       self._alto=alto
    else:
        print(f'Valor erroneo alto:{alto}')   
@abstractmethod
def calcular_area(self):
    pass 
def __str__(self):
    return f'FiguraGeometrica[Ancho:{self._ancho}, Alto:{self._alto}]'

def _validar_valores(self): #Este metodo no se debe utilizar fuera de la clase sino de manera interna en la clase padre-METODO ENCAPSULADO
    return True if 0 < valor < 10 else False #Va a trabajar de manera encapsulada

#Para convertirla en una clase abstrata hay que 