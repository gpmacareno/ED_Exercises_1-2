package es.studium.ejerciciospoo3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Principal
{

	public static void main(String[] args)
	{
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");
		String formatDateTime = now.format(formatter);

		Pedido pedido1 = new Pedido( LocalDateTime.now(), "0120354");
		Factura factura1 = new Factura(05, "222214", pedido1);

		System.out.println("La factura tiene una fecha de " + " " + formatDateTime+ " "
				+ "su número de referencia es " + factura1.getPedido().getReferencia() + " " + " y su número es "
				+ factura1.getNumeroFactura() + ".");

	}

}
