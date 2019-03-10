import java.util.Scanner;
import java.io.IOException;

public class Kalk {

	public static int menu () {
		System.out.println("*********************************");
		System.out.println("***           MENU           ***");
		System.out.println("*********************************");
		System.out.println("1. dodawanie");
		System.out.println("2. odejmowanie");
		System.out.println("3. mno¿enie");
		System.out.println("4. dzielenie bez reszty");
		System.out.println("5. wartoœæ bezwzglêdna");
		System.out.println("6. potêga z liczby");
		System.out.println("7. pierwiastek");
		
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		in.nextLine();
		return w;	
	}
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int wybor = menu();
		
		KalkulatorMatematyczny wynik = new KalkulatorMatematyczny();
		
		while (wybor !=0) {
			switch(wybor) {
				case (1):
					int a, b;
					System.out.println("Podaj dwie liczby do sumowania:");
					a = in.nextInt();
					b = in.nextInt();					
					System.out.println("Wynik:" + a + "+" + b +"="+ wynik.suma(a, b));
					System.out.println("*********************************");
					break;
				
				case (2):
					System.out.println("Podaj dwie liczby do podzielenia:");
					a = in.nextInt();
					b = in.nextInt();
					System.out.println("Wynik:" + a + "-" + b+"="+ wynik.roznica(a, b));
					System.out.println("*********************************");
					break;
			
				case (3):
					System.out.println("Podaj dwie liczby do pomno¿enia:");
					a = in.nextInt();
					b = in.nextInt();
					System.out.println("Wynik:" + a + "*" + b+"="+ wynik.iloczyn(a,b));
					System.out.println("*********************************");
					break;
				
				case (4):
					System.out.println("Podaj liczby do podzielenia:");
					a = in.nextInt();
					b = in.nextInt();
					System.out.println("Wynik:" + a + "/" + b+"="+ wynik.iloraz(a,b));
					System.out.println("*********************************");
					break;
					
				case(5):
					System.out.println("Podaj liczbê:");
					a = in.nextInt();
					System.out.println("Wynik:" + wynik.wartosc_bezwgledna(a));
					System.out.println("*********************************");
					break;
					
				case(6):
					System.out.println("Podaj dwie wartoœci, które maj¹ byæ podniesione do potêgi");
					a = in.nextInt();
					b = in.nextInt();
					System.out.println("Wynik:" + wynik.potega(a,b));
					System.out.println("*********************************");
					break;
				case(7):
					System.out.println("Podaj wartoœæ, która ma zostaæ spierwiastkowana:");
					a = in.nextInt();
					System.out.println("Wynik:" + wynik.pierwiatek(a));
					System.out.println("*********************************");
					break;
			}
		System.out.println("Kliknij Enter, aby kontynuowaæ:");
		System.in.read();
		wybor = menu();
		}
		
	in.close();
	}
}
