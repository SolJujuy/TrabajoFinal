package paquete1;

import java.time.LocalDate;

public class libro extends producto{
	
	//atributos
	private String titulo;
	private String autor;
	
	
//constructor
	public libro(int codigo, String editor, LocalDate publicacion, double costo, String titulo, String autor) {
		super(codigo, editor, publicacion, costo);
		this.titulo = titulo;
		this.autor = autor;}


	
	// getters y setters
	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo = titulo;}

	public String getAutor() {
		return autor;}
	public void setAutor(String autor) {
		this.autor = autor;}


}