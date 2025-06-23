package conversorDivisa;

public class metodosConversion {
	
	public static double DolarAPeso(double dolares) {
		double tasa = 19.00;
		return dolares * tasa;
	}
	
	public static double PesoADolar(double pesos) {
		double tasa = 0.053;
		return pesos * tasa;
	}
	
	public static double KgALibras(double KG) {
		return KG * 0.4536;
	}
	
	public static double LibrasAKG(double Libras) {
		return Libras * 2.20462;
	}
	
	public static double MetrosAKilo(double metros) {
		double kilo = 0.001;
		return metros * kilo;
	}
	
	public static double CentrigradosAFare(double grados) {
		return (grados * 9.0/5.0) + 32;
	}
	
	public static double FareACentigrados(double Fare) {
		return(Fare - 32) * 9.0/5.0;
	}
}
