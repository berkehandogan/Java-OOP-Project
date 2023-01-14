package Fit_kal;

import java.util.Scanner;

public class adimTakibi implements hedefeYakinlik {
	
	private int hedef;
	private int atilanAdim;
	private double mesafe;
	private double kalori;
	
	public adimTakibi() {
		
	}
	
	public void adimTakip() {
		hedefAlma();
		atilanadimSayisi();
		hedefeYakinlik();
		mesafeHesapla();
		yk.yakilan_kalori();
	}
	
	public int getHedef() {
		return hedef;
	}
	public void setHedef(int hedef) {
		this.hedef = hedef;
	}
	public int getAtilanAdim() {
		return atilanAdim;
	}
	public void setAtilanAdim(int atilanAdim) {
		this.atilanAdim = atilanAdim;
	}
	public double getMesafe() {
		return mesafe;
	}
	public void setMesafe(double mesafe) {
		this.mesafe = mesafe;
	}
	public double getKalori() {
		return kalori;
	}
	public void setKalori(double kalori) {
		this.kalori = kalori;
	}

	@Override
	public void hedefeYakinlik() {
		
		int fark = hedef-atilanAdim;
		if(fark>3000) {
			System.out.println("Hedefinizden cok uzaksiniz");
			
		}
		else if(fark == 0) {
			System.out.println("Hedefinizi basariyla tamamladiniz"); 
			
		}
		else {
			System.out.println("Hedefinizden "+fark+ " adim uzaksiniz");
		}
		
	}
	
	public void mesafeHesapla() {
		this.mesafe = atilanAdim*0.65;
		System.out.println("Toplam yurunen mesafe: "+this.mesafe+"metre");
	}
	
	public void hedefAlma() {
		System.out.println("Hedifiniz kac adim ?");
		Scanner scanner = new Scanner(System.in);
		this.hedef = scanner.nextInt();
	}
	
	public void atilanadimSayisi() {
		System.out.println("Kac adim attiniz");
		Scanner scanner = new Scanner(System.in);
		this.atilanAdim = scanner.nextInt();
		
	}
	
	public class yakilanKalori{
		
		public double yakilan_kalori() {
			kalori= atilanAdim*0.05;
			System.out.println("Yakilan kalori : "+kalori+" kcal");
			return kalori;
		}
}
	adimTakibi.yakilanKalori yk = new adimTakibi.yakilanKalori();
}
