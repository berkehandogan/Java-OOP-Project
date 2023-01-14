package Fit_kal;

import java.util.Scanner;

public class kisiselBilgiler {
	private String isim;
	private String soyad;
	private int yas;
	private int boy;
	private double kilo;
	private String cinsiyet;
	
	public kisiselBilgiler() {
		
	}
	
	public kisiselBilgiler(int yas, int boy, double kilo, String cinsiyet) {
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
		this.cinsiyet = cinsiyet;
	}

	public kisiselBilgiler(String isim, String soyad, int yas, int boy, double kilo, String cinsiyet) {
		this.isim = isim;
		this.soyad = soyad;
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
		this.cinsiyet = cinsiyet;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public void bilgileriAl() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		kisiselBilgiler kisi = new kisiselBilgiler();
		kitleEndex a = new kitleEndex();
		bazalMetabolizma b = new bazalMetabolizma();
		idmanProgram i = new idmanProgram();
		diyet d = new diyet();
		
		System.out.println("Ad : ");
		isim = scanner.nextLine();
		kisi.setIsim(isim);
		
		System.out.println("Soyad");
		soyad = scanner.nextLine();
		kisi.setSoyad(soyad);
		
		
		while(true) {
		System.out.println("Yas :");
		yas = scanner.nextInt();
		scanner.nextLine();
		if(this.yas<=0) {
			try {
				throw new Exception();
			}
			catch(Exception e) {
				System.out.println("Yasiniz 0'dan kucuk olamaz.Yeniden giriniz...");
			}
			continue;
		}
		kisi.setYas(yas);
		break;
		}
		
		
		while(true) {
		System.out.println("Boy :");
		boy = scanner.nextInt();
		scanner.nextLine();
		if(this.boy<=0) {
			try {
				throw new Exception();
			}
			catch(Exception e){
				System.out.println("Boyunuz 0'dan kucuk olamaz.Yeniden giriniz...");
			}
			continue;
		}
		kisi.setBoy(boy);
		break;
		}
		
		while(true) {
		System.out.println("Kilo :");
		this.kilo = scanner.nextDouble();
		scanner.nextLine();
		if(this.kilo<=0) {
			try {
				throw new Exception();
			}
			catch(Exception e) {
				System.out.println("Kilonuz 0'dan kucuk olamaz.Yeniden giriniz...");
			}
			continue;
		}

		kisi.setKilo(this.kilo);
		break;
		}
		
		while(true) {
			System.out.println("Cinsiyet :");
			this.cinsiyet = scanner.nextLine();
			if((!this.cinsiyet.equals("Erkek"))&&(!this.cinsiyet.equals("erkek"))&&(!this.cinsiyet.equals("Kadin"))&&(!this.cinsiyet.equals("kadin"))) {
				
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Yanlis veya hatali tuslama yaptiniz.Tekrardan girin...");
			
		}
		continue;
		
			}
				
		kisi.setCinsiyet(this.cinsiyet);
		System.out.println(kisi+"\n");
		a.kitleendexHesapla(kisi);
		a.kitleSonuc();
		b.bazalHesapla(kisi);
		i.programVer();
		break;
		
		}
	
	}
    
	@Override
	public String toString() {
		return "\t\t\tBilgileriniz :\n"+"Isim: "+getIsim()+" Soyad: "+getSoyad()+" Yas: "+getYas()+
				" Boy: "+getBoy()+" Kilo: "+getKilo()+" Cinsiyet: "+getCinsiyet();
	}
	
}
