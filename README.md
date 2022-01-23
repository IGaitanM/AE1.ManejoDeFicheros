Esta práctica consiste en la implementación de un programa Java para la gestión del almacén de coches en un concesionario. Los coches tendrán los siguientes atributos, id, matricula, marca, modelo y color.

El usuario interactua con el programa a través de un menú, que sirve como interfaz:

    Añadir nuevo coche
    Borrar coche por id
    Consulta coche por id
    Listado de coches
    Terminar el programa

Nada más comenzar la ejecución del programa se verifica si existe el fichero coches.dat (fichero que contendrá objetos Coche). Si existe, se lee para llenar una colección de tipo ArrayList con todos los objetos Coche existentes en el fichero. 

Las opciones del menú 1 a 5 trabajan sobre la colección de tipo ArrayList para añadir, borrar, consultar o listar, y no sobre el fichero coches.dat.

Cuando el usuario decida terminar la ejecución del programa pulsando la opción 6, el programa crea el fichero coches.dat, sobrescribiendo el anterior si existiera. Se escriben en el fichero tantos coches como elementos tenga la colección ArrayList.


##Requerimiento 2

Se añade una opción al menú que será “Exportar coches a archivo de texto”, que crea un fichero donde guardará la información de los coches en un formato legible.


##Requerimiento 3

No se permite duplicar el id ni la matricula.
