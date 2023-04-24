package paquete1;

import java.time.LocalDate;

public abstract class producto {
	
		
		//atributos
		private int  codigo;
		private String editor;
		private LocalDate publicacion;
		private double costo;
		
		//constructor
		public producto(int codigo, String editor, LocalDate publicacion, double costo) {
			this.codigo = codigo;
			this.editor = editor;
			this.publicacion = publicacion;
			this.costo = costo;
		}
		
		
		//getters y setters


		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getEditor() {
			return editor;
		}

		public void setEditor(String editor) {
			this.editor = editor;
		}

		public LocalDate getPublicacion() {
			return publicacion;
		}

		public void setPublicacion(LocalDate publicacion) {
			this.publicacion = publicacion;
		}

		public double getCosto() {
			return costo;
		}

		public void setCosto(double costo) {
			this.costo = costo;
		}
		
		
		
		
	
}
