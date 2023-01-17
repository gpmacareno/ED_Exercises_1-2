package es.studium.ejerciciospoo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{

		Director director1 = new Director("Giorgio",LocalDate.of(1950, 12, 1), "Italia");
		Director director2 = new Director("Paco", LocalDate.of(1964, 5, 10), "España");
		Director director3 = new Director("Khan", LocalDate.of (1978, 6, 25), "Alemania");
		Director director4 = new Director("George", LocalDate.of (1912, 7, 4), "Inglaterra");
		Director director5 = new Director("Vladimir", LocalDate.of (1922, 9, 22), "Rusia");

		Pelicula pelicula1 = new Pelicula("La tramontana", 1960, 120.30f, director1);
		Pelicula pelicula2 = new Pelicula("Chocolate con churros", 1930, 220.30f, director2);
		Pelicula pelicula3 = new Pelicula("Oktoberfest", 1980, 100.30f, director3);
		Pelicula pelicula4 = new Pelicula("Panzers y a lo loco", 2000, 190.30f, director4);
		Pelicula pelicula5 = new Pelicula("La caida del Zar", 1977, 140.30f, director5);

		System.out.println("Esta pelicula se llama " + pelicula1.getTitulo() + " rodada en el año "
				+ pelicula1.getAnio() + " " + "con una duración de " + pelicula1.getDuracion() + " minutos" + " "
				+ "y dirigida por " + " " + pelicula1.getDirector().getNombre() + " " + "nacido en" + " "
				+ pelicula1.getDirector().getNacionalidad() + " " + "en el año" + " "
				+ pelicula1.getDirector().getFechaNacimiento());
		
		System.out.println("Esta pelicula se llama " + pelicula2.getTitulo() + " rodada en el año "
				+ pelicula2.getAnio() + " " + "con una duración de " + pelicula2.getDuracion() + " minutos" + " "
				+ "y dirigida por " + " " + pelicula2.getDirector().getNombre() + " " + "nacido en" + " "
				+ pelicula2.getDirector().getNacionalidad() + " " + "en el año" + " "
				+ pelicula2.getDirector().getFechaNacimiento());

		System.out.println("Esta pelicula se llama " + pelicula3.getTitulo() + " rodada en el año "
				+ pelicula3.getAnio() + " " + "con una duración de " + pelicula3.getDuracion() + " minutos" + " "
				+ "y dirigida por " + " " + pelicula3.getDirector().getNombre() + " " + "nacido en" + " "
				+ pelicula3.getDirector().getNacionalidad() + " " + "en el año" + " "
				+ pelicula3.getDirector().getFechaNacimiento());
		
		System.out.println("Esta pelicula se llama " + pelicula4.getTitulo() + " rodada en el año "
				+ pelicula4.getAnio() + " " + "con una duración de " + pelicula4.getDuracion() + " minutos" + " "
				+ "y dirigida por " + " " + pelicula4.getDirector().getNombre() + " " + "nacido en" + " "
				+ pelicula4.getDirector().getNacionalidad() + " " + "en el año" + " "
				+ pelicula4.getDirector().getFechaNacimiento());
		
		System.out.println("Esta pelicula se llama " + pelicula5.getTitulo() + " rodada en el año "
				+ pelicula5.getAnio() + " " + "con una duración de " + pelicula5.getDuracion() + " minutos" + " "
				+ "y dirigida por " + " " + pelicula5.getDirector().getNombre() + " " + "nacido en" + " "
				+ pelicula5.getDirector().getNacionalidad() + " " + "en el año" + " "
				+ pelicula5.getDirector().getFechaNacimiento());
		
		//Cambiamos el formato de la fecha para darle la vuelta al sistema español clásico.
		
		DateTimeFormatter damosFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate formatoFechaNacimiento1 = LocalDate.parse("25/09/1949", damosFormat1);
		System.out.println(formatoFechaNacimiento1.format(damosFormat1));
	}

}
