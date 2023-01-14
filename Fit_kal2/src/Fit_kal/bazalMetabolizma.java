package Fit_kal;

import java.text.DecimalFormat;

public class bazalMetabolizma extends kisiselBilgiler{
	
	DecimalFormat formatter = new DecimalFormat("##.##");
	
	private double bazalE;
	private double bazalK;

	public bazalMetabolizma(int yas, int boy, double kilo, String cinsiyet,double bazalE,double bazalK) {
		super(yas, boy, kilo, cinsiyet);
		this.bazalE = bazalE;
		this.bazalK = bazalK;
	}
	
	public bazalMetabolizma() {
		
	}
	
	public void bazalHesapla(kisiselBilgiler a) {
		if(a.getCinsiyet().equals("Erkek"))
		{
			erkekbazalHesapla(a);
			bazalSonuc(a);
		}
		else if(a.getCinsiyet().equals("erkek")){
			
			erkekbazalHesapla(a);
			bazalSonuc(a);
		}
		else if(a.getCinsiyet().equals("Kadin")) {
			
			kadinbazalHesapla(a);
			bazalSonuc(a);
			
		}
		else if(a.getCinsiyet().equals("kadin")) {
			
			kadinbazalHesapla(a);
			bazalSonuc(a);
		}
			
	}
	
	public double erkekbazalHesapla(kisiselBilgiler a){
		
		this.bazalE = 88.362+((13.397)*a.getKilo())+((4.799)*a.getBoy())-((5.677)*a.getYas());
		return this.bazalE;
	}
	
	public double kadinbazalHesapla(kisiselBilgiler b) {
		
		this.bazalK = 447.593+((9.247)*b.getKilo())+((3.098)*b.getBoy())-((4.330)*b.getYas());
		return this.bazalK;
		
	}
	
	public void bazalSonuc(kisiselBilgiler a) {
		while(true) {	
		if(a.getCinsiyet().equals("Erkek")) {
			System.out.println("Bazal Metabolizma Hizi: "+formatter.format(this.bazalE));
			break; 
		}
		else if(a.getCinsiyet().equals("erkek")) {
			
			System.out.println("Bazal Metabolizma Hizi: "+formatter.format(this.bazalE));
			break;
		}
		else if(a.getCinsiyet().equals("Kadin")) {
			System.out.println("Bazal Metabolizma Hizi: "+formatter.format(this.bazalK));
			break;
		}
		else if(a.getCinsiyet().equals("kadin")) {
			System.out.println("Bazal Metabolizma Hizi: "+formatter.format(this.bazalK));
			break;
		}
		}
	}

}
