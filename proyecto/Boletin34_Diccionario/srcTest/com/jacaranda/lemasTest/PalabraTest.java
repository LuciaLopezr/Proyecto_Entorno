package com.jacaranda.lemasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.lemas.DefinicionException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.Palabra;
import com.jacaranda.lemas.Significado;

class PalabraTest {
	
	//Test ID_01 Constructor de palabra

	@Test
	void testPalabra() {
		try {
			Palabra nueva = new Palabra("abaco");
			String esperada = nueva.getNombre();
			assertEquals("No son iguales", esperada,nueva.getNombre());
		} catch (LemaException e) {
			e.printStackTrace();
		}
			
	}
	
	
	//Test ID_02 Añadir significado
	@Test
	void testaddSignificado() {
		try {
			Palabra nueva = new Palabra("abaco");
			Significado nuevo= new Significado("prueba");
			String esperado = nuevo.toString();
			assertEquals("No son iguales", esperado,nuevo.getDefinicion());
		} catch (DefinicionException | LemaException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
}
