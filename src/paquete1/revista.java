package paquete1;

import java.time.LocalDate;

public class revista extends producto{

	//atributos
	private String nombre;
	private int cantidad;
	
	
//constructor
	public revista(int codigo, String editor, LocalDate publicacion, double costo, String nombre,int cantidad) {
		super(codigo, editor, publicacion, costo);
		this.nombre = nombre;
		this.cantidad=cantidad;}
	

//getters y setters
	
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}
	public int getCantidad() {
		return cantidad;}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;}	


//metodo heredado

public double valorFinal(double valorInicial,int cantidad) {
	return valorInicial * this.getCantidad();
	}



}