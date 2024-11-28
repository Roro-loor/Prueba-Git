package VehiculoCocheFurgoneta;

public class Vehiculo {

	//Variables
	protected String matricula;
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", antiguedad=" + antiguedad + ", percioAlquilerdia=" + percioAlquilerdia + ", precio=" + precio
				+ ", getMatricula()=" + getMatricula() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getAntiguedad()=" + getAntiguedad() + ", getPercioAlquilerdia()=" + getPercioAlquilerdia()
				+ ", getPrecio()=" + getPrecio() + ", getColor()=" + getColor() + "]";
	}

	protected String marca;
	protected String modelo;
	protected final String color="negro";
	protected int antiguedad;
	protected double percioAlquilerdia;
	
	protected int precio;
	protected static int contador=0;
	
	public Vehiculo(String matricula, String marca, String modelo, int percioAlquilerdia, int antiguedad) {
		super(); //es la clase principal de todas las clases de java 
		this.antiguedad=antiguedad;
		this.marca=marca;
		this.matricula=matricula;
		this.modelo=modelo;
		this.percioAlquilerdia=percioAlquilerdia;
		contador++;
		
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vehiculo.contador = contador;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getPercioAlquilerdia() {
		return percioAlquilerdia;
	}

	public void setPercioAlquilerdia(int percioAlquilerdia) {
		this.percioAlquilerdia = percioAlquilerdia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}
}
