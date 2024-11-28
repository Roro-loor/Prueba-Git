package ProfesySusPublicaciones;

public class Articulo extends Publicacion{
	private String medio;
	
	@Override
	public String toString() {
		return "Articulo [medio=" + medio + "]";
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public Articulo(String fecha, String titulo, String medio) {
		super(fecha, titulo);
		this.medio = medio;
	}
}
