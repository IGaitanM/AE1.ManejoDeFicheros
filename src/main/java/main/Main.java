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
									+ "----> 5. Exportar coches a archivo de texto \n"
									+ "----> 6. Terminar el programa");
				
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
						break;		
					case "2":
						System.out.println("¿Que ID quieres borrar?");
						int id = sc.nextInt();
						sc.nextLine();
						daoCoche.BorrarPorId(id);
						break;
					case "3":
						System.out.println("¿Que ID quieres consultar?");
						int id1 = sc.nextInt();
						sc.nextLine();
						daoCoche.consultaPorId(id1);
						break;
					case "4":			
						daoCoche.listarCoches();
						break;
					case "5":
						daoCoche.crearArchivoTxt();
						break;
					case "6":
						daoCoche.crearArchivoDat();
						continuar = false;
						break;	
					default:
					System.out.println("Elige la opción escribiendo un número del menú, por favor \n");
				}
			}	
		}
		
	
		
		
	}		
}
