package VehiculoCocheFurgoneta;

public class Furgoneta extends Vehiculo {
	
	//Varibles 
	private double altura;
	private int tara;
	private static int carga=500;
	private int nuevaCarga;
	
	public Furgoneta(int altura, int tara, String matricula, String marca, String modelo, int percioAlquilerdia, int antiguedad) {
		super( matricula, marca, modelo, percioAlquilerdia, antiguedad); //es la clase principal de todas las clases de java 
		this.altura=altura;
		this.tara=tara;
		this.carga=nuevaCarga;
		
		
	}

	@Override
	public String toString() {
		return "Furgoneta [altura=" + altura + ", tara=" + tara + ", carga=" + nuevaCarga + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", antiguedad=" + antiguedad
				+ ", percioAlquilerdia=" + percioAlquilerdia + ", precio=" + precio + ", getAltura()=" + getAltura()
				+ ", getTara()=" + getTara() + ", getCarga()=" + getCarga() + ", toString()=" + super.toString()
				+ ", getMatricula()=" + getMatricula() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getAntiguedad()=" + getAntiguedad() + ", getPercioAlquilerdia()=" + getPercioAlquilerdia()
				+ ", getPrecio()=" + getPrecio() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	
	
	
	
	
}
