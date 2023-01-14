package Fit_kal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Sisteme hosgeldiniz...");
		System.out.println("**********************");
		System.out.println("1.Kisisel Takip ve PT'lik\n"
						  +"2.Adim Takibi\n"
						  +"3.Su Takibi\n"
						  +"4.Fit Yemek Listesi\n"
						  +"Cikis icin q'ya basiniz.\n"
						  + "************************");
		while(true) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yapmak istediginiz islemi seciniz.");
		String secim = scanner.nextLine();
		if(secim.equals("1")) {
			kisiselBilgiler kisi = new kisiselBilgiler();
			try {
				kisi.bilgileriAl();
			} catch (Exception e) {
				e.printStackTrace();
			}
			continue;
		}
		else if(secim.equals("2")) {
			adimTakibi adim = new adimTakibi();
			adim.adimTakip();
			continue;
		}
		else if(secim.equals("3")) {
			suTakibi su = new suTakibi();
			su.suTakibi();
			continue;
		}
		else if (secim.equals("4")) {
			fitYemekler f = new fitYemekler();
			f.yemekturuSec();
					
		}
		else if(secim.equals("q")) {
			System.out.println("Programdan cikiliyor...");
			break;
		}
		else {
			System.out.println("Hatali tuslama yaptiniz.Tekrardan tuslayiniz.");
			continue;
		}
		}
	}

}
