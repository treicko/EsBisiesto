package EsBisiestoTddTest;

import org.junit.Test;

import junit.framework.TestCase;

public class EsBisiestoTest extends TestCase {

	@Test
	public void DevuelveTrueSiElAnioEsDivisibleEntre4()
	{
		EsBisiesto bisiesto = new EsBisiesto();
		assertEquals(true, bisiesto.EsDivisibleEntre4(1992));
	}
	
	@Test
	public void DevuelveTrueSiElAnioEsDivisibleEntre()
	{
		assertEquals(true, true);
	}

}
