package es.studium.ejercicio1;

public class Ejercicio1Refactor
{
	private static final double PI = 3.14;

	public static void main(String[] args)
	{
		Ejercicio1Refactor g = new Ejercicio1Refactor();
		int r = 13; // radio del círculo;
		perimetro(r);
		g.superficie(r);
	}

	public void superficie(int r)
	{
		double superficie = PI * r * r;
		System.out.println("La superficie del círculo es " + superficie);
	}

	public static void perimetro(int r)
	{
		double perimetro = 2 * PI * r;
		System.out.println("El perímetro del círculo es " + perimetro);
	}

}
