package Fit_kal;

import  java.util.Scanner; 

public class fitYemekler {

	private String yemek_turu;
	private String menu_kahvalti;
	private String menu_tatli;
	private String menu_icecek;
	private String menu_yemek;
	
	
	
	
	public fitYemekler() {
	}

	public fitYemekler(String yemek_turu, String menu_kahvalti, String menu_tatli, String menu_icecek,
			String menu_yemek) {
		this.yemek_turu = yemek_turu;
		this.menu_kahvalti = menu_kahvalti;
		this.menu_tatli = menu_tatli;
		this.menu_icecek = menu_icecek;
		this.menu_yemek = menu_yemek;
	}

	public String getYemek_turu() {
		return yemek_turu;
	}

	public void setYemek_turu(String yemek_turu) {
		this.yemek_turu = yemek_turu;
	}

	public String getMenu_kahvalti() {
		return menu_kahvalti;
	}

	public void setMenu_kahvalti(String menu_kahvalti) {
		this.menu_kahvalti = menu_kahvalti;
	}

	public String getMenu_tatli() {
		return menu_tatli;
	}

	public void setMenu_tatli(String menu_tatli) {
		this.menu_tatli = menu_tatli;
	}

	public String getMenu_icecek() {
		return menu_icecek;
	}

	public void setMenu_icecek(String menu_icecek) {
		this.menu_icecek = menu_icecek;
	}

	public String getMenu_yemek() {
		return menu_yemek;
	}

	public void setMenu_yemek(String menu_yemek) {
		this.menu_yemek = menu_yemek;
	}
	
	String yemekler = "\tYEMEKLER\n"
			+ "1.SARIMSAKLI TAVUK \r\n"
			+ "2.TON BALIKLI BURGER \r\n"
			+ "3.FİT TAVUK BURGER \r\n"
			+ "4.DİYET PİZZA \r\n"
			+ "5.HİNDİ FÜME DÜRÜM \r\n"
			+ "6.FIRINDA ALABALIK \r\n"
			+ "7.YEŞİL MERCİMEK YEMEĞİ \r\n"
			+ "8.MERCİMEK SALATASI \r\n"
			+ "9.DOMATESLİ TAVUK SOTE \r\n"
			+ "10.BROKOLİLİ TAVUK YEMEĞİ \r\n"
			+ "11.LOR KÖFTESİ \r\n"
			+ "12.BULGUR PİLAVI \r\n"
			+ "13.FIRINDA HİNDİ GÖĞÜS \r\n"
			+ "14.LOR PEYNİRLİ SALATA \r\n"
			+ "15.SEBZELİ HİNDİ YEMEĞİ \r\n"
			+ "16.FIRINDA TAVUK PATATES \r\n"
			+ "17.ZERDEÇALLI PİLAV \r\n"
			+ "18.ISPANAKLI MAKARNA \r\n"
			+ "19.DİYET PİZZA (TON) \r\n"
			+ "20.FIRINDA KIRMIZI ET \r\n"
			+ "21.TAVUK KÖFTESİ \r\n"
			+ "22.HUMUS \r\n"
			+ "23.TAVUK SARMA \r\n"
			+ "24.PESTO SOSLU TAVUK \r\n"
			+ "25.FİT SOSLAR \r\n"
			+ "26.BAĞIŞIKLIK ÇORBASI \r\n"
			+ "27.DİYET CİPS \r\n ";
	
