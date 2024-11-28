package VehiculoCocheFurgoneta;

public class Coche extends Vehiculo {
	private boolean descapotable;
	
	@Override
	public String toString() {
		return "Coche [descapotable=" + descapotable + ", isDescapotable()=" + isDescapotable() + "]";
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	public Coche(boolean descapotable, String matricula, String marca, String modelo, int percioAlquilerdia, int antiguedad) {
		super(matricula, marca, modelo, percioAlquilerdia, antiguedad); //es la clase principal de todas las clases de java 
		this.descapotable=descapotable;
		
		
	}
	
}
