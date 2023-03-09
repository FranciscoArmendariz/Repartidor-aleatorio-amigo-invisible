package modelo;

public class Persona {

	private String nombre;
	private int numero;
	private int numeroAmigo;
	
	
	public Persona(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
		this.numeroAmigo = -1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroAmigo() {
		return numeroAmigo;
	}

	public void setNumeroAmigo(int numeroAmigo) {
		this.numeroAmigo = numeroAmigo;
	}
	

	public boolean equals (Persona p) {
		return this.numero == p.numero;
	}

	@Override
	public String toString() {
	return "N°" + numero + ": " + nombre;
	}
	
	
	
	
	
	
	
	
}
