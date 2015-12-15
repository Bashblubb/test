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
	
	public static void buttonsDisable(JButton button1, JButton button2) {

		button1.setEnabled(false);
		button2.setEnabled(false);
	
	}
	
	public static void anzahlFarbenComputer(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4){			
		anzahlRotCom = 0;
		anzahlGelbCom = 0;
		anzahlGr¸nCom = 0;
		anzahlWeiﬂCom = 0;
		anzahlSchwarzCom = 0;
		anzahlBlauCom = 0;
		
		String[] farbarray = {auswahl1, auswahl2, auswahl3, auswahl4};

		for (String eintrag : farbarray){

			switch (eintrag) {
			case "rot":
				anzahlRotCom++;
				break;
			case "gelb":
				anzahlGelbCom++;
				break;
			case "gr¸n":
				anzahlGr¸nCom++;
				break;
			case "schwarz":
				anzahlSchwarzCom++;
				break;
			case "weiﬂ":
				anzahlWeiﬂCom++;
				break;
			case "blau":
				anzahlBlauCom++;
				break;
			}
		}
	}
		
	public static void reduziereFarbe(String zugFarbe){
		switch (zugFarbe) {
		case "rot":
			anzahlRotCom--;
			break;
		case "gelb":
			anzahlGelbCom--;
			break;
		case "gr¸n":
			anzahlGr¸nCom--;
			break;
		case "schwarz":
			anzahlSchwarzCom--;
			break;
		case "weiﬂ":
			anzahlWeiﬂCom--;
			break;
		case "blau":
			anzahlBlauCom--;
			break;
		}
	}
	
	// spielalgorithmus
	public static String runde1Schwarz(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {
						
		if (zugFarbe == auswahl1) {
			reduziereFarbe(zugFarbe);
			return "schwarz";			
		} else {
			return "nichts";			
		}				
	}
	
	public static String runde2Schwarz(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {

		if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe) == true) {
			if (zugFarbe == auswahl2) {
				reduziereFarbe(zugFarbe);
				return "schwarz";
			} else {
				return "nichts";
			}
		} else
			return "nichts";
	}

	public static String runde3Schwarz(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {
		if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe) == true) {

			if (zugFarbe == auswahl3) {
				reduziereFarbe(zugFarbe);
				return "schwarz";
			} else {
				return "nichts";
			}
		} else {
			return "nichts";
		}
	}
	
	public static String runde4Schwarz(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe) {
		if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe) == true) {
		if (zugFarbe == auswahl4) {
			reduziereFarbe(zugFarbe);
			return "schwarz";
		} else {
			return "nichts";
		}
		}else {
			return "nichts";
		}
	}
	

	public static String runde1Weiﬂ(String ergebnis1,String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe1){

		if (ergebnis1 == "nichts") {
			if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1) == true) {
				reduziereFarbe(zugFarbe1);
				return "weiﬂ";
			} else {
				return "nichts";
			}
		}else{
			return "schwarz";
		}
	}
	
	
	public static String runde2Weiﬂ(String ergebnis2,String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe2){

		if (ergebnis2 == "nichts") {
			if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2) == true) {
				reduziereFarbe(zugFarbe2);
				return "weiﬂ";
			} else {
				return "nichts";
			}
		}else{
			return "schwarz";
		}
	}
	

	public static String runde3Weiﬂ(String ergebnis3,String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe3){

		if (ergebnis3 == "nichts") {
			if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3) == true) {
				reduziereFarbe(zugFarbe3);
				return "weiﬂ";
				
			} else {
				return "nichts";
			}
		}else{
			return "schwarz";
		}
	}
	

	public static String runde4Weiﬂ(String ergebnis4,String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe4){

		if (ergebnis4 == "nichts") {
			if (calcErgebnisFarbe(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4) == true) {
				reduziereFarbe(zugFarbe4);
				return "weiﬂ";
			} else {
				return "nichts";
			}
		}else{
			return "schwarz";
		}
	}
	
	public static boolean calcErgebnisFarbe(String auswahl1, String auswahl2,
			String auswahl3, String auswahl4, String zugFarbe){
		
		if (zugFarbe == "rot" && anzahlRotCom > 0) {
			return true;
		} else if (zugFarbe == "blau" && anzahlBlauCom > 0) {
			return true;
		} else if (zugFarbe == "gelb" && anzahlGelbCom > 0) {
			return true;
		} else if (zugFarbe == "gr¸n" && anzahlGr¸nCom > 0) {
			return true;
		} else if (zugFarbe == "schwarz" && anzahlSchwarzCom > 0) {
			return true;
		} else if (zugFarbe == "weiﬂ" && anzahlWeiﬂCom > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void validateErgebnis(String ergebnis1, String ergebnis2,
			String ergebnis3, String ergebnis4){
		
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
		
		if (schwarze == 1 && weiﬂe == 0) {
			button1.setBackground(Color.black);
		} else if (schwarze == 1 && weiﬂe == 1) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);
		} else if (schwarze == 1 && weiﬂe == 2) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
		} else if (schwarze == 1 && weiﬂe == 3) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		} else if (schwarze == 2 && weiﬂe == 0) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
		} else if (schwarze == 2 && weiﬂe == 1) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.white);
		} else if (schwarze == 2 && weiﬂe == 2) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		} else if (schwarze == 3 && weiﬂe == 0) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);
		} else if (schwarze == 3 && weiﬂe == 1) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);
			button4.setBackground(Color.white);
		} else if (schwarze == 4) {
			button1.setBackground(Color.black);
			button2.setBackground(Color.black);
			button3.setBackground(Color.black);
			button4.setBackground(Color.black);
		} else if (schwarze == 0 && weiﬂe == 1) {
			button1.setBackground(Color.white);
		} else if (schwarze == 0 && weiﬂe == 2) {
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
		} else if (schwarze == 0 && weiﬂe == 3) {
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
		} else if (schwarze == 0 && weiﬂe == 4) {
			button1.setBackground(Color.white);
			button2.setBackground(Color.white);
			button3.setBackground(Color.white);
			button4.setBackground(Color.white);
		} else if (schwarze == 1 && weiﬂe == 0) {
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
	
	public static boolean etwasAusgewaehlt(JRadioButton rundexbt1, JRadioButton rundexbt2, JRadioButton rundexbt3, JRadioButton rundexbt4){
		
		
		
		return true;
	}

public static void radiobuttonComputerColor(JRadioButton farbe1, JRadioButton farbe2, JRadioButton farbe3, JRadioButton farbe4, String auswahl1, String auswahl2, String auswahl3, String auswahl4){

		switch (auswahl1) {
		case "rot":
			farbe1.setBackground(Color.red);
			break;
		case "gelb":
			farbe1.setBackground(Color.yellow);
			break;
		case "gr¸n":
			farbe1.setBackground(Color.green);
			break;
		case "schwarz":
			farbe1.setBackground(Color.black);
			break;
		case "weiﬂ":
			farbe1.setBackground(Color.white);
			break;
		case "blau":
			farbe1.setBackground(Color.blue);
			break;
		}

		switch (auswahl2) {
		case "rot":
			farbe2.setBackground(Color.red);
			break;
		case "gelb":
			farbe2.setBackground(Color.yellow);
			break;
		case "gr¸n":
			farbe2.setBackground(Color.green);
			break;
		case "schwarz":
			farbe2.setBackground(Color.black);
			break;
		case "weiﬂ":
			farbe2.setBackground(Color.white);
			break;
		case "blau":
			farbe2.setBackground(Color.blue);
			break;
		}

		switch (auswahl3) {
		case "rot":
			farbe3.setBackground(Color.red);
			break;
		case "gelb":
			farbe3.setBackground(Color.yellow);
			break;
		case "gr¸n":
			farbe3.setBackground(Color.green);
			break;
		case "schwarz":
			farbe3.setBackground(Color.black);
			break;
		case "weiﬂ":
			farbe3.setBackground(Color.white);
			break;
		case "blau":
			farbe3.setBackground(Color.blue);
			break;
		}

		switch (auswahl4) {
		case "rot":
			farbe4.setBackground(Color.red);
			break;
		case "gelb":
			farbe4.setBackground(Color.yellow);
			break;
		case "gr¸n":
			farbe4.setBackground(Color.green);
			break;
		case "schwarz":
			farbe4.setBackground(Color.black);
			break;
		case "weiﬂ":
			farbe4.setBackground(Color.white);
			break;
		case "blau":
			farbe4.setBackground(Color.blue);
			break;
		}
		

	}
}
