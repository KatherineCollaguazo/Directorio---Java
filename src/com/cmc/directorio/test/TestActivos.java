package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contactos;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telf1 = new Telefono("ctn", "0980652323", 49);
		Contactos cont1 = new Contactos("Valdez", telf1, 19.2);
		telf1.setTieneWhatsapp(true);
		cont1.setActivo(false);
		
		System.out.println("Apellido: " + cont1.getApellido() + ", tienes whatsapp?: " + telf1.isTieneWhatsapp() + ", estado: " + cont1.isActivo());

		AdminContactos adminc = new AdminContactos();
		
		adminc.activarUsuario(cont1, telf1);
		
		System.out.println("Apellido: " + cont1.getApellido() + ", tienes whatsapp?: " + telf1.isTieneWhatsapp() + ", estado: " + cont1.isActivo());

	}

}
