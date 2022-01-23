package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Coche;


public class DaoCoche {
	
	public List<Coche> listaCoches;
	public int contador;
	
	// si el archivo cohes.dat existe llena un arrayList con los datos del mismo al crear un objeto daoCoche
	public DaoCoche() {
		listaCoches = new ArrayList<Coche>();
		File fn = new File("coches.dat");
		if (fn.exists()) {
			llenarArray();
			
		}
		
	}
	
	//Método para llenar una arrayList con los datos del archivo coche.dat
	
	public void llenarArray(){
		
		File file = new File("coches.dat");
		try (FileInputStream fis = new FileInputStream(file);
				 ObjectInputStream ois = new ObjectInputStream(fis);) {
				
				@SuppressWarnings("unchecked")
				ArrayList<Coche> lista = (ArrayList<Coche>)ois.readObject();
				listaCoches=lista;

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			
			System.out.println("Array relleno con datos de coches.dat");
		
	}
	
	/**
	 * Metodo que crea o actualiza el archivo coches.dat con los datos del ArrayList listaCoches
	 */
	public void crearArchivoDat() {
		File file = new File("coches.dat");
		
		try (FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(listaCoches);
			System.out.println("coches guardados en la BBDD");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Metodo que crea o actualiza el archivo coches.txt con los datos del ArrayList listaCoches
	 */
	public void crearArchivoTxt() {
		File file = new File("coches.txt");
		
		try (FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(listaCoches);
			System.out.println("coches exportados a archivo de texto");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Metodo que introduce un coche en listaCoches con el id autoIncremental a partir del último de la lista.
	 * @param c el coche queremos introducir
	 */
	
	public void addCoche(Coche c) {
		for (Coche coche : listaCoches) {
			if (c.getMatricula().equalsIgnoreCase(coche.getMatricula())) {
				System.out.println("La matrícula ya existe, escribe otra");
				break;
			
			}
		}
	
			comprobarUltimaId();
			c.setId(++contador);
			listaCoches.add(c);
		
	}
	
	/**
	 * Metodo para comprobar el último id de listaCoches
	 */
	public int comprobarUltimaId() {
		if (!listaCoches.isEmpty())
			contador = listaCoches.get(listaCoches.size()-1).getId();
		return contador;
	}
	
	/**
	 * Metodo que lista los coches contenidos en el arrayList listaCoches.
	 */
	
	public void listarCoches(){
		if(!listaCoches.isEmpty()) {
			for (Coche c : listaCoches) {
				System.out.println(c);
			}
		}else {
			System.out.println("No hay coches guardados en la BBDD");			
		}
	}
	
	/**
	 * Metodo que borra un Coche por Id e imprime el coche borrado.
	 */
	public boolean BorrarPorId(int id) {
		for (Coche c : listaCoches) {
			if (c.getId() == id) {
				System.out.println("el coche borrado es " + c);
				return listaCoches.remove(c);
			}
		}
		System.out.println("el id no existe en la BBDD");
		return false;
	}
	
	/**
	 * Metodo que consulta un coche por Id y lo imprime.
	 */
	public Coche consultaPorId(int id) {
		for (Coche c : listaCoches) {
			if (c.getId() == id) {
				System.out.println("el coche consultado es: " + c);
				return c;
			}
		}
		System.out.println("el id no existe en la BBDD");
		return null;
	}
	
	
}




