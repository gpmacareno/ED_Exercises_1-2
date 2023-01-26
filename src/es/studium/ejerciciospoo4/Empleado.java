package es.studium.ejerciciospoo4;

/**
 * Permite crear objetos de tipo Empleado
 * @author Studi
 * @author Jaime
 * @version v1.4.67
 * @since 26/12/2022
 * @see {@link Departamento}
 */

public class Empleado
{
	private int idEmpleado;
	private String nombreEmpleado;
	private String apellidosEmpleado;
	private Departamento departamento;
/**
 * Constructor vacio o por defecto
 */
	public Empleado()
	{

		idEmpleado = 0;
		nombreEmpleado = "";
		apellidosEmpleado = "";
		departamento = new Departamento();

	}
/**
 * Constructor por Parametros
 * 
 * @param idEmpleado Parametro que se asigna al atributo idEmpleado.
 * @param nombreEmpleado Parametro que se asigna al atributo nombre.
 * @param apellidosEmpleado Parametro que se asigna al atributo apellidos.
 * @param departamento Parametro que se asigna al atributo departamento que bebe de otra clase creada llamada "Departamento"
 * 
 */
	public Empleado(int idEmpleado, String nombreEmpleado, String apellidosEmpleado, Departamento departamento)
	{
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
		this.departamento = departamento;
	}

	public Empleado(String nombreEmpleado, String apellidosEmpleado, Departamento departamento)
	{
		this.nombreEmpleado = nombreEmpleado;
		this.apellidosEmpleado = apellidosEmpleado;
		this.departamento = departamento;
	}
/**
 * Devuelve el valor del atributo idEmpleado.
 * @return idEmpleado
 */
	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidosEmpleado()
	{
		return apellidosEmpleado;
	}

	public void setApellidosEmpleado(String apellidosEmpleado)
	{
		this.apellidosEmpleado = apellidosEmpleado;
	}

	public Departamento getDepartamento()
	{
		return departamento;
	}

	public void setDepartamento(Departamento departamento)
	{
		this.departamento = departamento;
	}

}
