import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_ui implements ActionListener {

	// hier werden erstmal in der Hauptfunktion der Klasse die GUI-Elemente erstellt
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel(new FlowLayout());
	JTextArea text = new JTextArea(1,20);	
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");
	JButton butminus = new JButton("-");
	JButton butplus = new JButton("+");
	JButton butbruch = new JButton("/");
	JButton butmal = new JButton("*");
	JButton butclear = new JButton("c");
	JButton butequal = new JButton("equal");
	Double number1, number2, result;
	
	//verschiedene Counter um zu bestimmen wie oft welche Rechenart verwendet wurde... ist für den Equal-Button wichtig!
	int addc = 0, subc=0, multic=0, divc=0;
	
	
	public void ui()
	{	
		frame.setVisible(true);
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//hiermit füge ich dem frame erstmal das panel und das Eingabefeld zu
	
		frame.add(panel);		
		panel.add(text);
		//jetzt wird dem Panel (Panel = Fenster vom Programm) die Buttons hinzugefügt
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		panel.add(butminus);
		panel.add(butplus);
		panel.add(butbruch);
		panel.add(butmal);
		panel.add(butclear);
		panel.add(butequal);
				
		//ActionListener zufügen damit der Button eine Aktion ausführt
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);		
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		butminus.addActionListener(this);
		butplus.addActionListener(this);
		butbruch.addActionListener(this);
		butmal.addActionListener(this);
		butclear.addActionListener(this);
		butequal.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		//hiermit wird das ButtonEvent abgefangen
		Object source = e.getSource();
		
		//hnun können wir die source abrufen und mit den Buttons vergleichen... "wenn But1 geklickt wird... dann mache"
		if(source == but1){
			//für diese Buttons schreiben wir einfach deren Zahl ins Textfeld
			text.append("1");
		}
	if(source == but2){
			text.append("2");
		}
	if(source == but3){
		text.append("3");
	}
	if(source == but4){
		text.append("4");
	}
	if(source == but5){
		text.append("5");
	}
	if(source == but6){
		text.append("6");
	}
	if(source == but7){
		text.append("7");
	}
	
	if(source == but8){
		text.append("8");
	}
	if(source == but9){
		text.append("9");
	}
	if(source == but0){
		text.append("0");
	}	
	if(source == butplus){
		number1 = number_reader();
		text.setText("");
		addc=1;
		subc=0;
		multic=0;
		
	}	
	if(source == butminus){
		number1 = number_reader();
		text.setText("");
		addc=0;
		subc=1;
		multic=0;
		
	}	
	if(source == butmal){
		number1 = number_reader();
		text.setText("");
		addc=0;
		subc=0;
		multic=1;
		
	}	
	if(source == butbruch){
		number1 = number_reader();
		text.setText("");
		addc=0;
		subc=0;
		multic=0;
		divc=1;
	}
	if(source == butequal){
		number2 = number_reader();
		if (addc > 0){
			result = number1+number2;
			text.setText(Double.toString(result));
		}
		
		if (subc> 0){
			result = number1-number2;
			text.setText(Double.toString(result));
		}
		if (multic > 0){
			result = number1*number2;
			text.setText(Double.toString(result));
		}
		if(source == butclear){
		number1 = 0.0;
		number2= 0.0;
		text.setText(" ");
			
		}
	}	
	}
	public double number_reader(){
		double num1;
		String s;
		
		s = text.getText();
		num1 = Double.valueOf(s);
		//wenn eine Function NICHT void hat (void = gebe nix zurück), dann muss es ein return value geben!
		return num1;
		
		
	}
}

