package com.jacaranda.lemasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.lemas.DefinicionException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.Palabra;
import com.jacaranda.lemas.Significado;

class SignificadoTest {

	@Test
	void testSignificado() {
		Significado nuevo;
		try {
			nuevo = new Significado("abaco");
			String esperado = nuevo.getDefinicion();
			assertEquals("No son iguales", esperado,nuevo.getDefinicion());
		} catch (DefinicionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
	}

}
