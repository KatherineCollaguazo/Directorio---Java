package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("movi", "0987654321", 10);
        Telefono telefono2 = new Telefono("movi", "0978654321", 11);
        Telefono telefono3 = new Telefono("claro", "0965432109", 12);
        Telefono telefono4 = new Telefono("claro", "0945678901", 13);

        AminTelefono adminTelefono = new AminTelefono();

        int cantidadClaro = adminTelefono.contarClaro(telefono1, telefono2, telefono3, telefono4);

        System.out.println("Cantidad de teléfonos de la operadora 'claro': " + cantidadClaro);


	}

}
