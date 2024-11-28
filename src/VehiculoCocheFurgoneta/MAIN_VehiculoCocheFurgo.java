package VehiculoCocheFurgoneta;

import java.util.Scanner;
import java.util.Scanner;

public class MAIN_VehiculoCocheFurgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crear objetos vehiculo
		Vehiculo[] miVehiculo  = new Vehiculo[20];
		miVehiculo[0]=new Furgoneta (2, 1500, 2000, "ABCD", "Mercedes","CleseB", 50, 2022);
		miVehiculo[1]=new Coche( true, "EFGH", "RangeRover", "q10", 30, 2023);
		
		//Variables
		int opcionSelecionada;
		int opcion=0;
		Scanner escaner = new Scanner(System.in);
		
		
		System.out.println("********************************************************");
		System.out.println("Elige una opción: ");
		System.out.println("1. Introducir un nuevo vehículo: ");
		//(antes de pedir los datos se preguntará si se va a introducir un coche o 
		//una furgoneta, que se manejaran en listas separadas
		System.out.println("2. Listar los datos de los coches que sean descapotables");
		System.out.println("3. Introduce una tara: ");
		// listar las furgonetas con una tara menor a la introducida.
		System.out.println("4. Introduce una nueva carga y modificala para todas las furgonetas: ");
		System.out.println("5. Mostrar los datos de la furgoneta más antigua y más nueva:");
		System.out.println("6. Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos:");
		System.out.println("7. Ordenar el listado de  furgonetas por tara y mostrarlo");
		System.out.println("8. Listar todos los vehículos ordenados por matrícula");
		System.out.println("9. Introducir una matrícula y borrar dicho vehículo");
		System.out.println("10. Salir.");
		System.out.println("********************************************************");
		opcionSelecionada=escaner.nextInt();
		
	switch (opcion) {
		
		case 1: //Introducir un vehiculo
			System.out.println("¿Que tipo de vehiculo quieres introducir? (1.Coche, 2.Furgoneta");
			int tipo =escaner.nextInt();
			escaner.nextLine(); //Limpiar buffer
			
			System.out.println("Introduce la matricula:");
			String matricula = escaner.nextLine();
			
			System.out.println("Introduce la marca:");
			String marca = escaner.nextLine();
			
			System.out.println("Introduce el modelo:");
			String modelo = escaner.nextLine();
			
			System.out.println("Introduce la antiguedad:");
			int antiguedad = escaner.nextInt();
			
			System.out.println("Introduce el precio por dia:");
			double precio = escaner.nextDouble();
			
			if (tipo == 1) {
				System.out.println("¿Es descapotable? (true/false)");
				boolean descapotable = escaner.nextBoolean();
				//boolean descapotable, String matricula, String marca, String modelo, int percioAlquilerdia, int antiguedad
				miVehiculo[Vehiculo.getContador()]=new Coche(descapotable, matricula, marca, modelo, (int)precio, antiguedad);
				Vehiculo.setContador(Vehiculo.getContador()+1);
			}else if (tipo == 2) {
				System.out.println("Introduce la altura:");
				double altura = escaner.nextDouble();
				
				System.out.println("Introduce la tara:");
				double tara = escaner.nextDouble();
				//int altura, int tara,  String matricula, String marca, String modelo, int percioAlquilerdia, int antiguedad
				miVehiculo[Vehiculo.getContador()] = new Furgoneta ((int)altura, (int)tara, matricula, marca, modelo, (int)precio, antiguedad);
				//furgonetas.add(new Furgoneta(alto, tara, matricula, marca, modelo, precio, antiguedad));
			}
			break;
		
		case 2://Listar coches descapotables
			for (int i; i<miVehiculo.length; i++) {
				if (miVehiculo[i] instanceof Coche)
					if (  ((Coche)miVehiculo[i]).isDescapotable()  ) {
						System.out.println(miVehiculo[i].toString());
					}
			}
			break;
			
		case 3://listar furgonetas con tara 
			System.out.println("Introduce una tara:");
			double taraLimite = escaner.nextDouble();
			
			Furgoneta[] furgonetas;	
			for (Furgoneta furgoneta : furgonetas) {
				if (furgoneta.getTara()< taraLimite) {
					System.out.println(furgoneta);
				}
			}
			break;
		
		case 4://Modificar la carga de todas las furgonetas
			System.out.println("Introduce una nueva carga:");
			double nuevaCarga = escaner.nextDouble();
			Furgoneta.setCarga(nuevaCarga);
			System.out.println("Carga modificada para todas las furgonetas");
			break;
		
		case 5://Furgoneta mas antigua y mas nueva
			if (miVehiculo.length > 0) 
			{  //verificamos si hay furgos
				// guardo en una variable masAntigua la antiguedad del primer elemento del array
				// guardo en una variable masNueva la antiguedad del primer elemento del array
				//Furgoneta masAntigua = miVehiculo);
				//Furgoneta masNueva = miVehiculo);
				int masAntigua=miVehiculo[0].getAntiguedad();
				int masNueva=masAntigua;
				
				for (Furgoneta furgoneta : furgonetas)
				{
					// por cada elemento del array miVehiculo ) comparo su antiguedad con la de las vbles anteriores
					// si es mas nueva modifico masNueva...
					if (furgoneta.getAntiguedad() > masAntigua) 
						masAntigua = furgoneta.getAntiguedad();
								
					if (furgoneta.getAntiguedad() < masNueva ) 
						masNueva = furgoneta.getAntiguedad();
				}
			
			
				System.out.println("Furfoneta mas antigua:" + masAntigua);
				System.out.println("Furfoneta mas nueva:" + masNueva);
			}
			else {
				System.out.println("No hay furfonetas registradas");
			}
			
			break;
			
		case 6://Antiguedad media
			
			for (Vehiculo miCoche: miVehiculo)
			System.out.println(miCoche.toString());
		
		//Para calcular la antiguedad media de todos los vehiculos 
		//necesitamos ina varibale para guardar la suma de las antiguedades
			int sumaAntiguedades=0;
			for (Vehiculo miCoche: miVehiculo)
			sumaAntiguedades+=miCoche.getAntiguedad();
			System.out.println((double)sumaAntiguedades/Vehiculo.contador);
			break;
			
		case 10:
			System.out.println("Saliendo...");
			break;
		
		default:
			System.out.print("Opción no válida.");
	}
	
	while (opcionSelecionada !=10);
	
	escaner.close();
	}
}
//!a.isEmpty() = quiere decir que 