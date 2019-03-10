
public class KalkulatorMatematyczny {
	public int suma(int a, int b) {
		return (a+b);
	}
	
	public int roznica(int a, int b) {
		return (a-b);
	}
	
	public int iloczyn(int a, int b) {
		return (a*b);
	}
	
	public int iloraz(int a, int b) {
		return (a/b);
	}
	
	public int wartosc_bezwgledna(int a) {
		return (Math.abs(a));
	}
	
	public double potega(int a, int b) {
		return (Math.pow(a, b));
	}
	
	public double pierwiatek(int a) {
		return (Math.sqrt(a));
	}
}