package EsBisiestoTddTest;

public class EsBisiesto {

	public boolean EsDivisibleEntre4(int anio) {
		boolean resp=false;
		if(anio%4==0)
			resp=true;
		return resp;
	}

	public boolean EsDivisibleEntre100(int anio) {
		boolean resp=false;
		if(anio%100==0)
			resp=true;
		return resp;
	}

}
