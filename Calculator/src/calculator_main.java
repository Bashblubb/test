
public class calculator_main extends calculator_ui {
	//erweitere die Hauptklasse um die GUI-Klasse
	//nach dem OOP Prinzip trennen wir die einzelnen Bestandteile des Programmes in verschiedene Klassen auf
	 
	public static void main(String[] args) {
		
		//neuen Konstruktor für calculator_ui erstellen um die Methode calculator_ui zu callen
		calculator_ui n = new calculator_ui(); //Calculator_ui ist hierbei ein Klassendatentyp
		n.ui();

	}

}
