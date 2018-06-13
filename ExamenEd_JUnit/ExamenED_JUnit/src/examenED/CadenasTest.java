package examenED;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasTest {
	private String str;
	@Test
	
	public void testquitarAenPrimeras2Posiciones1() {
		str="AA";
		str.replaceAll("A", "");
		str.equals("");
		
	}
	
	public void testquitarAenPrimeras2Posiciones2() {
		str="AAASDF";
		String primeros2Chars = str.substring(0, 2);
		
		String cadenaMenosPrimeros2Chars = str.substring(2);

		str.equals("ASDF");
		
	}
	

}