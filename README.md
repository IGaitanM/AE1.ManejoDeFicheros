Esta pr�ctica consiste en la implementaci�n de un programa Java para la gesti�n del almac�n de coches en un concesionario. Los coches tendr�n los siguientes atributos, id, matricula, marca, modelo y color.

El usuario interactua con el programa a trav�s de un men�, que sirve como interfaz:

    A�adir nuevo coche
    Borrar coche por id
    Consulta coche por id
    Listado de coches
    Terminar el programa

Nada m�s comenzar la ejecuci�n del programa se verifica si existe el fichero coches.dat (fichero que contendr� objetos Coche). Si existe, se lee para llenar una colecci�n de tipo ArrayList con todos los objetos Coche existentes en el fichero. 

Las opciones del men� 1 a 5 trabajan sobre la colecci�n de tipo ArrayList para a�adir, borrar, consultar o listar, y no sobre el fichero coches.dat.

Cuando el usuario decida terminar la ejecuci�n del programa pulsando la opci�n 6, el programa crea el fichero coches.dat, sobrescribiendo el anterior si existiera. Se escriben en el fichero tantos coches como elementos tenga la colecci�n ArrayList.


##Requerimiento 2

Se a�ade una opci�n al men� que ser� �Exportar coches a archivo de texto�, que crea un fichero donde guardar� la informaci�n de los coches en un formato legible.


##Requerimiento 3

No se permite duplicar el id ni la matricula.
