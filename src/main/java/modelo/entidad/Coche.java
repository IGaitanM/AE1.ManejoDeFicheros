package modelo.entidad;

import java.io.Serializable;
import java.util.Objects;

public class Coche implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -320638518592825896L;
	private int id;
	private String matricula, modelo, color;
	
	public Coche(int id, String matricula, String modelo, String color) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
	}

	
	public Coche() {
		super();
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", modelo=" + modelo + ", color=" + color + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, id, matricula, modelo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(matricula, other.matricula)
				&& Objects.equals(modelo, other.modelo);
	}
	
	
	

}
