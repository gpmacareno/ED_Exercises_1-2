package es.studium.ejerciciospoo;

public class Perro
{
	private Raza raza;
	private float tamanio;
	private int edad;
	private String color;

	public Perro()
	{

		raza = new Raza();
		tamanio = 0.0f;
		edad = 0;
		color = "";

	}

	// Un nuevo constructor. Especializado. Por si queremos algo más especifico, si solo necesitamos estos dos valores unicamente por ejemplo. 
	// En este caso, solo crearemos un perro con su raza y edad mientras que en el que usabamos siempre estabamos obligados a poner todos los valores. 
	public Perro(Raza raza, int edad)
	{
		this.raza = raza;
		this.edad = edad;
	}

	public Perro(Raza raza, float tamanio, int edad, String color)
	{
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}



	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamanio()
	{
		return tamanio;
	}

	public void setTamanio(float tamanio)
	{
		this.tamanio = tamanio;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public String toString() // Para mostrar en consola los valores de los atributos.
	{
		return "Perro [raza=" + raza + ", tamaño=" + tamanio + ", edad=" + edad + ", color=" + color + "]";
	}

}
