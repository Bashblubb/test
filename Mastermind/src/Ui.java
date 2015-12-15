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
	static int highscore = 0;
	boolean gewonnen = false;
	static JFrame frame = new JFrame("Spielfeld");
	static JFrame frame2 = new JFrame("Spielmen¸");
	static JPanel panel2 = new JPanel();
	static JPanel panel = new JPanel();
	static JButton ausw‰hlen = new JButton("Ausw‰hlen");
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
	static JRadioButton runde9bt1 = new JRadioButton();
	static JRadioButton runde9bt2 = new JRadioButton();
	static JRadioButton runde9bt3 = new JRadioButton();
	static JRadioButton runde9bt4 = new JRadioButton();
	static JRadioButton runde10bt1 = new JRadioButton();
	static JRadioButton runde10bt2 = new JRadioButton();
	static JRadioButton runde10bt3 = new JRadioButton();
	static JRadioButton runde10bt4 = new JRadioButton();
	static JRadioButton runde11bt1 = new JRadioButton();
	static JRadioButton runde11bt2 = new JRadioButton();
	static JRadioButton runde11bt3 = new JRadioButton();
	static JRadioButton runde11bt4 = new JRadioButton();
	static JRadioButton runde12bt1 = new JRadioButton();
	static JRadioButton runde12bt2 = new JRadioButton();
	static JRadioButton runde12bt3 = new JRadioButton();
	static JRadioButton runde12bt4 = new JRadioButton();
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
	// zeigen Ergebnisse (Schwarz/weiﬂ) nach Tipp an
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
	static JRadioButton zug81 = new JRadioButton();
	static JRadioButton zug82 = new JRadioButton();
	static JRadioButton zug83 = new JRadioButton();
	static JRadioButton zug84 = new JRadioButton();
	static JRadioButton zug91 = new JRadioButton();
	static JRadioButton zug92 = new JRadioButton();
	static JRadioButton zug93 = new JRadioButton();
	static JRadioButton zug94 = new JRadioButton();
	static JRadioButton zug101 = new JRadioButton();
	static JRadioButton zug102 = new JRadioButton();
	static JRadioButton zug103 = new JRadioButton();
	static JRadioButton zug104 = new JRadioButton();
	static JRadioButton zug111 = new JRadioButton();
	static JRadioButton zug112 = new JRadioButton();
	static JRadioButton zug113 = new JRadioButton();
	static JRadioButton zug114 = new JRadioButton();
	// Gruppierungen/Labels zur Beschriftung
	ButtonGroup gruppe5 = new ButtonGroup();
	JLabel spielfeld = new JLabel("Spielfeld: ");
	JLabel ergebnisse = new JLabel("Ergebnisse: ");
	JLabel farbwahl = new JLabel("Farbwahl: ");
	JLabel farbkombi = new JLabel("Farbkombination: ");
	JLabel punktzahl = new JLabel("Score: ");
	JLabel score = new JLabel(String.valueOf(highscore));
	//Elemente des Men¸s
	JButton show = new JButton("show!");
	JButton einSpieler = new JButton("1-Spieler");
	JButton zweiSpieler = new JButton("2-Spieler");
	JButton exit = new JButton("Spiel verlassen");
	
	
	void menue(){
		frame2.setSize(300, 300);
		frame2.setVisible(true);
		frame2.setLayout(null);		
		einSpieler.setBounds(70,55, 145,45);
		zweiSpieler.setBounds(70, 105, 145,45);
		exit.setBounds(70, 155, 145,45);
		frame2.add(panel2);
		frame2.add(einSpieler);
		frame2.add(zweiSpieler);
		frame2.add(exit);
		einSpieler.addActionListener(this);
		zweiSpieler.addActionListener(this);
		exit.addActionListener(this);
		
	}
	

	void ui() {
		frame.setSize(500, 750);
		frame.setVisible(true);
		frame.setLayout(null);

		ausw‰hlen.setBounds(350, 620, 100, 50);
		retry.setBounds(350, 570, 100, 50);
		spiel.setBounds(250, 570, 100, 100);	
		show.setBounds(380,250,75,25);
		score.setBounds(380,25,100,25);
		punktzahl.setBounds(380, 00, 100, 25);
		runde1bt1.setBounds(25, 605, 20, 25);
		runde1bt2.setBounds(50, 605, 20, 25);
		runde1bt3.setBounds(75, 605, 20, 25);
		runde1bt4.setBounds(100, 605, 20, 25);
		runde2bt1.setBounds(25, 555, 20, 25);
		runde2bt2.setBounds(50, 555, 20, 25);
		runde2bt3.setBounds(75, 555, 20, 25);
		runde2bt4.setBounds(100, 555, 20, 25);
		runde3bt1.setBounds(25, 505, 20, 25);		
		runde3bt2.setBounds(50, 505, 20, 25);
		runde3bt3.setBounds(75, 505, 20, 25);
		runde3bt4.setBounds(100, 505, 20, 25);
		runde4bt1.setBounds(25, 455, 20, 25);
		runde4bt2.setBounds(50, 455, 20, 25);
		runde4bt3.setBounds(75, 455, 20, 25);
		runde4bt4.setBounds(100, 455, 20, 25);
		runde5bt1.setBounds(25, 405, 20, 25);
		runde5bt2.setBounds(50, 405, 20, 25);
		runde5bt3.setBounds(75, 405, 20, 25);
		runde5bt4.setBounds(100, 405, 20, 25);
		runde6bt1.setBounds(25, 355, 20, 25);
		runde6bt2.setBounds(50, 355, 20, 25);
		runde6bt3.setBounds(75, 355, 20, 25);
		runde6bt4.setBounds(100, 355, 20, 25);
		runde7bt1.setBounds(25, 305, 20, 25);
		runde7bt2.setBounds(50, 305, 20, 25);
		runde7bt3.setBounds(75, 305, 20, 25);
		runde7bt4.setBounds(100, 305, 20, 25);
		runde8bt1.setBounds(25, 255, 20, 25);		
		runde8bt2.setBounds(50, 255, 20, 25);	
		runde8bt3.setBounds(75, 255, 20, 25);	
		runde8bt4.setBounds(100, 255, 20, 25);		
		runde9bt1.setBounds(25, 205, 20, 25);
		runde9bt2.setBounds(50, 205, 20, 25);
		runde9bt3.setBounds(75, 205, 20, 25);
		runde9bt4.setBounds(100, 205, 20, 25);
		runde10bt1.setBounds(25, 155, 20, 25);
		runde10bt2.setBounds(50, 155, 20, 25);
		runde10bt3.setBounds(75, 155, 20, 25);
		runde10bt4.setBounds(100, 155, 20, 25);
		runde11bt1.setBounds(25, 105, 20, 25);
		runde11bt2.setBounds(50, 105, 20, 25);
		runde11bt3.setBounds(75, 105, 20, 25);
		runde11bt4.setBounds(100, 105, 20, 25);
		runde12bt1.setBounds(25, 55, 20, 25);
		runde12bt2.setBounds(50, 55, 20, 25);
		runde12bt3.setBounds(75, 55, 20, 25);
		runde12bt4.setBounds(100, 55, 20, 25);
		red5.setBounds(275, 75, 20, 25);
		blue5.setBounds(300, 75, 20, 25);
		yell5.setBounds(325, 75, 20, 25);
		white5.setBounds(275, 100, 20, 25);
		black5.setBounds(300, 100, 20, 25);
		green5.setBounds(325, 100, 20, 25);	
		
		spielfeld.setBounds(25, 00, 100, 25);		
		ergebnisse.setBounds(150, 00, 100, 25);
		farbwahl.setBounds(275, 30, 100, 25);
		farbkombi.setBounds(275, 200, 125, 25);
		farbe1.setBounds(275, 250, 20, 25);
		farbe2.setBounds(300, 250, 20, 25);
		farbe3.setBounds(325, 250, 20, 25);
		farbe4.setBounds(350, 250, 20, 25);		
		zug111.setBounds(150, 45, 20, 25);
		zug112.setBounds(175,45, 20, 25);
		zug113.setBounds(150, 70, 20, 25);
		zug114.setBounds(175, 70, 20, 25);
		zug101.setBounds(150, 95, 20, 25);
		zug102.setBounds(175,95, 20, 25);
		zug103.setBounds(150, 120, 20, 25);
		zug104.setBounds(175, 120, 20, 25);
		zug91.setBounds(150, 145, 20, 25);
		zug92.setBounds(175,145, 20, 25);
		zug93.setBounds(150, 170, 20, 25);
		zug94.setBounds(175, 170, 20, 25);
		zug81.setBounds(150, 195, 20, 25);
		zug82.setBounds(175,195, 20, 25);
		zug83.setBounds(150, 220, 20, 25);
		zug84.setBounds(175, 220, 20, 25);
		zug01.setBounds(150, 245, 20, 25);
		zug02.setBounds(175,245, 20, 25);
		zug03.setBounds(150, 270, 20, 25);
		zug04.setBounds(175, 270, 20, 25);
		zug11.setBounds(150, 300, 20, 25);
		zug12.setBounds(175, 300, 20, 25);
		zug13.setBounds(150, 325, 20, 25);
		zug14.setBounds(175, 325, 20, 25);
		zug21.setBounds(150, 355, 20, 25);
		zug22.setBounds(175, 355, 20, 25);
		zug23.setBounds(150, 380, 20, 25);
		zug24.setBounds(175, 380, 20, 25);
		zug31.setBounds(150, 410, 20, 25);
		zug32.setBounds(175, 410, 20, 25);
		zug33.setBounds(150, 435, 20, 25);
		zug34.setBounds(175, 435, 20, 25);
		zug41.setBounds(150, 465, 20, 25);
		zug42.setBounds(175, 465, 20, 25);
		zug43.setBounds(150, 490, 20, 25);
		zug44.setBounds(175, 490, 20, 25);
		zug51.setBounds(150, 520, 20, 25);
		zug52.setBounds(175, 520, 20, 25);
		zug53.setBounds(150, 545, 20, 25);
		zug54.setBounds(175, 545, 20, 25);
		zug61.setBounds(150, 570, 20, 25);
		zug62.setBounds(175, 570, 20, 25);
		zug63.setBounds(150, 595, 20, 25);
		zug64.setBounds(175, 595, 20, 25);
		zug71.setBounds(150, 620, 20, 25);
		zug72.setBounds(175, 620, 20, 25);
		zug73.setBounds(150, 645, 20, 25);
		zug74.setBounds(175, 645, 20, 25);		
		buttonsDisable(runde8bt1, runde7bt1, runde4bt1, runde3bt1);
		buttonsDisable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);	
		buttonsDisable(runde8bt2, runde7bt2, runde4bt2, runde3bt2);
		buttonsDisable(runde8bt3, runde7bt3, runde4bt3, runde3bt3);
		buttonsDisable(runde8bt4, runde7bt4, runde4bt4, runde3bt4);			
		buttonsDisable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
		buttonsDisable(runde5bt1, runde6bt1, runde5bt2, runde6bt2);
		buttonsDisable(runde5bt4, runde6bt4, runde5bt3, runde6bt3);
		buttonsDisable(runde9bt1,runde9bt2,runde9bt3,runde9bt4);
		buttonsDisable(runde10bt1,runde10bt2,runde10bt3,runde10bt4);
		buttonsDisable(runde11bt1,runde11bt2,runde11bt3,runde11bt4);
		buttonsDisable(runde12bt1,runde12bt2,runde12bt3,runde12bt4);
		buttonsDisable(zug01, zug02, zug03, zug04);
		buttonsDisable(zug11, zug12, zug13, zug14);
		buttonsDisable(zug21, zug22, zug23, zug24);
		buttonsDisable(zug31, zug32, zug33, zug34);
		buttonsDisable(zug41, zug42, zug43, zug44);
		buttonsDisable(zug51, zug52, zug53, zug54);
		buttonsDisable(zug61, zug62, zug63, zug64);
		buttonsDisable(zug71, zug72, zug73, zug74);	
		buttonsDisable(zug81, zug82, zug83, zug84);	
		buttonsDisable(zug91, zug92, zug93, zug94);	
		buttonsDisable(zug101, zug102, zug103, zug104);	
		buttonsDisable(zug111, zug112, zug113, zug114);	
		spiel.setEnabled(false);	
		score.setText(String.valueOf(highscore));

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
		frame.add(ausw‰hlen);
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
		frame.add(runde9bt1);
		frame.add(runde9bt2);
		frame.add(runde9bt3);
		frame.add(runde9bt4);
		frame.add(runde10bt1);
		frame.add(runde10bt2);
		frame.add(runde10bt3);
		frame.add(runde10bt4);
		frame.add(runde11bt1);
		frame.add(runde11bt2);
		frame.add(runde11bt3);
		frame.add(runde11bt4);
		frame.add(runde12bt4);
		frame.add(runde12bt1);
		frame.add(runde12bt2);
		frame.add(runde12bt3);
		frame.add(runde12bt4);
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
		frame.add(zug81);
		frame.add(zug82);
		frame.add(zug83);
		frame.add(zug84);
		frame.add(zug91);
		frame.add(zug92);
		frame.add(zug93);
		frame.add(zug94);
		frame.add(zug101);
		frame.add(zug102);
		frame.add(zug103);
		frame.add(zug104);
		frame.add(zug111);
		frame.add(zug112);
		frame.add(zug113);
		frame.add(zug114);
		
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

		ausw‰hlen.addActionListener(this);
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
		runde9bt1.addActionListener(actionlistener);
		runde9bt2.addActionListener(actionlistener);
		runde9bt3.addActionListener(actionlistener);
		runde9bt4.addActionListener(actionlistener);
		runde10bt1.addActionListener(actionlistener);
		runde10bt2.addActionListener(actionlistener);
		runde10bt3.addActionListener(actionlistener);
		runde10bt4.addActionListener(actionlistener);
		runde11bt1.addActionListener(actionlistener);
		runde11bt2.addActionListener(actionlistener);
		runde11bt3.addActionListener(actionlistener);
		runde11bt4.addActionListener(actionlistener);
		runde12bt1.addActionListener(actionlistener);
		runde12bt2.addActionListener(actionlistener);
		runde12bt3.addActionListener(actionlistener);
		runde12bt4.addActionListener(actionlistener);
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
			auswahl2 = setComputerColors1();
			auswahl3 = setComputerColors1();
			auswahl4 = setComputerColors1();
			buttonsDisable(farbe1, farbe2, farbe3, farbe4);
			buttonsNotVisible(farbe1, farbe2, farbe3, farbe4);
			buttonsEnable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);			
			buttonsDisable(ausw‰hlen);
			radiobuttonComputerColor(farbe1, farbe2, farbe3, farbe4, auswahl1, auswahl2, auswahl3, auswahl4);
			einspieler = true;				
			spielereins.ui();
			spielRunde = 1;
			frame2.dispose();			
		}
		
		if(source == zweiSpieler){
			JOptionPane.showMessageDialog(null, "Spieler 1 muss eine Farbkombination ausw‰hlen. Spieler 2 versucht die Farbkombination zu erraten.","2-Spieler Modus",0);
			Mastermind zweispieler = new Mastermind();
			zweispieler.ui();
					
			frame2.dispose();
			
		}
		if(source == exit){
			frame2.dispose();
		}
		
		if (source == retry) {
			buttonsDisable(runde9bt1, runde9bt2, runde9bt3, runde9bt4);
			buttonsDisable(runde10bt1, runde10bt2, runde10bt3, runde10bt4);
			buttonsDisable(runde11bt1, runde11bt2, runde11bt3, runde11bt4);
			buttonsDisable(runde12bt1, runde12bt2, runde12bt3, runde12bt4);
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
			resetColor(runde9bt1, runde9bt2, runde9bt3, runde9bt4);
			resetColor(runde10bt1, runde10bt2, runde10bt3, runde10bt4);
			resetColor(runde11bt1, runde11bt2, runde11bt3, runde11bt4);
			resetColor(runde12bt1, runde12bt2, runde12bt3, runde12bt4);
			resetColor(farbe1, farbe2, farbe3, farbe4);
			resetColor(zug01, zug02, zug03, zug04);
			resetColor(zug11, zug12, zug13, zug14);
			resetColor(zug21, zug22, zug23, zug24);
			resetColor(zug31, zug32, zug33, zug34);
			resetColor(zug41, zug42, zug43, zug44);
			resetColor(zug51, zug52, zug53, zug54);
			resetColor(zug61, zug62, zug63, zug64);
			resetColor(zug71, zug72, zug73, zug74);
			resetColor(zug81, zug82, zug83, zug84);
			resetColor(zug91, zug92, zug93, zug94);
			resetColor(zug101, zug102, zug103, zug104);
			resetColor(zug111, zug112, zug113, zug114);
			buttonsEnable(spiel);
			buttonsEnable(show);
			spielRunde = 1;
			auswahl1 = setComputerColors1();
			auswahl2 = setComputerColors1();
			auswahl3 = setComputerColors1();
			auswahl4 = setComputerColors1();
			radiobuttonComputerColor(farbe1, farbe2, farbe3, farbe4, auswahl1, auswahl2, auswahl3, auswahl4);
			buttonsNotVisible(farbe1, farbe2, farbe3, farbe4);
			if (einspieler == false) {
				buttonsEnable(farbe1, farbe2, farbe3, farbe4);
				buttonsVisible(farbe1, farbe2, farbe3, farbe4);
				buttonsEnable(ausw‰hlen);
				buttonsDisable(spiel);
				resetColor(farbe1, farbe2, farbe3, farbe4);
			}
		}
		
			
		if (source == ausw‰hlen) {

			auswahl1 = String.valueOf(getAuswahl(farbe1));
			auswahl2 = String.valueOf(getAuswahl(farbe2));
			auswahl3 = String.valueOf(getAuswahl(farbe3));
			auswahl4 = String.valueOf(getAuswahl(farbe4));
			if (auswahl1 == "nichts" || auswahl2 == "nichts" || auswahl3 == "nichts" || auswahl4 == "nichts" ) {
					JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt.", "Fehler", 0);
			} else {

				ausw‰hlen.setEnabled(false);
				spiel.setEnabled(true);				
				buttonsEnable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);
				buttonsDisable(farbe1, farbe2, farbe3, farbe4);
				buttonsNotVisible(farbe1, farbe2,farbe3, farbe4);
			}

		}

		if (source == spiel) {


			if (spielRunde == 1) {
				zugFarbe1 = getAuswahl(runde1bt1);
				zugFarbe2 = String.valueOf(getAuswahl(runde1bt2));
				zugFarbe3 = String.valueOf(getAuswahl(runde1bt3));
				zugFarbe4 = String.valueOf(getAuswahl(runde1bt4));
				if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
					JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben ausgewh‰lt.",
							"Fehler", 0);
				} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug71, zug72, zug73, zug74);
					buttonsDisable(runde1bt1, runde1bt2, runde1bt3, runde1bt4);
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3, ergebnis4);
					if (gewonnen == true) {
						if (showWert == false) {
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde - 1)
									+ " Spielrunde gebraucht und 300 Punkte erhalten!", "Spielende", 0);
							highscore += 300;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						} else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2, farbe3, farbe4);
						spielRunde = 0;
						buttonsDisable(spiel);
					} else {
						buttonsEnable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
					}

				}
				}
				else if (spielRunde == 2) {			
					zugFarbe1 = String.valueOf(getAuswahl(runde2bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde2bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde2bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde2bt4));
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);					
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug61, zug62,zug63, zug64);						
					buttonsDisable(runde2bt1, runde2bt2, runde2bt3, runde2bt4);
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 250 Punkte erhalten!", "Spielende", 0);
							highscore +=250;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde3bt1,runde3bt2, runde3bt3, runde3bt4);
					}
				 }
				}
				
				
				else if (spielRunde == 3) {	
					zugFarbe1 = String.valueOf(getAuswahl(runde3bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde3bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde3bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde3bt4));
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);					
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug51, zug52,zug53, zug54);						
					buttonsDisable(runde3bt1, runde3bt2, runde3bt3, runde3bt4);					
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 230 Punkte erhalten!", "Spielende", 0);
							highscore +=230;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde4bt1, runde4bt2, runde4bt3, runde4bt4);
					}
			      }
				}
				
				else if (spielRunde == 4) {				
					zugFarbe1 = String.valueOf(getAuswahl(runde4bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde4bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde4bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde4bt4));					
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug41, zug42, zug43, zug44);			
					buttonsDisable(runde4bt1, runde4bt2, runde4bt3, runde4bt4);				
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 210 Punkte erhalten!", "Spielende", 0);
							highscore +=210;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde5bt1, runde5bt2, runde5bt3, runde5bt4);
					}
			   	}		
				}
				else if (spielRunde == 5) {
					zugFarbe1 = String.valueOf(getAuswahl(runde5bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde5bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde5bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde5bt4));					
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug31, zug32, zug33, zug34);			
					buttonsDisable(runde5bt1, runde5bt2, runde5bt3, runde5bt4);								
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 190 Punkte erhalten!", "Spielende", 0);
							highscore +=190;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde6bt1, runde6bt2, runde6bt3, runde6bt4);
					}
				}		
				}
				
				else if (spielRunde == 6) {
					zugFarbe1 = String.valueOf(getAuswahl(runde6bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde6bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde6bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde6bt4));					
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug21, zug22, zug23, zug24);			
					buttonsDisable(runde6bt1, runde6bt2, runde6bt3, runde6bt4);				
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 170 Punkte erhalten!", "Spielende", 0);
							highscore +=170;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde7bt1, runde7bt2, runde7bt3, runde7bt4);
					}
					}
				}		
				else if (spielRunde == 7) {
					zugFarbe1 = String.valueOf(getAuswahl(runde7bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde7bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde7bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde7bt4));			
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug11, zug12, zug13, zug14);			
					buttonsDisable(runde7bt1, runde7bt2, runde7bt3, runde7bt4);					
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 150 Punkte erhalten!", "Spielende", 0);
							highscore +=150;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde8bt1, runde8bt2, runde8bt3, runde8bt4);
					}
				}	
				}
				else if (spielRunde == 8) {
					zugFarbe1 = String.valueOf(getAuswahl(runde8bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde8bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde8bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde8bt4));	
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug01, zug02, zug03, zug04);			
					buttonsDisable(runde8bt1, runde8bt2, runde8bt3, runde8bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 130 Punkte erhalten!", "Spielende", 0);
							highscore +=130;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde9bt1, runde9bt2, runde9bt3, runde9bt4);
											}
					}
				}	else if (spielRunde == 9){
					zugFarbe1 = String.valueOf(getAuswahl(runde9bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde9bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde9bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde9bt4));	
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug81, zug82, zug83, zug84);			
					buttonsDisable(runde9bt1, runde9bt2, runde9bt3, runde9bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 110 Punkte erhalten!", "Spielende", 0);
							highscore +=110;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde10bt1, runde10bt2, runde10bt3, runde10bt4);
						
						}
					}
					
					
				}else if (spielRunde == 10){
					zugFarbe1 = String.valueOf(getAuswahl(runde10bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde10bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde10bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde10bt4));		
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug91, zug92, zug93, zug94);			
					buttonsDisable(runde10bt1, runde10bt2, runde10bt3, runde10bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 90 Punkte erhalten!", "Spielende", 0);
							highscore +=90;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde11bt1, runde11bt2, runde11bt3, runde11bt4);
											
					}
					}
					
				}else if (spielRunde == 11){
					zugFarbe1 = String.valueOf(getAuswahl(runde11bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde11bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde11bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde11bt4));			
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug101, zug102, zug103, zug104);			
					buttonsDisable(runde11bt1, runde11bt2, runde11bt3, runde11bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 70 Punkte erhalten!", "Spielende", 0);
							highscore +=70;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{
						buttonsEnable(runde12bt1, runde12bt2, runde12bt3, runde12bt4);
					}
						
					}
				}else if (spielRunde == 12){
					zugFarbe1 = String.valueOf(getAuswahl(runde12bt1));
					zugFarbe2 = String.valueOf(getAuswahl(runde12bt2));
					zugFarbe3 = String.valueOf(getAuswahl(runde12bt3));
					zugFarbe4 = String.valueOf(getAuswahl(runde12bt4));	
					if (zugFarbe1 == "nichts" || zugFarbe2 == "nichts" || zugFarbe3 == "nichts" || zugFarbe4 == "nichts") {
						JOptionPane.showMessageDialog(null, "Es wurden nicht alle Farben in der Farbkombination ausgewh‰lt",
								"Fehler", 0);
					} else {
					anzahlFarbenComputer(auswahl1, auswahl2, auswahl3, auswahl4);
					String ergebnis1 = runde1Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					String ergebnis2 = runde2Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					String ergebnis3 = runde3Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					String ergebnis4 = runde4Schwarz(auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					ergebnis1 = runde1Weiﬂ(ergebnis1,auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe1);
					ergebnis2 = runde2Weiﬂ(ergebnis2, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe2);
					ergebnis3 = runde3Weiﬂ(ergebnis3, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe3);
					ergebnis4 = runde4Weiﬂ(ergebnis4, auswahl1, auswahl2, auswahl3, auswahl4, zugFarbe4);
					setErgebnisColor(ergebnis1, ergebnis2, ergebnis3, ergebnis4, zug111, zug112, zug113, zug114);			
					buttonsDisable(runde12bt1, runde12bt2, runde12bt3, runde12bt4);						
					spielRunde++;
					gewonnen = gewonnen(ergebnis1, ergebnis2, ergebnis3,ergebnis4);
					if (gewonnen == true){
						if(showWert == false){
							JOptionPane.showMessageDialog(null, "Gewonnen!" + " Sie haben " + (spielRunde -1 )+ " Spielrunden gebraucht und 50 Punkte erhalten!", "Spielende", 0);
							highscore +=50;
							score.setText(String.valueOf(highscore));
							buttonsDisable(spiel,show);
						}else {
							JOptionPane.showMessageDialog(null, "Game Over! Farben wurden aufgedeckt!", "Spielende", 0);
							buttonsDisable(spiel,show);
						}
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
					}else{									
						JOptionPane.showMessageDialog(null, "Game Over! Keine Z¸ge mehr!", "Spielende", 0);
						buttonsVisible(farbe1, farbe2,farbe3, farbe4);
						spielRunde = 0;
						
					}
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
						"Bitte w‰hlen Sie zuerst eine Farbe aus!", "Fehler", 0);

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
			if (button == runde9bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde9bt4);
			}
			if (button == runde9bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde9bt3);
			}
			if (button == runde9bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde9bt2);
			}
			if (button == runde9bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde9bt1);
			}
			if (button == runde10bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde10bt4);
			}
			if (button == runde10bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde10bt3);
			}
			if (button == runde10bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde10bt2);
			}
			if (button == runde10bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde10bt1);
			}
			if (button == runde11bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde11bt4);
			}
			if (button == runde11bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde11bt3);
			}
			if (button == runde11bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde11bt2);
			}
			if (button == runde11bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde11bt1);
			}
			if (button == runde12bt4) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde12bt4);
			}
			if (button == runde12bt3) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde12bt3);
			}
			if (button == runde12bt2) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde12bt2);
			}
			if (button == runde12bt1) {
				buttonColor(red5, blue5, black5, green5, white5, yell5, runde12bt1);
			}
		}
			

	}

}
