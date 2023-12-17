package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0987654321", 10);
        Telefono telf2 = new Telefono("movi", "0978654321", 11);
        Telefono telf3 = new Telefono("movi", "0965432109", 12);

        AminTelefono adminTelefono = new AminTelefono();

        int res = adminTelefono.contarMovi(telf1, telf2, telf3);

        System.out.println("Cantidad de teléfonos de la operadora 'movi': " + res );


	}

}
