package main;



import java.util.Scanner;


import modelo.DaoCoche;
import modelo.entidad.Coche;

public class Main {

	public static void main(String[] args) {
		
		DaoCoche daoCoche= new DaoCoche();

		
		
		
		
try (Scanner sc = new Scanner(System.in)){
			
			
			boolean continuar = true;
			String opcion;
						
			while (continuar) {
				
				System.out.println(" \n Elige una opción entre las siguientes: \n" 
									+ "----> 1. Añadir nuevo coche \n" 
									+ "----> 2. Borrar coche por id. \n" 
									+ "----> 3. Consultar coche por id. \n" 
									+ "----> 4. Listado de coches \n" 
									+ "----> 5. Terminar el programa");
				
				opcion = sc.nextLine(); 
				
				switch (opcion){
					case "1":
						Coche coche = new Coche();
						System.out.println("Añade la matrícula");
						coche.setMatricula(sc.nextLine());
						System.out.println("Añade el modelo");
						coche.setModelo(sc.nextLine());
						System.out.println("Añade el color");
						coche.setColor(sc.nextLine());
						daoCoche.addCoche(coche);
						daoCoche.crearArchivo();
						
						break;
					case "2":
						
						
						break;
					case "3":
						
						
						break;
					case "4":
						
						daoCoche.listarCoches();
						
						break;
					case "5":

						continuar = false;
						
						break;	
						
					default:
					
					System.out.println("Elige la opción escribiendo un número del menú, por favor \n");
				}
			}	
		}
		
	
		
		
	}		
}
