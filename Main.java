import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<String> currentList = new ArrayList<String>();

	public static void main(String[] args) {

		int auswahl = -1;
		while (auswahl != 0) {
			auswahl = menu();

			switch (auswahl) {

			case 1: {

				liste();
				break;
			}

			case 2: {
				einfuegen();
				break;
			}

			case 3: {
				entfernen();
				break;
			}

			case 4: {
				abhaken();
				break;
			}
			default: {
				System.out.println("Geben sie eine zahl zwischen 1 und 3 ein.");
			}
			}
		}

	}

	public static int menu() {
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Menu");
		System.out.println("----------------------");
		System.out.println("1. Liste anzeigen");
		System.out.println("2. Einfuegen");
		System.out.println("3. Entfernen");
		System.out.println("4. Abhaken");
		System.out.println();
		System.out.print("Eingabe ");
		Scanner scan = new Scanner(System.in);
		int choice;
		choice = scan.nextInt();
		return choice;
	}

	public static void liste() {

		System.out.println();
		System.out.println("----------------------");
		System.out.println("To-Do Liste");
		System.out.println("----------------------");
		int number = 0;
		for (String item : currentList) {
			System.out.println(++number + " " + item);
		}
		System.out.println("----------------------");
	}

	public static void einfuegen() {

		System.out.println("Einfuegen");
		System.out.println("----------------------");
		System.out.print("Geben sie ihre eingabe ein:");
		Scanner scanner = new Scanner(System.in);
		String item = scanner.nextLine();
		currentList.add(item);
		liste();

	}

	public static void entfernen() {
		System.out.println("Eingabe entfernen");
		System.out.println("----------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Was möchten sie entfernen");
		int index = scanner.nextInt();
		if ((index - 1) < 0 || index > currentList.size()) {
			System.out.println("Falsche eingabe" + currentList.size());
		} else {
			currentList.remove(index - 1);
		}
		System.out.println("----------------------");
		liste();
	}

	public static void abhaken() {
		
	}
}
