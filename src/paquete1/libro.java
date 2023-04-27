package paquete1;

import java.time.LocalDate;

public class libro extends producto{
	
	//atributos
	private String titulo;
	private String autor;
	private int cantidad;
	
	
//constructor
	public libro(int codigo, String editor, LocalDate publicacion, double costo, String titulo, String autor,int cantidad) {
		super(codigo, editor, publicacion, costo);
		this.titulo = titulo;
		this.autor = autor;
		this.cantidad=cantidad;}


	
	// getters y setters
	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo = titulo;}

	public String getAutor() {
		return autor;}
	public void setAutor(String autor) {
		this.autor = autor;}
	
	public int getcantidad() {
		return cantidad;}
	public void setAutor(int cantidad) {
		this.cantidad = cantidad;}
	
	
	//metodos heredados
	public double valorFinal(double valorInicial,int cantidad) {
		return valorInicial * this.getcantidad();
		}

}