package com.jacaranda.lemasTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.lemas.DefinicionException;
import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.DiccionarioException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.LetraException;
import com.jacaranda.lemas.Palabra;
import com.jacaranda.lemas.Significado;

class DiccionarioTest {

	@Test
	void testPalabraNula() throws DefinicionException {
				Significado nuevo;
				try {
					nuevo = new Significado(null);
					assertFalse(false, "falso");
				} catch (DefinicionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	@Test
	public void testRemovePalabra() {
		nueva = new palabra("abaco");
		assertFalse("no existe la palabra", target.removePalabra(nueva));
}
	
}



	