package es.studium.interfaz;

public class Acumulador implements IModificacion, INumerico, IConstantes
{

	private int valor;
	
	public Acumulador(int i) {
								//Constructor por parametro
		valor = i;				
	}
	
	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)	//Metodos Get y Set
	{
		this.valor = valor;
	}

	@Override
	public void incremento(int a)
	{
		valor = valor + a; //valor +=a;
			
		
	}

	@Override
	public void setPrecision(int p)		//Invocacion de las interfaces
	{
		valor = p;
	}

	@Override
	public void setMaximo(int m)
	{
		valor = m;
	}

}
