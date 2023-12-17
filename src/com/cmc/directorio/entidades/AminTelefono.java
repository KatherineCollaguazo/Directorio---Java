package com.cmc.directorio.entidades;

public class AminTelefono {
	public void activarMensaria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contador = 0;
		if (telf1.getOperadora() == "movi" && telf2.getOperadora() == "movi" && telf3.getOperadora() == "movi") {
		    contador = contador + 3;
		} else if (telf1.getOperadora() == "movi" && telf2.getOperadora() == "movi") {
		    contador = contador + 2;
		} else if (telf1.getOperadora() == "movi" && telf3.getOperadora() == "movi") {
		    contador = contador + 2;
		} else if (telf1.getOperadora() == "movi" && telf2.getOperadora() == "movi") {
		    contador = contador + 2;
		} else if (telf2.getOperadora() == "movi" && telf3.getOperadora() == "movi") {
		    contador = contador + 2;
		} else if (telf1.getOperadora() == "movi") {
		    contador = contador + 1;
		} else if (telf3.getOperadora() == "movi") {
		    contador = contador + 1;
		} else if (telf2.getOperadora() == "movi") {
		    contador = contador + 1;
		}
		return contador;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
	    int contador = 0;

	    if (telf1.getOperadora() == "claro" && telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 4;
	    } else if (telf1.getOperadora() == "claro" && telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro") {
	        contador = 3;
	    } else if (telf1.getOperadora() == "claro" && telf2.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 3;
	    } else if (telf1.getOperadora() == "claro" && telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 3;
	    } else if (telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 3;
	    } else if (telf1.getOperadora() == "claro" && telf2.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf1.getOperadora() == "claro" && telf3.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf1.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf2.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro") {
	        contador = 2;
	    } else if (telf1.getOperadora() == "claro") {
	        contador = 1;
	    } else if (telf2.getOperadora() == "claro") {
	        contador = 1;
	    } else if (telf3.getOperadora() == "claro") {
	        contador = 1;
	    } else if (telf4.getOperadora() == "claro") {
	        contador = 1;
	    }

	    return contador;
	}


}
