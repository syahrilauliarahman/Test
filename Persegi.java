import java.util.Scanner;
public class Persegi{
	public static void main(String[] args) {
		
		int panjang,lebar,luas,kel;
		Scanner ss = new Scanner(System.in);


		System.out.println("		Menghitung Luas dan Keliling Persegi Panjang");
		
		System.out.print("Input Panjang : ");
		panjang = ss.nextInt();
		System.out.print("Input Lebar   : ");
		lebar = ss.nextInt();

		luas = panjang*lebar;
		kel = 2*panjang+2*lebar;
		System.out.println("		Hasil Perhitungan");
		
		System.out.println("Luas      : "  +luas);
		System.out.print("Keliling  : "  +kel);
		
	}
}