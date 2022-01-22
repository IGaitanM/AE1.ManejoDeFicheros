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
	public int contador = 0;
	public File file;
	
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
	
	public void crearArchivo() {
		File file = new File("coches.dat");
		
		try (FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			//oos = new ObjectOutputStream(new FileOutputStream(new File(nombreFichero)));
			oos.writeObject(listaCoches);
			System.out.println("Objeto introducido");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Cerrando programa");
	}
	
	/**
	 * Metodo que introduce un coche de la lista con el id incremental
	 * @param c el coche queremos introducir
	 */
	
	public void addCoche(Coche c) {
		c.setId(contador++);
		listaCoches.add(c);
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
			System.out.println("No hay coches guardados");			
		}
	}

	
	
}




