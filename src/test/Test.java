package test;

import modelo.amigoInvisible;

public class Test {

	public static void main(String[] args) {
		
		
		amigoInvisible test = new amigoInvisible();
		
		/*----------Agregar Participantes----------*/
		test.agregarPersona("Juan");
		test.agregarPersona("Ana");
		test.agregarPersona("Franco");
		test.agregarPersona("Agustina");
		/*-----------------------------------------*/
		test.asignarAmigos();
		
		System.out.println(
				"* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"+
				"* ▄██████▄  ██       ██  ██    ▄██████▄    ▄███████▄                        *\n"+
				"* ██    ██  ███     ███      ▄██▀    ▀██  ██▀     ▀██                       *\n"+
				"* ██    ██  ████▄ ▄████  ██  ██           ██       ██                       *\n"+
				"* ████████  ██ █████ ██  ██  ██     ████  ██       ██                       *\n"+
				"* ██    ██  ██  ▀█▀  ██  ██  ██       ██  ██       ██                       *\n"+
				"* ██    ██  ██   ▀   ██  ██  ██▄     ▄██  ██▄     ▄██                       *\n"+
				"* ██    ██  ██       ██  ██   ▀███████▀    ▀███████▀                        *\n"+
				"*                                                                           *\n"+
				"* ██  ██    ██  ██     ██  ██   ▄████▄   ██  ███████▄   ██        █████████ *\n"+
				"*     ███   ██  ██     ██      ██▀   ██      ██     ██  ██        ██        *\n"+
				"* ██  ████  ██  ██     ██  ██  ██        ██  ██     ██  ██        ██        *\n"+
				"* ██  ██ ██ ██   ██   ██   ██  ▀██████▄  ██  ████████   ██        █████████ *\n"+
				"* ██  ██  ████    ██ ██    ██        ██  ██  ██     ██  ██        ██        *\n"+
				"* ██  ██   ███    ██ ██    ██  ██   ▄██  ██  ██     ██  ██        ██        *\n"+
	 			"* ██  ██    ██     ███     ██   ▀████▀   ██  ███████▀   ████████  █████████ *\n"+
	 			"* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"+
				"\nRESULTADOS:\n");
		
		test.imprimirResultado();

	}

}
