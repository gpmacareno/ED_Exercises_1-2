package es.studium.extraermetodo;

public class ExtraerMetodo
{

	public static void main(String[] args)
	{
		int numero = 6;
		calcularFactorial(numero);
	}

	public static void calcularFactorial(int numero)
	{
		int contador = 1; // Seleccionamos desde esta línea
		double resultado = 1;
		while (contador <= numero)
		{
			resultado = resultado * contador;
			contador++; 
		} // Hasta aqui
		System.out.println(resultado);
	}
	
}
