package odev;
import java.util.Scanner;
public class Odev {

	public static void main(String[] args) {
		Scanner harf = new Scanner(System.in);
		Scanner not = new Scanner(System.in);
		Scanner isim = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi girin:");
		String ad = isim.nextLine();
		System.out.println("Lutfen not araliginin min degerini girin: ");
		int min = not.nextInt();
		System.out.println("Lutfen not araligini max degerini girin: ");
		int max = not.nextInt();
		System.out.println("Lutfen bu araligin harf basari notunu girin: ");
		String hbs= harf.nextLine();
		
		System.out.println("İsim: "+ad+"\nNot araligi: "+min+" ile "+max+"\nHarf Basari Notu: "+hbs);
		
	}

}
