package es.studium.interfaz;

public class Principal
{

	public static void main(String[] args)
	{

		Acumulador acumulador = new Acumulador(10);
		acumulador.incremento(15);
		System.out.println(acumulador.getValor());
		
		acumulador.setPrecision(12);
		acumulador.setMaximo(50);
		acumulador.setValor(INumerico.NUMERO_E);
		acumulador.setValor(IConstantes.VALOR_MAXIMO);
		acumulador.setValor(IConstantes.VALOR_MINIMO);
		

		IModificacion acumulador2 = new Acumulador(12);
		acumulador2.incremento(24);
		
		
		INumerico acumulador3 = new Acumulador(24);
		acumulador3.setPrecision(10);
		acumulador3.setMaximo(100);

		IConstantes acumulador4 = new Acumulador(10);

	}

}
