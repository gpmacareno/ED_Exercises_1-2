package es.studium.ejercicio3;

public class Conductor
{
	private String nombreConductor;
	private String carnetConductor;

	public Conductor()
	{
		nombreConductor = "";
		carnetConductor = "";
	}

	public Conductor(String nombreConductor, String carnetConductor)
	{
		this.nombreConductor = nombreConductor;
		this.carnetConductor = carnetConductor;
	}

	public String getNombreConductor()
	{
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.nombreConductor = nombreConductor;
	}

	public String getCarnetConductor()
	{
		return carnetConductor;
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.carnetConductor = carnetConductor;
	}
}

//Esto es una prueba.