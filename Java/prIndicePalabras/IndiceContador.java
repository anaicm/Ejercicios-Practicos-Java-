package prIndicePalabras;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class IndiceContador extends IndiceAbstracto {
	private SortedMap<String, SortedSet<Integer>> indice;

	public IndiceContador() {
		super();
		this.frases = new TreeMap <String, Integer>(String.CASE_INSENSITIVE_ORDER);
	}

	@Override
	public void resolver(String delimitadores) {
		indice.clear();
		Iterator<String> iter = super.frases.iterator();
		while (iter.hasNext()) {
			String frase = iter.next();
			Scanner sc = new Scanner(frase);
			sc.useDelimiter(delimitadores);
			sc.useLocale(Locale.ENGLISH);

			while (sc.hasNext()) {
				String palabra = sc.next().toLowerCase();
				int veces = encontrarPalabra(palabra);
				if (veces == 0) {
					indice.put(palabra, 1);
				} else {
					indice.replace(palabra, veces + 1);
				}
			}
		}

	}
	

}
