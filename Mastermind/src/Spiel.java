import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Spiel {
	public static int anzahlRotCom ;
	public static int anzahlGelbCom ;
	public static int anzahlGr¸nCom ;
	public static int anzahlSchwarzCom;
	public static int anzahlWeiﬂCom;
	public static int anzahlBlauCom;
	
	public static int anzahlRotPlayer ;
	public static int anzahlGelbPlayer  ;
	public static int anzahlGr¸nPlayer  ;
	public static int anzahlSchwarzPlayer ;
	public static int anzahlWeiﬂPlayer ;
	public static int anzahlBlauPlayer ;

	public static void buttonsEnable(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4) {

		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

	}
	public static void buttonsEnable(JButton button1) {
		button1.setEnabled(true);		

	}
	public static void resetColor(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4){
		button1.setBackground(null);
		button2.setBackground(null);
		button3.setBackground(null);
		button4.setBackground(null);
	}
	
	public static void buttonsNotVisible(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4){
		button1.setVisible(false);
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
	}
	public static void buttonsVisible(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4){
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);
	}

	public static void buttonsEnable(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4,
			JRadioButton button5, JRadioButton button6) {

		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);

	}

	public static void buttonsDisable(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4) {

		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);

	}
	

	public static void resetColor(JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4,
			JRadioButton button5, JRadioButton button6) {

		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);

	}
	public static void buttonsDisable(JButton button1) {

		button1.setEnabled(false);
	
	}
	
	public static void anzahlFarbenComputer(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4){			
		anzahlRotCom = 0;
		anzahlGelbCom =0;
		anzahlGr¸nCom = 0;
		anzahlWeiﬂCom = 0;
		anzahlSchwarzCom =0;
		anzahlBlauCom = 0;
		
		String[] farbarray = {auswahl1, auswahl2, auswahl3, auswahl4};

		for (String eintrag : farbarray){
			if (eintrag == "rot"){
				anzahlRotCom++;
			}else if (eintrag == "gelb"){
				anzahlGelbCom ++;
			}else if (eintrag == "gr¸n"){
				anzahlGr¸nCom++;
			}else if (eintrag == "schwarz"){
				anzahlSchwarzCom++;
			}else if (eintrag == "weiﬂ"){
				anzahlWeiﬂCom++;
			}else if (eintrag == "blau"){
				anzahlBlauCom++;
			}		
		}
		//System.out.println(anzahlBlauCom);
	}
	

	public static void anzahlFarbenSpieler(String zugFarbe1, String zugFarbe2,
			String zugFarbe3, String zugFarbe4){			
		anzahlRotPlayer = 0;
		anzahlGelbPlayer  =0;
		anzahlGr¸nPlayer  = 0;
		anzahlWeiﬂPlayer  = 0;
		anzahlSchwarzPlayer  =0;
		anzahlBlauPlayer  = 0;
		
		String[] farbarray = {zugFarbe1, zugFarbe2, zugFarbe3, zugFarbe4};

		for (String eintrag : farbarray){
			if (eintrag == "rot"){
				anzahlRotPlayer++;
			}else if (eintrag == "gelb"){
				anzahlGelbPlayer ++;
			}else if (eintrag == "gr¸n"){
				anzahlGr¸nPlayer++;
			}else if (eintrag == "schwarz"){
				anzahlSchwarzPlayer++;
			}else if (eintrag == "weiﬂ"){
				anzahlWeiﬂPlayer++;
			}else if (eintrag == "blau"){
				anzahlBlauPlayer++;
			}		
		}
		//System.out.println(anzahlBlauPlayer);
	}

	// spielalgorithmus
	// hier editieren und um anzahlFarben (Farben von Computer und Spieler vergleichen) erg‰nzen
	public static String runde1(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {

		if (zugFarbe == auswahl1) {
			return "schwarz";
		} else if (zugFarbe == auswahl2) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl3) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl4) {
			return "weiﬂ";
		} else {
			return "nichts";
		}
	}

	public static String runde2(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {

		if (zugFarbe == auswahl2) {
			return "schwarz";
		} else if (zugFarbe == auswahl1) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl3) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl4) {
			return "weiﬂ";
		} else {
			return "nichts";
		}
	}

	public static String runde3(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {

		if (zugFarbe == auswahl3) {
			return "schwarz";
		} else if (zugFarbe == auswahl1) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl2) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl4) {
			return "weiﬂ";
		} else {
			return "nichts";
		}
	}

	public static String runde4(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {

		if (zugFarbe == auswahl4) {
			return "schwarz";
		} else if (zugFarbe == auswahl1) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl2) {
			return "weiﬂ";
		} else if (zugFarbe == auswahl3) {
			return "weiﬂ";
		} else {
			return "nichts";
		}
	}

	public static void setErgebnisColor(String ergebnis1, String ergebnis2,
			String ergebnis3, String ergebnis4, JRadioButton button1,
			JRadioButton button2, JRadioButton button3, JRadioButton button4) {		
		int schwarze = 0;
		int weiﬂe = 0;
		//schwarz hat immer Vorrang
		//wenn 1 schwarz und Rest weiﬂ dann der erste button schwarz und restliche weiﬂe buttons danach
		if(ergebnis1 == "schwarz"){
			schwarze ++;
		}
		if(ergebnis2 == "schwarz"){
			schwarze ++;			
		}
		if(ergebnis3 == "schwarz"){
			schwarze ++;			
		}
		if(ergebnis4 == "schwarz"){
			schwarze ++;			
		}
		if(ergebnis1 == "weiﬂ"){
			weiﬂe ++;
		}
		if(ergebnis2 == "weiﬂ"){
			weiﬂe ++;
		}
		if(ergebnis3 == "weiﬂ"){
			weiﬂe ++;
		}if(ergebnis4 == "weiﬂ"){
			weiﬂe ++;
		}
		
		if(schwarze == 1 && weiﬂe == 0){
			button1.setBackground(Color.black);
		}else if(schwarze == 1 && weiﬂe == 1){
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);			
		}
		else if(schwarze == 1 && weiﬂe == 2){
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
		}
		else if(schwarze == 1 && weiﬂe == 3){
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		}else if(schwarze == 2 && weiﬂe == 0){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
		}else if(schwarze == 2 && weiﬂe == 1){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.white);
		}
		else if(schwarze == 2 && weiﬂe == 2){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		}else if(schwarze == 3 && weiﬂe == 0){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);		
		}
		else if(schwarze == 3 && weiﬂe == 1){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);
			button4.setBackground(Color.white);
		}else if(schwarze == 4){
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);
			button4.setBackground(Color.black);
		}else if (schwarze == 0 && weiﬂe == 1){
			button1.setBackground(Color.white);
		}
		else if (schwarze == 0 && weiﬂe == 2){
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
		}else if (schwarze == 0 && weiﬂe == 3){
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
		}
		else if (schwarze == 0 && weiﬂe == 4){
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		}else if(schwarze == 1 && weiﬂe == 0){
			button1.setBackground(Color.black);
		}
		
	
	}
	
	static String getAuswahl(JRadioButton button) {

		if (button.getBackground() == Color.red) {
			return "rot";
		} else if (button.getBackground() == Color.blue) {
			return "blau";
		} else if (button.getBackground() == Color.green) {
			return "gr¸n";
		} else if (button.getBackground() == Color.black) {
			return "schwarz";
		} else if (button.getBackground() == Color.white) {
			return "weiﬂ";
		} else if (button.getBackground() == Color.yellow) {
			return "gelb";
		} else {
			return "nichts";
		}
	}

	public static boolean gewonnen(String ergebnis1, String ergebnis2,
			String ergebnis3, String ergebnis4) {

		if (ergebnis1 == "schwarz" && ergebnis2 == "schwarz" && ergebnis3 == "schwarz" && ergebnis4 == "schwarz") {
			return true;
		} else {
			return false;
		}

	}

	public static String setComputerColors1() {
		int auswahl1 = (int) ((Math.random() * 6) + 1);

		if (auswahl1 == 1) {
			return "rot";
		} else if (auswahl1 == 2) {
			return "gelb";
		} else if (auswahl1 == 3) {
			return "gr¸n";
		} else if (auswahl1 == 4) {
			return "schwarz";
		} else if (auswahl1 == 5) {
			return "weiﬂ";
		} else {
			return "blau";
		}

	}

	public static String setComputerColors2() {
		int auswahl2 = (int) ((Math.random() * 6) + 1);

		if (auswahl2 == 1) {
			return "rot";
		} else if (auswahl2 == 2) {
			return "gelb";
		} else if (auswahl2 == 3) {
			return "gr¸n";
		} else if (auswahl2 == 4) {
			return "schwarz";
		} else if (auswahl2 == 5) {
			return "weiﬂ";
		} else {
			return "blau";
		}
	}

	public static String setComputerColors3() {
		int auswahl3 = (int) ((Math.random() * 6) + 1);
		if (auswahl3 == 1) {
			return "rot";
		} else if (auswahl3 == 2) {
			return "gelb";
		} else if (auswahl3 == 3) {
			return "gr¸n";
		} else if (auswahl3 == 4) {
			return "schwarz";
		} else if (auswahl3 == 5) {
			return "weiﬂ";
		} else {
			return "blau";
		}
	}

	public static String setComputerColors4() {
		
		int auswahl4 = (int) ((Math.random() * 6) + 1);

		if (auswahl4 == 1) {
			return "rot";
		} else if (auswahl4 == 2) {
			return "gelb";
		} else if (auswahl4 == 3) {
			return "gr¸n";
		} else if (auswahl4 == 4) {
			return "schwarz";
		} else if (auswahl4 == 5) {
			return "weiﬂ";
		} else {
			return "blau";
		}
	}

	public static void radiobuttonComputerColor(JRadioButton farbe1, JRadioButton farbe2, JRadioButton farbe3, JRadioButton farbe4, String auswahl1, String auswahl2, String auswahl3, String auswahl4){
	
		if (auswahl1 == "rot") {
			farbe1.setBackground(Color.red);
		} else if (auswahl1 == "gelb") {
			farbe1.setBackground(Color.yellow);
		} else if (auswahl1 == "gr¸n") {
			farbe1.setBackground(Color.green);
		} else if (auswahl1 == "schwarz") {
			farbe1.setBackground(Color.black);
		} else if (auswahl1 == "weiﬂ") {
			farbe1.setBackground(Color.white);
		} else if (auswahl1 == "blau") {
			farbe1.setBackground(Color.blue);
		}
		if (auswahl2 == "rot") {
			farbe2.setBackground(Color.red);
		} else if (auswahl2 == "gelb") {
			farbe2.setBackground(Color.yellow);
		} else if (auswahl2 == "gr¸n") {
			farbe2.setBackground(Color.green);
		} else if (auswahl2 == "schwarz") {
			farbe2.setBackground(Color.black);
		} else if (auswahl2 == "weiﬂ") {
			farbe2.setBackground(Color.white);
		} else if (auswahl2 == "blau") {
			farbe2.setBackground(Color.blue);
		}
		if (auswahl3 == "rot") {
			farbe3.setBackground(Color.red);
		} else if (auswahl3 == "gelb") {
			farbe3.setBackground(Color.yellow);
		} else if (auswahl3 == "gr¸n") {
			farbe3.setBackground(Color.green);
		} else if (auswahl3 == "schwarz") {
			farbe3.setBackground(Color.black);
		} else if (auswahl3 == "weiﬂ") {
			farbe3.setBackground(Color.white);
		} else if (auswahl3 == "blau") {
			farbe3.setBackground(Color.blue);
		}
		if (auswahl4 == "rot") {
			farbe4.setBackground(Color.red);
		} else if (auswahl4 == "gelb") {
			farbe4.setBackground(Color.yellow);
		} else if (auswahl4 == "gr¸n") {
			farbe4.setBackground(Color.green);
		} else if (auswahl4 == "schwarz") {
			farbe4.setBackground(Color.black);
		} else if (auswahl4 == "weiﬂ") {
			farbe4.setBackground(Color.white);
		} else if (auswahl4 == "blau") {
			farbe4.setBackground(Color.blue);
		}

	}
}
