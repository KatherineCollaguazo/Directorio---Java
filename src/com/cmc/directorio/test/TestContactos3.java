package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contactos;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0987654323", 47);
		Contactos cont1 = new Contactos("Granados", telf1, 22.2);
		
		Telefono telf2 = new Telefono("claro", "0987987653", 48);
		Contactos cont2 = new Contactos("Lino", telf2, 89.3);
		
		AdminContactos adminc = new AdminContactos();
		
		Contactos pesado = adminc.buscarMasPesado(cont1, cont2);
		System.out.println("Apellido: " + pesado.getApellido() + " Es mas pesado. Con un peso de: " + pesado.getPeso());
		
		boolean oper = adminc.compararOperadoras(telf1, telf2);
		System.out.println("El resultado es: " + oper);

	}

}
