package ProfesySusPublicaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Publicacion {
	protected LocalDate fechaPubli;
	protected String titulo;
	
	public Publicacion (String fecha, String titulo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaPubli = LocalDate.parse(fecha,formatter);
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Publicacion [fechaPubli=" + fechaPubli + ", titulo=" + titulo + ", getFechaPubli()=" + getFechaPubli()
				+ ", getTitulo()=" + getTitulo() + "]";
	}

	public LocalDate getFechaPubli() {
		return fechaPubli;
	}
	public void setFechaPubli(LocalDate fechaPubli) {
		this.fechaPubli = fechaPubli;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
}