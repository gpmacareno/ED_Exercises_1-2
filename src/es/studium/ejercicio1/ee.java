package es.studium.ejercicio1;

public class ee
{

	private static final double pi = 3.14;

	public static void main(String[] args)
	{
		int r = 13; // radio del círculo;
		per(r);
		sup(r);
	}

	public static void sup(int r)
	{
		double sup = pi * r * r;
		System.out.println("La superficie del círculo es " + sup);
	}

	public static void per(int r)
	{
		double per = 2 * pi * r;
		System.out.println("El perímetro del círculo es " + per);
	}

}
