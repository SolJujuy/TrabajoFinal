package paquete1;

import java.time.LocalDate;

public class revista extends producto{

	//atributos
	private String nombre;
	
	
//constructor
	public revista(int codigo, String editor, LocalDate publicacion, double costo, String nombre) {
		super(codigo, editor, publicacion, costo);
		this.nombre = nombre;}

//getters y setters
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}

	
}

