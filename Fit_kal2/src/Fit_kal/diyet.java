package Fit_kal;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class diyet {
	
	
	private String beslenme_turu;
	private String hedef;
	
	public final String program1 ="\tKahvalti :\nYulaf(100g)\nSoya sutu(250ml)\nVegan protein tozu(30g)\n1 kase cig maydanoz\n1 corba kasigi limon suyu\n\t1.Ara Ogun\n1 dilim tam bugday ekmegi\nYer fistigi ezmesi\n2 kuru kayisi\n\tOgle Yemegi\nKuru fasulye(100g)\nPirinc pilavi(100g)\nBrokoli\n1 tatli kasigi zeytinyagi\n\t2. Ara Ogun\nYarim avakado\n2 porsiyon meyve\n\tAksam Yemegi\nSoya kiyma(100g)\nBulgur pilavi(75g)\nYesil salata\n1 tatli kasigi zeytinyagi\n\tYatmadan Once\n1 avuc badem\n\n\tKalori:2900kcal\n\tProtein:145g\n\tYag:100g\n\tKarbonhidrat:355g";
	
	public final String program2 ="\tKahvalti :\n4 adet tuzsuz zeytin\n2 dilim esmer ekmek\nDomates,Salatalik\nMarul salatasi\nYesil cay\n\t1.Ara Ogun\nMevsim salatasi\n\tOgle Yemegi\n1 Kase lahana corbasi\nRoka salatasi\n1 su bardagi portakal suyu\n\t2. Ara Ogun\nRezene cayi\n2 adet kepekli galeta\n\tAksam Yemegi\n6 yemek kasigi suyu suzulmus taze fasulye yemegi\n3 yemek kasigi bulgur pilavi\nMarul salatasi\n1 adet orta boy elma\n\tYatmadan Once\nMelisa cayi\n\n\tKalori:1450kcal\n\tProtein:150g\n\tYag:50g\n\tKarbonhidrat:100g";
	
	public final String program3 ="\tKahvalti :\n200ml sut\n50 gr yulaf\n4 yumurta\n1 domates\n2 peynir\n1 elma\n\t1.Ara Ogun\n2 muz\n1 avuc badem\n\tOgle Yemegi\n150 gram tavuk gogsu\nPirinc pilavi(200g)\nBrokoli 200 gram\n\tAksam Yemegi\nTavuk gogsu(150g)\nNohut(300g)\n3 kasik yogurt\nSalata 100gr\n\tKalori:2966kcal\n\tProtein:179g\n\tYag:106g\n\tKarbonhidrat:300g";
	
	public final String program4 ="\tKahvalti :\nYulaf(50g)\n3 yumurta\n1 adet Domates\n200 ml sut\n\tOgle Yemegi\nPirinc pilavi(100g)\nBrokoli(200g)\n200 gram tavuk gogsu\n\tAksam Yemegi\n200 gram tavuk gogsu\n250 gram mantar\n3 yemek kasigi yogurt\n100 gram coban salata\n\tYatmadan Once\n1 avuc badem\n\n\tKalori:1855kcal\n\tProtein:171g\n\tYag:63g\n\tKarbonhidrat:146g";
	
	public final String program5 ="\tKahvalti :\nYarim su bardagi yulaf\nBir cay bardagi ahududu\n1 tutam tarcin\n\t1.Ara Ogun\n1 ortra boy elma\n\tOgle Yemegi\n1 porsiyon tam bugday sebzeli durum\n\t2. Ara Ogun\nYarim su bardagi yagsiz sade yogurt\n4tane cilek\n\tAksam Yemegi\n1 porsiyon mantarli sebzeli burger\n\n\tKalori:1224kcal\n\tProtein:45g\n\tYag:43g\n\tKarbonhidrat:173g";
	
	public final String program6 ="\tKahvalti :\nYarim su bardagi yagsiz sut veya yarim su bardagi yulaf\nyarim elma\n1 avuc ceviz\n\t1.Ara Ogun\n1 ortra boy elma\n\tOgle Yemegi\n2 porsiyon tam bugday sebzeli durum\n\t2. Ara Ogun\n2 adet haslanmis yumurta\n\tAksam Yemegi\n1 porsiyon korili nohut yahni\n\n\tKalori:1634kcal\n\tProtein:82g\n\tYag:46g\n\tKarbonhidrat:138g";

	public diyet(String beslenme_turu) {
		this.beslenme_turu = beslenme_turu;
	}
	
	public diyet() {
		
	}

	public String getBeslenme_turu() {
		return beslenme_turu;
	}

	public void setBeslenme_turu(String beslenme_turu) {
		this.beslenme_turu = beslenme_turu;
	}
	
	public String hedefAl(idmanProgram diyet1 ) {
		this.hedef=diyet1.getHedef();
		return this.hedef;
	}
	
	/*public void diyetCalistir() {
		beslenmeturuAl();
	}*/
	
	public void beslenmeturuAl() {
		
		while(true) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Beslenme turunu seciniz.");
		System.out.println("1.Vegan\n2.Vejetaryen\n3.Normal");
		String secim = scanner.nextLine();
		
		if(secim.equals("1")&&this.hedef.equals("1")) {
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program1);
			break;
		}
		else if(secim.equals("1")&&this.hedef.equals("2")) {
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program2);
			break;
		}
		else if(secim.equals("2")&&this.hedef.equals("1")) {
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program6);
			break;
		}
		else if(secim.equals("2")&&this.hedef.equals("2")){
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program5);
			break;
		}
		else if(secim.equals("3")&&this.hedef.equals("1")) {
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program3);
			break;
		}
		else if(secim.equals("3")&&this.hedef.equals("2")) {
			System.out.println("Diyet programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program4);
			break;
		}
		else {
			System.out.println("Hatali tuslama yaptiniz...");
			continue;
		}
	}
	}
	
}

