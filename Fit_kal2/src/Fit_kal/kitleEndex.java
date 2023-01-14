package Fit_kal;

import java.text.DecimalFormat;

public class kitleEndex extends kisiselBilgiler{
	
	DecimalFormat formatter = new DecimalFormat("##.##");
	
	private double index;
	

	public kitleEndex(String isim, String soyad, int yas, int boy, double kilo, String cinsiyet) {
		super(isim, soyad, yas, boy, kilo, cinsiyet);
	}

	public kitleEndex() {
		
	}
	
	public double kitleendexHesapla(kisiselBilgiler a) {
		
		this.index = (a.getKilo())/((a.getBoy()/100)^2);
		return this.index;
	}
	
	public void kitleSonuc() {
		if(this.index<=18.5) {
			System.out.println("Vucut kitle endexi: "+formatter.format(this.index)+" "+"Ideal kilonun altinda");
			System.out.println("Guc antrenmani ve kilo alma odakli antrenman uygulamalisin.");
		}
		else if ((this.index>=18.5)&&(this.index<=24.5)) {
			System.out.println("Vucut kitle endexi: "+formatter.format(this.index)+" "+"Ideal kiloda");
			System.out.println("Guc antrenmani ya da hipertrofi antrenmani uygulamalisin.");
		}
		else if((this.index>=25)&&(this.index<=29.9)) {
			System.out.println("Vucut kitle endexi: "+formatter.format(this.index)+" "+"Ideal kilonun ustunde");
			System.out.println("Guc antrenmani ve kilo verme odakli antrenman uygulamalisin.");
		}
		else if((this.index>=30)&&(this.index<=39.9)) {
			System.out.println("Vucut kitle endexi: "+formatter.format(this.index)+" "+"Ideal kilonun cok ustunde(obez)");
			System.out.println("Kardiyo odakli kilo verme antrenmani uygulamalisin.");
		}
		else {
			System.out.println("Vucut kitle endexi: "+formatter.format(this.index)+" "+"Ideal kilonun cok ustunde(morbid obez)");
			System.out.println("Kardiyo odakli kilo verme antrenmani uygulamalisin.");
		}
	}

}
