package Fit_kal;

import java.util.Scanner;
	
	public class suTakibi implements hedefeYakinlik {
		private int hedeflenenbardakSayisi;
		private int icilenbardakSayisi;
		final int litreDegeri = 250;
		
		public void suTakibi() {
			hedefAlma();
			icilenbardakSayisi();
			hedefeYakinlik();
			litre.litreDonusturme();
		}
		
		public suTakibi() {
			
		}
		
		public suTakibi(int hedeflenenbardakSayisi, int içilenbardakSayisi) {
			this.hedeflenenbardakSayisi = hedeflenenbardakSayisi;
			this.icilenbardakSayisi = içilenbardakSayisi;
		}

		public int getHedeflenenbardakSayisi() {
			return hedeflenenbardakSayisi;
		}

		public void setHedeflenenbardakSayisi(int hedeflenenbardakSayisi) {
			this.hedeflenenbardakSayisi = hedeflenenbardakSayisi;
		}

		public int getIçilenbardakSayisi() {
			return icilenbardakSayisi;
		}

		public void setIçilenbardakSayisi(int içilenbardakSayisi) {
			this.icilenbardakSayisi = içilenbardakSayisi;
		}

		@Override
		public void hedefeYakinlik() {
			
			int fark = hedeflenenbardakSayisi - icilenbardakSayisi ;
			System.out.println("Eksik icilen bardak sayisi :"+fark);
		}
		
		public void hedefAlma() {
			
			System.out.println("Hedifiniz kac bardak su icmek ?");
			Scanner scanner = new Scanner(System.in);
			hedeflenenbardakSayisi = scanner.nextInt();
			scanner.nextLine();
		}
		
		public void icilenbardakSayisi() {
			
			System.out.println("Kac bardak su ictiniz ?");
			Scanner scanner = new Scanner(System.in);
			icilenbardakSayisi= scanner.nextInt();
			scanner.nextLine();
		}
		
		
		public class litreDonusturme {
			public double litreDonusturme() {
				double icilenmiliLitre = litreDegeri*icilenbardakSayisi;
				double icilenLitre = icilenmiliLitre/1000;
				System.out.println("Toplam "+icilenLitre+" L su ictiniz.");
				return icilenLitre;
			}
		}
		suTakibi.litreDonusturme litre = new suTakibi.litreDonusturme();
}
