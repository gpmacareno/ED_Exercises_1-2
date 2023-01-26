package es.studium.ejerciciospoo4;
/**
 * Aqui instancia los Centros de Trabajo, los departamentos y los alumnos para poder entregarles datos. Mostrara por pantalla diferentes aspectos.
 * @author Studi
 * @author Jaime 
 *
 */
public class Principal
{

	public static void main(String[] args)
	{

		CentroTrabajo centroTrabajo1 = new CentroTrabajo("La Colmena", "La Isla nº45");
		Departamento departamento1 = new Departamento("Inteligencia", centroTrabajo1);
		Empleado empleado1 = new Empleado("Eugene", "Locke", departamento1);

		CentroTrabajo centroTrabajo2 = new CentroTrabajo("La Red", "La Isla nº20");
		Departamento departamento2 = new Departamento("Defensa", centroTrabajo2);
		Empleado empleado2 = new Empleado("Robert", "Clarck", departamento2);

		CentroTrabajo centroTrabajo3 = new CentroTrabajo("El Nido", "La Isla nº410");
		Departamento departamento3 = new Departamento("Suministros", centroTrabajo3);
		Empleado empleado3 = new Empleado("Xian", "Hong", departamento3);

		CentroTrabajo centroTrabajo4 = new CentroTrabajo("La Granja", "La Isla nº001");
		Departamento departamento4 = new Departamento("Red Vital", centroTrabajo4);
		Empleado empleado4 = new Empleado("Terence", "William", departamento4);

		CentroTrabajo centroTrabajo5 = new CentroTrabajo("La Jaula", "La Isla nº222");
		Departamento departamento5 = new Departamento("Prisión", centroTrabajo5);
		Empleado empleado5 = new Empleado("Martha", "Wayne", departamento5);

		System.out.println("El trabajador " + empleado1.getNombreEmpleado() + " " + empleado1.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado1.getDepartamento().getNombreDepartamento()
				+ " correspondiente al centro de trabajo denominado" + " "
				+ empleado1.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado2.getNombreEmpleado() + " " + empleado2.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado2.getDepartamento().getNombreDepartamento()
				+ " correspondiente al centro de trabajo denominado" + " "
				+ empleado2.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado3.getNombreEmpleado() + " " + empleado3.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado3.getDepartamento().getNombreDepartamento()
				+ " correspondiente al centro de trabajo denominado" + " "
				+ empleado3.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado4.getNombreEmpleado() + " " + empleado4.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado4.getDepartamento().getNombreDepartamento()
				+ " correspondiente al centro de trabajo denominado" + " "
				+ empleado4.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo() + ".");

		System.out.println("El trabajador " + empleado5.getNombreEmpleado() + " " + empleado5.getApellidosEmpleado()
				+ " trabaja en el departamento " + empleado5.getDepartamento().getNombreDepartamento()
				+ " correspondiente al centro de trabajo denominado" + " "
				+ empleado5.getDepartamento().getCentroTrabajo().getNombreCentroTrabajo() + ".");

	}

}