	String tatlilar = "\t TATLILAR \n"
			+ "1.MOZAİK PASTA \r\n"
			+ "2.FİT WAFFLE \r\n"
			+ "3.PROTEİN DONDURMASI \r\n"
			+ "4.FİT DONDURMALAR \r\n"
			+ "5.PROTEİNLİ KEK \r\n"
			+ "6.YULAF TOPLARI \r\n"
			+ "7.YULAFLI KURABİYE \r\n"
			+ "8.MEYVE PASTASI \r\n"
			+ "10.ÇİKOLATA TOPLARI \r\n"
			+ "11.CHIA PUDİNG \r\n"
			+ "12.HAVUÇLU KEK \r\n"
			+ "13.DİYET GÜLLAÇ \r\n"
			+ "14.MUZ EKMEĞİ \r\n"
			+ "15.MUZLU MUG CAKE \r\n"
			+ "16.DİYET ÇİKOLATA \r\n"
			+ "17.YULAFLI TART \r\n"
			+ "18.MAGNOLIA \r\n";

	String icecekler = "\t ICECEKLER \n"
			+ "1.PROTEINLI SHAKE1 \r\n"
			+ "2.PROTEINLI SHAKE2 \r\n"
			+ "3.PROTEINLI SHAKE3 \r\n"
			+ "4.DETOKS SHAKE1 \r\n"
			+ "5.DETOKS SHAKE2 \r\n"
			+ "6.DETOKS SHAKE3 \r\n"
			+ "7.KAHVALTI SHAKE1 \r\n"
			+ "8.KAHVALTI SHAKE2 \r\n"
			+ "9.KAHVALTI SHAKE3 \r\n";
			
	String kahvaltilar = "\t KAHVALTILAR \n"
			+ "1.KAHVELİ YULAF LAPASI \r\n"
			+ "2.UNSUZ MUZLU PANKEK \r\n"
			+ "3.KAHVELİ PANKEK \r\n"
			+ "4.LOR TAVA \r\n"
			+ "5.EV YAPIMI NOTELLA \r\n"
			+ "6.MANTARLI FİT OMLET \r\n"
			+ "7.ISPANAKLI VE PEYNİRLİ OMLET \r\n"
			+ "8.MUZLU YULAF LAPASI \r\n"
			+ "9.FISTIK EZMESİ \r\n"
			+ "10.TAHİNLİ UNSUZ PANKEK \r\n"
			+ "11.PROTEİN BOHÇASI \r\n"
			+ "12.TOK TUTAN PROTEİN TOSTU \r\n"
			+ "13.AKŞAMDAN HAZIRLAMALIK KAHVALTI \r\n"
			+ "14.FİT FRANSIZ TOSTU\n";
	
	public void yemekturuSec() {
		System.out.println("Kac ogun yemek yemek istiyorsunuz? \n(En fazla 4 ogun secebilirsiniz");
		while (true) {
			
		
		Scanner scanner = new Scanner(System.in);
		this.yemek_turu = scanner.nextLine();
		if(this.yemek_turu.equals("1")) {
			menuOlustur(yemekler);
			break;
		}
		else if(this.yemek_turu.equals("2")) {
			menuOlustur(yemekler, kahvaltilar);
			break;
		}
		else if(this.yemek_turu.equals("3")) {
			menuOlustur(yemekler, kahvaltilar, icecekler);
			break;
		}
		else if(this.yemek_turu.equals("4")) {
			menuOlustur(yemekler, kahvaltilar, icecekler, tatlilar);
			break;
		}
		else {
			System.out.println("Hatali tuslama yaptiniz.1-4 arasi deger tuslayiniz.");
			continue;
		}
		}
	}
	
	public void menuOlustur(String yemekler) {
		System.out.println(yemekler);
	}
	public void menuOlustur(String yemekler,String kahvaltilar) {
		System.out.println(yemekler);
		System.out.println(kahvaltilar);
	}
	public void menuOlustur(String yemekler,String kahvaltilar,String icecekler) {
		System.out.println(yemekler);
		System.out.println(icecekler);
		System.out.println(kahvaltilar);
	}
	public void menuOlustur(String yemekler,String kahvaltilar,String icecekler,String tatlilar) {
		System.out.println(yemekler);
		System.out.println(icecekler);
		System.out.println(kahvaltilar);
		System.out.println(tatlilar);
	}
	
	
	
}