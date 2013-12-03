package EsBisiestoTddTest;



import static org.junit.Assert.*;

import org.junit.Test;

public class EsBisiestoTest {

	@Test
	public void DevuelveTrueSiElAnioEsDivisibleEntre4()
	{
		EsBisiesto bisiesto = new EsBisiesto();
		assertEquals(true, bisiesto.EsDivisibleEntre4(1992));
	}
	
	@Test
	public void DevuelveTrueSiElAnioEsDivisibleEntre100()
	{
		EsBisiesto bisiesto = new EsBisiesto();
		assertEquals(true, bisiesto.EsDivisibleEntre4(1992));
	}

}
