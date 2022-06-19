package com.jacaranda.lemasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.lemas.Letra;

class LetraTest {

	@Test
	void testGetLetra() throws Exception {
		Letra target = new Letra('e');
		assertEquals(target.getLetra(),"E","La letra se ha guardado");
	}

}
