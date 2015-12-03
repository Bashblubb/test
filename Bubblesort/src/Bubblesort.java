//Bubblesort: Vorgegeben ist ein Array mit unsortierten Integer-Werten
//Schreibe einen Algorithmus der jeweils 2 nebeneinander liegende Zahlen vergleicht
//ist die rechte der beiden Zahlen kleiner als die linke, dann vertausche beide!
//führe dies solange aus bis das Array sortiert ist!

public class Bubblesort {

	public static void main(String[] args) {
		//Deklaration der Arrays
		int[] array1 = { 4, 1, -5, 8, 9, 0, 3 };
		int[] array2 = {0,100,29,1,2,3,-500};
		//Instanzierung eines Objektes
		Bubblesort sort = new Bubblesort();
		//Aufruf der sort Funktion über Objekte
		sort.sort(array1);
		sort.sort(array2);
		//Ausgabe der Arrays über For-Each Schleife
		System.out.println("Array 1:\n--------");
		for (int eintrag : array1) {
			System.out.println(eintrag);
		}
		System.out.println("Array 2:\n--------");
		for (int eintrag : array2) {
			System.out.println(eintrag);
		}
	}

	void sort(int[] zahlen) {
		int container3;
		boolean unsortiert = true;
		// Äußere Schleife wiederholt den Sortieralgorithmus solange bis alle Zahlen sortiert sind
		while (unsortiert) {
			unsortiert = false;
			// Ein Durchlauf mit richtigem Sortieralgorithmus
			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i + 1] < zahlen[i]) {
					unsortiert = true;
					container3 = zahlen[i + 1];
					zahlen[i + 1] = zahlen[i];
					zahlen[i] = container3;					
					}				
			}
		}
	}
}
