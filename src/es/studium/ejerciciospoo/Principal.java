package es.studium.ejerciciospoo;

public class Principal
{

	public static void main(String[] args)
	{

		Raza raza1 = new Raza("Podenco");
		Raza raza2 = new Raza("Pastor Aleman");
		Raza raza3 = new Raza("Galgo");

		Perro perro1 = new Perro(raza1, 30.2f, 2, "Negro");
		Perro perro2 = new Perro(raza2, 5); // El caso especial del constructor especializado.
		Perro perro3 = new Perro(raza3, 80.2f, 2, "Marrón");

		System.out.println("La raza del perro 1 es " + perro1.getRaza().getNombreRaza() + " , su tamaño es: " + perro1.getTamanio() + ""
				+ ", su edad es: " + perro1.getEdad() + " " + "y es de color: " + perro1.getColor());
		
		System.out.println(perro1.toString());  
		System.out.println(raza1.toString());
		System.out.println(perro2.getRaza().getNombreRaza()+" "+ perro2.getEdad()); // El caso especial del constructor especializado.
		
		System.out.println(perro3.toString());
	}

}
