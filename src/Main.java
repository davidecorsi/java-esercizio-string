import java.util.Scanner;

/*
 * Creare un applicazione che legga in input il vostro nome ed il vostro cognome. In output deve produrre
 * il vostro nome e cognome in maiuscolo con una cornice di asterischi. La cornice deve essere costituita 
 * da questi elementi fondamentali. Una riga centrale contenente il nome e cognome preceduti da un * e 2
 * spazi bianchi e seguiti da 2 spazi bianchi e un asterisco. 2 righe una superiore e una inferiore di 
 * solo asterischi, devono essere della frase + 6. 2 righe intermedie, che iniziano e finisco con un 
 * asterisco, gli altri caratteri sono spazi, il numero di questi spazi deve essere la lunghezza della 
 * frase + 4.
 */

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il nome ");
		String name = input.nextLine();
		System.out.print("Inserisci il cognome ");
		String surname = input.nextLine();
		String asterisksRow = "********************" +
		                      "********************" +
		                      "********************" +
		                      "********************";
		String whiteRow = "                    " +
				          "                    " +
				          "                    " +
				          "                    ";
		String phrase = (name + " " + surname).toUpperCase();
		int lenght = phrase.length();
		String frameRow = asterisksRow.substring(0, lenght + 6);
		String spaces = whiteRow.substring(0, lenght + 4);
		String middleRow = "*" + spaces + "*";
		String textRow = "*  " + phrase + "  *";
		System.out.println(frameRow);
		System.out.println(middleRow);
		System.out.println(textRow);
		System.out.println(middleRow);
		System.out.println(frameRow);
	}
}
