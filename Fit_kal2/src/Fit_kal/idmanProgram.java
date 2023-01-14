package Fit_kal;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class idmanProgram {

	private String kacgun_spor ;
	private String hedef;
	
	
	diyet diyet1 = new diyet();
	
	
	/*public void calismaProgram() {
		programVer();
		diyet1.diyetCalistir();
	}*/
	
	
	public String getHedef() {
		return hedef;
	}


	public void setHedef(String hedef) {
		this.hedef = hedef;
	}


	public idmanProgram() {
		
	}
	
	public idmanProgram(String kacgun_spor,String hedef) {
		this.kacgun_spor = kacgun_spor;
		this.hedef = hedef;
	}
	

	public String getKacgun_spor() {
		return kacgun_spor;
	}

	public void setKacgun_spor(String kacgun_spor) {
		this.kacgun_spor = kacgun_spor;
	}
	
	public void programVer() {
		
		while(true) {
			System.out.println("Hedefiniz nedir ?\n1. Kilo Alma 2. Kilo verme");
			Scanner scanner = new Scanner(System.in);
			this.hedef = scanner.nextLine();
			idmanProgram idman = new idmanProgram();
			idman.setHedef(hedef);
			
			diyet1.hedefAl(idman);
			System.out.println("Kac gun spor yapacaksiniz ?(3 gun ya da 5 gun secilebilir)");
			this.kacgun_spor = scanner.nextLine();
		if((this.hedef.equals("1")) && (this.kacgun_spor.equals("3"))) {
			System.out.println("Programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program1);
			diyet1.beslenmeturuAl();
			break;

		}
		else if ((this.hedef.equals("1")) && (this.kacgun_spor.equals("5"))) {
			System.out.println("Programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program2);
			diyet1.beslenmeturuAl();
			break;
			
		}
		else if((this.hedef.equals("2")) && (this.kacgun_spor.equals("3"))) {
			System.out.println("Programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(program3);
			diyet1.beslenmeturuAl();
			break;
			
		}
		else if((this.hedef.equals("2")) && (this.kacgun_spor.equals("5"))) {
			System.out.println("Programiniz hazirlaniyor...");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(program4);
			diyet1.beslenmeturuAl();
			break;
			
		}
		else {
			System.out.println("Hatali tuslama yaptiniz....");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			continue;
			
		}

		}
		
	}
		
		 public final String program1 = "1- Flat Bench Press 3x8 \r\n"
				+ "2- Incline Alternating Dumbell Press 3x10 \r\n"
				+ "3- Stationary Lunges 3x10 \r\n"
				+ "4- Walking Lunges 3x10 \r\n"
				+ "5- Standing Dumbell Press 3x8 \r\n"
				+ "6- Side Raise 3x15\r\n"
				+ "7- Seated Face Pull 3x15\r\n"
				+ "8- Arnold Press 3x15 \r\n"
				+ "9- High Hammer Row 3x8 \r\n"
				+ "10- Lat Pulldown 3x10 \r\n"
				+ "11- Supinated Curl 3x8 \r\n"
				+ "12- High Cable Triceps Extensions 3x10 ";
		
		 public final String program2 ="Pazartesi:\r\n"
				+ "\r\n"
				+ "1)BENCH PRESS 4x6-8\r\n"
				+ "2)INCLINE DUMBELL PRESS 4x6-8\r\n"
				+ "3)CABLE CROSS 3x12-15\r\n"
				+ "4)OVERHEAD PRESS 4x8-10\r\n"
				+ "5)LATERAL RAISE 4x12-15\r\n"
				+ "6)REAR DELT 3x12-15\r\n"
				+ "7)TRICEPS PUSHDOWN 4x8-10\r\n"
				+ "\r\n"
				+ "Salı:\r\n"
				+ "\r\n"
				+ "1)LAT PULLDOWN 4x8-10\r\n"
				+ "2)BARBELL ROW 4x8-10\r\n"
				+ "3)CABLE ROW 3x12-15\r\n"
				+ "4)ROPE PULLOVER 3x12-15\r\n"
				+ "5)PULL UP 1xFAILER\r\n"
				+ "6)BARBELL CURL 4x8-10\r\n"
				+ "7)DUMBELL CURL 4x8-10\r\n"
				+ "\r\n"
				+ "Çarşamba:\r\n"
				+ "\r\n"
				+ "1)SQUAT 4x8-10 + 2x12-15\r\n"
				+ "2)LEG PRESS 4x8-10 + 2x12-15\r\n"
				+ "3)LEG CURL 5x12-15\r\n"
				+ "4)CALF RAISE 4x15-20\r\n"
				+ "\r\n"
				+ "Perşembe:\r\n"
				+ "\r\n"
				+ "DINLENME GUNU\r\n"
				+ "\r\n"
				+ "CUMA:\r\n"
				+ "\r\n"
				+ "1)INCLINE DUMBEL PRESS 4x6-8\r\n"
				+ "2)CABLE CROSS 3x12-15\r\n"
				+ "3)OVERHEAD PRESS 4x8-10\r\n"
				+ "4)LATERAL RAISE 3x8-10 + 3x12-15\r\n"
				+ "5)REAR DELT 3x12-15\r\n"
				+ "6)TRICEPS PUSHDOWN 4x8-10\r\n"
				+ "\r\n"
				+ "Cumartesi:\r\n"
				+ "\r\n"
				+ "1)LAT PULLDOWN 4x8-10\r\n"
				+ "2)CABLE ROW 4x12-15\r\n"
				+ "3)ROMANIAN DEADLIFT 4x8-10\r\n"
				+ "4)DUMBELL CURL 4x8-10\r\n"
				+ "5)LEG PRESS 5x8-10\r\n"
				+ "6)CALF RAISE 4x15-20\r\n"
				+ "\r\n"
				+ "Pazar:\r\n"
				+ "\r\n"
				+ "DINLENME GUNU";
		
		 public final String program3 ="1)Plated Front Squats 20-16-8-8\r\n"
				+ "2)Stiff Leg Deadlifts 20-15-15\r\n"
				+ "3)Ham Curls 6-6-6\r\n"
				+ "4)Close Grip Bench Press 6-6-6-20\r\n"
				+ "5)Pull Ups 6-15 arası 4 set\r\n"
				+ "6)Angled Side Raise 15-20 arası 4 set\r\n"
				+ "7)Cable Pull 15-15-15\r\n"
				+ "8)Superset Dumble Curl & Long Bar Curl 12-10-8\r\n"
				+ "9)Skull Crushers 8-6-6\r\n"
				+ "10) 30dakika En yüksek eğimde,yavaş tempo yürüyüş\r\n"
				+ "11) 30dakika Bisiklet";
		
		 public final String program4 ="1.gün:\r\n"
				+ "\r\n"
				+ "PULL UP 5x8\r\n"
				+ "RACKPULL 4x15\r\n"
				+ "SEATED CABLE ROW WIDE GRIP 4x12\r\n"
				+ "LAT PULLDOWN CLOSE GRIP 4x15\r\n"
				+ "T BAR ROW 5x12\r\n"
				+ "STRAIGHT ARM LAT PULLDOWN 4x20\r\n"
				+ "30 dakika en yüksek eğimde,yavaş tempo yürüyüş\r\n"
				+ "\r\n"
				+ "2.gün:\r\n"
				+ "\r\n"
				+ "DB BENCH PRESS 5x6\r\n"
				+ "DB FLOOR CHEST FLY 4x20\r\n"
				+ "DB STANDING UPPER CHEST FLY 4x15\r\n"
				+ "DECLINE BENCH PRESS 4x12\r\n"
				+ "DB CHEST STATIC HOLD 3x15\r\n"
				+ "FLAT BENCH DUMBELL HEX PRESS 4x12\r\n"
				+ "30 dakika bisiklet\r\n"
				+ "\r\n"
				+ "3.gün:\r\n"
				+ "\r\n"
				+ "BACK SQUAT 5x6\r\n"
				+ "LEG EXTENSION 4x20\r\n"
				+ "LYING LEG CURL 4x15\r\n"
				+ "BARBELL LUNGE 5x20\r\n"
				+ "ABDUCTOR MACHINE 4x15\r\n"
				+ "DB SEATED CALF RAISE 4x20\r\n"
				+ "30 dakika en yüksek eğimde,yavaş tempo yürüyüş\r\n"
				+ "\r\n"
				+ "4.gün:\r\n"
				+ "\r\n"
				+ "SEATED MILITARY PRESS 5x10\r\n"
				+ "ARNOLD PRESS 3x15\r\n"
				+ "SEATED LATERAL RAISE 4x20\r\n"
				+ "DB UPRIGHT ROW 4x15\r\n"
				+ "FRONT RAISE 4x15\r\n"
				+ "DB INCLINE BENCH REAR DELT RAISE 4x15\r\n"
				+ "30 dakika bisiklet\r\n"
				+ "\r\n"
				+ "5.gün:\r\n"
				+ "\r\n"
				+ "CABLE CURL 4x15\r\n"
				+ "DUMBELL HAMMER CURL 4x15 \r\n"
				+ "Z BAR REVERSE CURL 3x15\r\n"
				+ "TRICEPS DIPS 4x12\r\n"
				+ "DUMBELL TRICEPS EXTENSIONS 4x12 \r\n"
				+ "CABLE TRICEPS PUSHDOWN FLAT BAR 4x12  ";
	}
	

