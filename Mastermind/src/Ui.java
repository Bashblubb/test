import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Ui extends Spiel implements ActionListener {

	String auswahl1;
	String auswahl2;
	String auswahl3;
	String auswahl4;
	String zugFarbe1;
	String zugFarbe2;
	String zugFarbe3;
	String zugFarbe4;
	int spielRunde = 1;	
	boolean showWert = false;
	static public boolean einspieler;
	int highscore = 0;
	boolean gewonnen = false;
	static JFrame frame = new JFrame("Auswahlfeld");
	static JFrame frame2 = new JFrame("Spielmenü");
	static JPanel panel2 = new JPanel();
	static JPanel panel = new JPanel();
	static JButton auswählen = new JButton("Auswählen");
	static JButton retry = new JButton("New Game");
	static JButton spiel = new JButton("Versuchen");
	RadioButtonActionListener actionlistener = new RadioButtonActionListener();
	// Spielfeld Buttons
	static JRadioButton runde1bt1  = new JRadioButton();
	static JRadioButton runde1bt2 = new JRadioButton();
	static JRadioButton runde1bt3 = new JRadioButton();
	static JRadioButton runde1bt4 = new JRadioButton();
	static JRadioButton runde2bt1  = new JRadioButton();
	static JRadioButton runde2bt2 = new JRadioButton();
	static JRadioButton runde2bt3 = new JRadioButton();
	static JRadioButton runde2bt4 = new JRadioButton();	
	static JRadioButton runde3bt1 = new JRadioButton();
	static JRadioButton runde3bt2 = new JRadioButton();
	static JRadioButton runde3bt3 = new JRadioButton();
	static JRadioButton runde3bt4 = new JRadioButton();	
	static JRadioButton runde4bt1 = new JRadioButton();
	static JRadioButton runde4bt2 = new JRadioButton();
	static JRadioButton runde4bt3 = new JRadioButton();
	static JRadioButton runde4bt4 = new JRadioButton();	
	static JRadioButton runde5bt1 = new JRadioButton();
	static JRadioButton runde5bt2 = new JRadioButton();
	static JRadioButton runde5bt3 = new JRadioButton();
	static JRadioButton runde5bt4 = new JRadioButton();	
	static JRadioButton runde6bt1 = new JRadioButton();
	static JRadioButton runde6bt2 = new JRadioButton();
	static JRadioButton runde6bt3 = new JRadioButton();
	static JRadioButton runde6bt4 = new JRadioButton();	
	static JRadioButton runde7bt1 = new JRadioButton();
	static JRadioButton runde7bt2 = new JRadioButton();	
	static JRadioButton runde7bt3 = new JRadioButton();	
	static JRadioButton runde7bt4 = new JRadioButton();		
	static JRadioButton runde8bt1 = new JRadioButton();
	static JRadioButton runde8bt2 = new JRadioButton();
	static JRadioButton runde8bt3 = new JRadioButton();
	static JRadioButton runde8bt4 = new JRadioButton();
	// Buttons zur Auswahl der Farbe
	JRadioButton red5 = new JRadioButton();
	JRadioButton green5 = new JRadioButton();
	JRadioButton blue5 = new JRadioButton();
	JRadioButton yell5 = new JRadioButton();
	JRadioButton black5 = new JRadioButton();
	JRadioButton white5 = new JRadioButton();
	// Auswahl der zu suchenden Farbkombination
	static JRadioButton farbe1 = new JRadioButton();
	static JRadioButton farbe2 = new JRadioButton();
	static JRadioButton farbe3 = new JRadioButton();
	static JRadioButton farbe4 = new JRadioButton();
	// zeigen Ergebnisse (Schwarz/weiß) nach Tipp an
	static JRadioButton zug11 = new JRadioButton();
	static JRadioButton zug12 = new JRadioButton();
	static JRadioButton zug13 = new JRadioButton();
	static JRadioButton zug14 = new JRadioButton();
	static JRadioButton zug21 = new JRadioButton();
	static JRadioButton zug22 = new JRadioButton();
	static JRadioButton zug23 = new JRadioButton();
	static JRadioButton zug24 = new JRadioButton();
	static JRadioButton zug31 = new JRadioButton();
	static JRadioButton zug32 = new JRadioButton();
	static JRadioButton zug33 = new JRadioButton();
	static JRadioButton zug34 = new JRadioButton();
	static JRadioButton zug41 = new JRadioButton();
	static JRadioButton zug42 = new JRadioButton();
	static JRadioButton zug43 = new JRadioButton();
	static JRadioButton zug44 = new JRadioButton();
	static JRadioButton zug51 = new JRadioButton();
	static JRadioButton zug52 = new JRadioButton();
	static JRadioButton zug53 = new JRadioButton();
	static JRadioButton zug54 = new JRadioButton();
	static JRadioButton zug61 = new JRadioButton();
	static JRadioButton zug62 = new JRadioButton();
	static JRadioButton zug63 = new JRadioButton();
	static JRadioButton zug64 = new JRadioButton();
	static JRadioButton zug71 = new JRadioButton();
	static JRadioButton zug72 = new JRadioButton();
	static JRadioButton zug73 = new JRadioButton();
	static JRadioButton zug74 = new JRadioButton();
	static JRadioButton zug01 = new JRadioButton();
	static JRadioButton zug02 = new JRadioButton();
	static JRadioButton zug03 = new JRadioButton();
	static JRadioButton zug04 = new JRadioButton();
	// Gruppierungen/Labels zur Beschriftung
	ButtonGroup gruppe5 = new ButtonGroup();
	JLabel spielfeld = new JLabel("Spielfeld: ");
	JLabel ergebnisse = new JLabel("Ergebnisse: ");
	JLabel farbwahl = new JLabel("Farbwahl: ");
	JLabel farbkombi = new JLabel("Farbkombination: ");
	JLabel punktzahl = new JLabel("Score: ");
	JLabel score = new JLabel(String.valueOf(highscore));
	//Elemente des Menüs
	JButton show = new JButton("show!");
	JButton einSpieler = new JButton("1-Spieler");
	JButton zweiSpieler = new JButton("2-Spieler");
	JButton exit = new JButton("Spiel verlassen");
	
	
	void menue(){
		frame2.setSize(200, 200);
		frame2.setVisible(true);
		frame2.setLayout(null);		
		einSpieler.setBounds(30,25, 125,25);
		zweiSpieler.setBounds(30, 75, 125,25);
		exit.setBounds(30, 125, 125,25);
		frame2.add(panel2);
		frame2.add(einSpieler);
		frame2.add(zweiSpieler);
		frame2.add(exit);
		einSpieler.addActionListener(this);
		zweiSpieler.addActionListener(this);
		exit.addActionListener(this);
		
	}
	

	void ui() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);

		auswählen.setBounds(350, 400, 100, 50);
		retry.setBounds(350, 350, 100, 50);
		spiel.setBounds(250, 350, 100, 100);	
		show.setBounds(380,250,75,25);
		score.setBounds(380,25,100,25);
		punktzahl.setBounds(380, 00, 100, 25);
		runde1bt1.setBounds(25, 405, 20, 25);
		runde1bt2.setBounds(50, 405, 20, 25);
		runde1bt3.setBounds(75, 405, 20, 25);
		runde1bt4.setBounds(100, 405, 20, 25);
		runde2bt1.setBounds(25, 355, 20, 25);
		runde2bt2.setBounds(50, 355, 20, 25);
		runde2bt3.setBounds(75, 355, 20, 25);
		runde2bt4.setBounds(100, 355, 20, 25);
		runde8bt1.setBounds(25, 35, 20, 25);
		runde7bt1.setBounds(25, 95, 20, 25);
		runde6bt1.setBounds(25, 150, 20, 25);
		runde5bt1.setBounds(25, 205, 20, 25);
		runde4bt1.setBounds(25, 255, 20, 25);
		runde3bt1.setBounds(25, 315, 20, 25);
		runde8bt2.setBounds(50, 35, 20, 25);
		runde7bt2.setBounds(50, 95, 20, 25);
		runde6bt2.setBounds(50, 150, 20, 25);
		runde5bt2.setBounds(50, 205, 20, 25);
		runde4bt2.setBounds(50, 255, 20, 25);
		runde3bt2.setBounds(50, 315, 20, 25);
		runde8bt3.setBounds(75, 35, 20, 25);
		runde7bt3.setBounds(75, 95, 20, 25);
		runde6bt3.setBounds(75, 150, 20, 25);
		runde5bt3.setBounds(75, 205, 20, 25);
		runde4bt3.setBounds(75, 255, 20, 25);
		runde3bt3.setBounds(75, 315, 20, 25);
		runde8bt4.setBounds(100, 35, 20, 25);
		runde7bt4.setBounds(100, 95, 20, 25);
		runde6bt4.setBounds(100, 150, 20, 25);
		runde5bt4.setBounds(100, 205, 20, 25);
		runde4bt4.setBounds(100, 255, 20, 25);
		runde3bt4.setBounds(100, 315, 20, 25);
		red5.setBounds(275, 75, 20, 25);
		blue5.setBounds(300, 75, 20, 25);
		yell5.setBounds(325, 75, 20, 25);
		white5.setBounds(275, 100, 20, 25);
		black5.setBounds(300, 100, 20, 25);
		green5.setBounds(325, 100, 20, 25);	
		
		spielfeld.setBounds(25, 00, 100, 25);		
		spielfeld.setBounds(25, 00, 100, 25);
		ergebnisse.setBounds(150, 00, 100, 25);
		farbwahl.setBounds(275, 30, 100, 25);
		farbkombi.setBounds(275, 200, 125, 25);
		farbe1.setBounds(275, 250, 20, 25);
		farbe2.setBounds(300, 250, 20, 25);
		farbe3.setBounds(325, 250, 20, 25);
		farbe4.setBounds(350, 250, 20, 25);		
		zug01.setBounds(150, 25, 20, 25);
		zug02.setBounds(175,25, 20, 25);
		zug03.setBounds(150, 50, 20, 25);
		zug04.setBounds(175, 50, 20, 25);
		zug11.setBounds(150, 80, 20, 25);
		zug12.setBounds(175, 80, 20, 25);
		zug13.setBounds(150, 105, 20, 25);
		zug14.setBounds(175, 105, 20, 25);
		zug21.setBounds(150, 135, 20, 25);
		zug22.setBounds(175, 135, 20, 25);
		zug23.setBounds(150, 160, 20, 25);
		zug24.setBounds(175, 160, 20, 25);
		zug31.setBounds(150, 190, 20, 25);
		zug32.setBounds(175, 190, 20, 25);
		zug33.setBounds(150, 215, 20, 25);
		zug34.setBounds(175, 215, 20, 25);
		zug41.setBounds(150, 245, 20, 25);
		zug42.setBounds(175, 245, 20, 25);
		zug43.setBounds(150, 270, 20, 25);
		zug44.setBounds(175, 270, 20, 25);
		zug51.setBounds(150, 300, 20, 25);
		zug52.setBounds(175, 300, 20, 25);
		zug53.setBounds(150, 325, 20, 25);
		zug54.setBounds(175, 325, 20, 25);
		zug61.setBounds(150, 350, 20, 25);
		zug62.setBounds(175, 350, 20, 25);
		zug63.setBounds(150, 375, 20, 25);
		zug64.setBounds(175, 375, 20, 25);
		zug71.setBounds(150, 400, 20, 25);
		zug72.setBounds(175, 400, 20, 25);
		zug73.setBounds(150, 425, 20, 25);
		zug74.setBounds(175, 425, 20, 25);		
		buttonsDisable(runde8bt1, runde7bt1, runde4bt1, runde3bt1);
		buttonsDisable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);	
		buttonsDisable(runde8bt2, runde7bt2, runde4bt2, runde3bt2);
		buttonsDisable(runde8bt3, runde7bt3, runde4bt3, runde3bt3);
		buttonsDisable(runde8bt4, runde7bt4, runde4bt4, runde3bt4);			
		buttonsDisable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
		buttonsDisable(runde5bt1, runde6bt1, runde5bt2, runde6bt2);
		buttonsDisable(runde5bt4, runde6bt4, runde5bt3, runde6bt3);
		buttonsDisable(zug01, zug02, zug03, zug04);
		buttonsDisable(zug11, zug12, zug13, zug14);
		buttonsDisable(zug21, zug22, zug23, zug24);
		buttonsDisable(zug31, zug32, zug33, zug34);
		buttonsDisable(zug41, zug42, zug43, zug44);
		buttonsDisable(zug51, zug52, zug53, zug54);
		buttonsDisable(zug61, zug62, zug63, zug64);
		buttonsDisable(zug71, zug72, zug73, zug74);	
		spiel.setEnabled(false);	

		red5.setBackground(Color.red);
		blue5.setBackground(Color.blue);
		black5.setBackground(Color.black);
		yell5.setBackground(Color.yellow);
		green5.setBackground(Color.GREEN);
		white5.setBackground(Color.white);

		frame.add(panel);
		frame.add(spielfeld);
		frame.add(spiel);
		frame.add(retry);
		frame.add(ergebnisse);
		frame.add(punktzahl);
		frame.add(score);
		frame.add(auswählen);
		frame.add(runde4bt1);
		frame.add(runde7bt1);
		frame.add(runde6bt1);
		frame.add(runde5bt1);
		frame.add(runde8bt1);
		frame.add(runde3bt1);
		frame.add(runde4bt2);
		frame.add(runde7bt2);
		frame.add(runde6bt2);
		frame.add(runde5bt2);
		frame.add(runde8bt2);
		frame.add(runde3bt2);
		frame.add(runde4bt3);
		frame.add(runde7bt3);
		frame.add(runde6bt3);
		frame.add(runde5bt3);
		frame.add(runde8bt3);
		frame.add(runde3bt3);
		frame.add(runde4bt4);
		frame.add(runde7bt4);
		frame.add(runde6bt4);
		frame.add(runde5bt4);
		frame.add(runde8bt4);
		frame.add(runde3bt4);
		frame.add(black5);
		frame.add(blue5);
		frame.add(yell5);
		frame.add(white5);
		frame.add(red5);
		frame.add(green5);
		frame.add(farbe1);
		frame.add(farbe2);
		frame.add(farbe3);
		frame.add(farbe4);
		frame.add(farbwahl);
		frame.add(farbkombi);
		frame.add(zug11);
		frame.add(zug12);
		frame.add(zug13);
		frame.add(zug14);
		frame.add(zug21);
		frame.add(zug22);
		frame.add(zug23);
		frame.add(zug24);
		frame.add(zug31);
		frame.add(zug32);
		frame.add(zug33);
		frame.add(zug34);
		frame.add(zug41);
		frame.add(zug42);
		frame.add(zug43);
		frame.add(zug44);
		frame.add(zug51);
		frame.add(zug52);
		frame.add(zug53);
		frame.add(zug54);
		frame.add(zug61);
		frame.add(zug62);
		frame.add(zug63);
		frame.add(zug64);
		frame.add(zug71);
		frame.add(zug72);
		frame.add(zug73);
		frame.add(zug74);
		frame.add(zug01);
		frame.add(zug02);
		frame.add(zug03);
		frame.add(zug04);
		frame.add(runde1bt1);
		frame.add(runde1bt2);
		frame.add(runde1bt3);
		frame.add(runde1bt4);
		frame.add(runde2bt1);
		frame.add(runde2bt2);
		frame.add(runde2bt3);
		frame.add(runde2bt4);	
		frame.add(show);

		gruppe5.add(red5);
		gruppe5.add(blue5);
		gruppe5.add(yell5);
		gruppe5.add(green5);
		gruppe5.add(black5);
		gruppe5.add(white5);

		auswählen.addActionListener(this);
		spiel.addActionListener(this);
		retry.addActionListener(this);
		show.addActionListener(this);
		farbe1.addActionListener(actionlistener);
		farbe2.addActionListener(actionlistener);
		farbe3.addActionListener(actionlistener);
		farbe4.addActionListener(actionlistener);
		runde3bt1.addActionListener(actionlistener);
		runde3bt2.addActionListener(actionlistener);
		runde3bt3.addActionListener(actionlistener);
		runde3bt4.addActionListener(actionlistener);
		runde4bt1.addActionListener(actionlistener);
		runde4bt2.addActionListener(actionlistener);
		runde4bt3.addActionListener(actionlistener);
		runde4bt4.addActionListener(actionlistener);
		runde5bt1.addActionListener(actionlistener);
		runde5bt2.addActionListener(actionlistener);
		runde5bt3.addActionListener(actionlistener);
		runde5bt4.addActionListener(actionlistener);
		runde6bt1.addActionListener(actionlistener);
		runde6bt2.addActionListener(actionlistener);
		runde6bt3.addActionListener(actionlistener);
		runde6bt4.addActionListener(actionlistener);
		runde8bt1.addActionListener(actionlistener);
		runde8bt2.addActionListener(actionlistener);
		runde8bt3.addActionListener(actionlistener);
		runde8bt4.addActionListener(actionlistener);
		runde7bt1.addActionListener(actionlistener);
		runde7bt2.addActionListener(actionlistener);
		runde7bt3.addActionListener(actionlistener);
		runde7bt4.addActionListener(actionlistener);
		runde1bt1.addActionListener(actionlistener);
		runde1bt2.addActionListener(actionlistener);
		runde1bt3.addActionListener(actionlistener);
		runde1bt4.addActionListener(actionlistener);
		runde2bt1.addActionListener(actionlistener);
		runde2bt2.addActionListener(actionlistener);
		runde2bt3.addActionListener(actionlistener);
		runde2bt4.addActionListener(actionlistener);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();	
		
		if(source == show){
			buttonsVisible(farbe1,farbe2,farbe3, farbe4);
			showWert = true;
		}
		
		if (source == einSpieler) {
			JOptionPane.showMessageDialog(null,	"Der Computer bestimmt die Farbkombination. Der Spieler versucht die Farbkombination zu erraten.","1-Spieler Modus", 0);
			Mastermind spielereins = new Mastermind();			
			auswahl1 = setComputerColors1();	
			auswahl2 = setComputerColors2();
			auswahl3 = setComputerColors3();
			auswahl4 = setComputerColors4();
			buttonsDisable(farbe1, farbe2, farbe3, farbe4);
			buttonsNotVisible(farbe1, farbe2, farbe3, farbe4);
			buttonsEnable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);			
			buttonsDisable(auswählen);
			radiobuttonComputerColor(farbe1, farbe2, farbe3, farbe4, auswahl1, auswahl2, auswahl3, auswahl4);
			einspieler = true;				
			spielereins.ui();
			spielRunde = 1;
			frame2.dispose();			
		}
		
		if(source == zweiSpieler){
			JOptionPane.showMessageDialog(null, "Spieler 1 muss eine Farbkombination auswählen. Spieler 2 versucht die Farbkombination zu erraten.","2-Spieler Modus",0);
			Mastermind zweispieler = new Mastermind();
			zweispieler.ui();
					
			frame2.dispose();
			
		}
		if(source == exit){
			frame2.dispose();
		}
		
		
		if (source == retry) {		
							
			buttonsDisable(runde8bt1, runde7bt1, runde4bt1, runde3bt1);
			buttonsDisable(runde8bt2, runde7bt2, runde4bt2, runde3bt2);
			buttonsDisable(runde8bt3, runde7bt3, runde4bt3, runde3bt3);
			buttonsDisable(runde8bt4, runde7bt4, runde4bt4, runde3bt4);			
			buttonsEnable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);	
			buttonsDisable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
			buttonsDisable(runde5bt1, runde6bt1, runde5bt2, runde6bt2);
			buttonsDisable(runde5bt4, runde6bt4, runde5bt3, runde6bt3);						
			resetColor(runde8bt1, runde7bt1, runde4bt1, runde3bt1);
			resetColor(runde8bt2, runde7bt2, runde4bt2, runde3bt2);
			resetColor(runde8bt3, runde7bt3, runde4bt3, runde3bt3);
			resetColor(runde8bt4, runde7bt4, runde4bt4, runde3bt4);			
			resetColor(runde1bt1, runde1bt2, runde1bt3, runde1bt4);	
			resetColor(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
			resetColor(runde5bt1, runde6bt1, runde5bt2, runde6bt2);
			resetColor(runde5bt3, runde6bt3, runde5bt4, runde6bt4);	
			resetColor(farbe1, farbe2,farbe3, farbe4);
			resetColor(zug01, zug02, zug03, zug04);
			resetColor(zug11, zug12, zug13, zug14);
			resetColor(zug21, zug22, zug23, zug24);
			resetColor(zug31, zug32, zug33, zug34);
			resetColor(zug41, zug42, zug43, zug44);
			resetColor(zug51, zug52, zug53, zug54);
			resetColor(zug61, zug62, zug63, zug64);
			resetColor(zug71, zug72, zug73, zug74);
			buttonsEnable(spiel);
			spielRunde = 1;	
			auswahl1 = setComputerColors1();	
			auswahl2 = setComputerColors2();
			auswahl3 = setComputerColors3();
			auswahl4 = setComputerColors4();
			radiobuttonComputerColor(farbe1, farbe2, farbe3, farbe4, auswahl1, auswahl2, auswahl3, auswahl4);
			buttonsNotVisible(farbe1, farbe2, farbe3, farbe4);
			if(einspieler == false){	
			buttonsEnable(farbe1, farbe2, farbe3, farbe4);
			buttonsVisible(farbe1, farbe2,farbe3, farbe4);
			buttonsEnable(auswählen);
			buttonsDisable(spiel);	
			resetColor(farbe1, farbe2,farbe3, farbe4);
			}
		}
		
			
		if (source == auswählen) {

			auswahl1 = String.valueOf(getAuswahl(farbe1));
			auswahl2 = String.valueOf(getAuswahl(farbe2));
			auswahl3 = String.valueOf(getAuswahl(farbe3));
			auswahl4 = String.valueOf(getAuswahl(farbe4));
			if (auswahl1 == "nichts" || auswahl2 == "nichts" || auswahl3 == "nichts" || auswahl4 == "nichts" ) {
					JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewhält", "Fehler", 0);
			} else {

				auswählen.setEnabled(false);
				spiel.setEnabled(true);				
				buttonsEnable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);
				buttonsDisable(farbe1, farbe2, farbe3, farbe4);
				buttonsNotVisible(farbe1, farbe2,farbe3, farbe4);
			}

		}

		if (source == spiel) {

			zugFarbe1 = String.valueOf(getAuswahl(runde1bt1));
			zugFarbe2 = String.valueOf(getAuswahl(runde1bt2));
			zugFarbe3 = String.valueOf(getAuswahl(runde1bt3));
			zugFarbe4 = String.valueOf(getAuswahl(runde1bt4));
			anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
			
				
				if (spielRunde == 1) {	
					zugFarbe1 = String.valueOf(getAuswahl(runde1bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde1bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde1bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde1bt4));
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);					
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug71, zug72,zug73, zug74);						
					buttonsDisable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);					
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
						buttonsDisable(spiel);
					}else{
						buttonsEnable(runde2bt1,runde2bt2, runde2bt3, runde2bt4);
					}
					
				}
				else if (spielRunde == 2) {			
					zugFarbe1 = String.valueOf(getAuswahl(runde2bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde2bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde2bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde2bt4));
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);					
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug61, zug62,zug63, zug64);						
					buttonsDisable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde3bt1,runde3bt2, runde3bt3, runde3bt4);
					}
				}
				
				
				else if (spielRunde == 3) {	
					zugFarbe1 = String.valueOf(getAuswahl(runde3bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde3bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde3bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde3bt4));
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);					
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug51, zug52,zug53, zug54);						
					buttonsDisable(runde3bt1, runde3bt2, runde3bt3, runde3bt4);					
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde4bt1, runde4bt2, runde4bt3, runde4bt4);
					}
				}
				
				else if (spielRunde == 4) {				
					zugFarbe1 = String.valueOf(getAuswahl(runde4bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde4bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde4bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde4bt4));					
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug41, zug42, zug43, zug44);			
					buttonsDisable(runde4bt1, runde4bt2, runde4bt3, runde4bt4);				
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde5bt1, runde5bt2, runde5bt3, runde5bt4);
					}
				}		
				
				else if (spielRunde == 5) {
					zugFarbe1 = String.valueOf(getAuswahl(runde5bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde5bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde5bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde5bt4));					
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug31, zug32, zug33, zug34);			
					buttonsDisable(runde5bt1, runde5bt2, runde5bt3, runde5bt4);								
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde6bt1, runde6bt2, runde6bt3, runde6bt4);
					}
				}		
				
				else if (spielRunde == 6) {
					zugFarbe1 = String.valueOf(getAuswahl(runde6bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde6bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde6bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde6bt4));					
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug21, zug22, zug23, zug24);			
					buttonsDisable(runde6bt1, runde6bt2, runde6bt3, runde6bt4);				
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde7bt1, runde7bt2, runde7bt3, runde7bt4);
					}
				}		
				else if (spielRunde == 7) {
					zugFarbe1 = String.valueOf(getAuswahl(runde7bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde7bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde7bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde7bt4));					
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug11, zug12, zug13, zug14);			
					buttonsDisable(runde7bt1, runde7bt2, runde7bt3, runde7bt4);					
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde8bt1, runde8bt2, runde8bt3, runde8bt4);
					}
				}		
				else if (spielRunde == 8) {
					zugFarbe1 = String.valueOf(getAuswahl(runde8bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde8bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde8bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde8bt4));					
					String ergebnis1 = runde1(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug01, zug02, zug03, zug04);			
					buttonsDisable(runde8bt1, runde8bt2, runde8bt3, runde8bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert = false){
							JOptionPane.showMessageDialog(null, "Sie haben gewonnen!", "Spielende", 0);
							highscore +=50;
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						JOptionPane.showMessageDialog(null, "Game Over! Keine Züge mehr!", "Spielende", 0);
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
						
					}
				}		

			}

		}	
	

	private class RadioButtonActionListener implements ActionListener {

		public void buttonColor(JRadioButton redButton,
				JRadioButton blueButton, JRadioButton blackButton,
				JRadioButton greenButton, JRadioButton whiteButton,
				JRadioButton yellButton, JRadioButton farbButton) {

			if (redButton.isSelected()) {
				farbButton.setBackground(Color.red);
			} else if (blueButton.isSelected()) {
				farbButton.setBackground(Color.blue);
			} else if (blackButton.isSelected()) {
				farbButton.setBackground(Color.black);
			} else if (greenButton.isSelected()) {
				farbButton.setBackground(Color.green);
			} else if (whiteButton.isSelected()) {
				farbButton.setBackground(Color.white);
			} else if (yellButton.isSelected()) {
				farbButton.setBackground(Color.yellow);
			} else {
				JOptionPane.showMessageDialog(null,
						"Bitte wählen Sie zuerst eine Farbe aus!", "Fehler", 0);

			}
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JRadioButton button = (JRadioButton) arg0.getSource();
			if (button == farbe1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, farbe1);
			}

			if (button == farbe2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, farbe2);
			}
			if (button == farbe3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, farbe3);
			}
			if (button == farbe4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, farbe4);
			}

			if (button == runde3bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde3bt1);

			}
			if (button == runde3bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde3bt2);

			}
			if (button == runde3bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde3bt3);

			}
			if (button == runde3bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde3bt4);

			}
			if (button == runde4bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde4bt1);

			}
			if (button == runde4bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde4bt2);

			}
			if (button == runde4bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde4bt3);

			}
			if (button == runde4bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde4bt4);

			}
			if (button == runde5bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde5bt1);

			}
			if (button == runde5bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde5bt2);

			}
			if (button == runde5bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde5bt3);

			}
			if (button == runde5bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde5bt4);

			}
			if (button == runde7bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde7bt1);

			}
			if (button == runde7bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde7bt2);

			}
			if (button == runde7bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde7bt3);

			}
			if (button == runde7bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde7bt4);

			}
			if (button == runde8bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde8bt1);

			}
			if (button == runde8bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde8bt2);

			}
			if (button == runde8bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde8bt3);

			}
			if (button == runde8bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde8bt4);

			}
			if (button == runde6bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde6bt1);

			}
			if (button == runde6bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde6bt2);

			}
			if (button == runde6bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde6bt3);

			}
			if (button == runde6bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde6bt4);
				
			}
			if (button == runde1bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde1bt1);

			}
			if (button == runde1bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5,runde1bt2);

			}
			if (button == runde1bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde1bt3);

			}
			if (button == runde1bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde1bt4);

		}
			if (button == runde2bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde2bt1);

			}
			if (button == runde2bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5,runde2bt2);

			}
			if (button == runde2bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde2bt3);

			}
			if (button == runde2bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde2bt4);

		}
		}
			

	}

}
