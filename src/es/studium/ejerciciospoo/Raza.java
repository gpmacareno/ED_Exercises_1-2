package es.studium.ejerciciospoo;

public class Raza
{
	private String nombreRaza;

	public Raza()
	{

		nombreRaza = "";
	}

	public Raza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}

}
