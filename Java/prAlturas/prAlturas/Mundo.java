package prAlturas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mundo {
	private List<Pais> paises;

	/**
	 * Constructor crea un objeto Mundo que construye una lista de paises
	 * 
	 * @param paises
	 */
	private Mundo(List<Pais> paises) {
		this.paises = paises;
	}

	/**
	 * Devuelve la lista de paises
	 * 
	 * @return the paises
	 */
	public List<Pais> getPaises() {
		return paises;
	}

	/**
	 * Crea una lista a partir del fichero recibido
	 * 
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Mundo createFromFile(String file) throws FileNotFoundException {

		List<Pais> paisesFich = new ArrayList<Pais>();
		Pais tmp;
		String linea;
		String[] datos;
		File nomFich = new File(file);
		Scanner sc = new Scanner(nomFich);
		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			try {
				datos = linea.split(",");
				tmp = new Pais(datos[0], datos[1], Double.parseDouble(datos[2]));
				paisesFich.add(tmp);

			} catch (Exception o) {
				System.out.println("la linea no es correcta: " + linea);

			}
		}

		return new Mundo(paisesFich);
	}

	/**
	 * recibe una correspondencia y la muestra por pantalla con su clave y valor
	 * correspondiente
	 * 
	 * @param <K>
	 * @param <V>
	 * @param map
	 */
	public static <K, V> void presentaEnConsola(Map<K, V> map) {
		for (Map.Entry<K, V> linea : map.entrySet()) {
			System.out.println(linea.getKey() + "," + linea.getValue());

		}

	}

	/**
	 * Devuelve la correspondencia con el conjunto de paises que tiene
	 * 
	 * @return
	 */

	public SortedMap<String, Integer> numeroDePaisesPorContinente() {

		SortedMap<String, Integer> paisesPorContinente = new TreeMap<String, Integer>();
		Iterator<Pais> iter = this.paises.iterator();
		while (iter.hasNext()) {
			Pais pais = iter.next();
			if (paisesPorContinente.size() == 0) {
				paisesPorContinente.put(pais.getContinente(), 1);
			} else {
				boolean escrito = false;
				for (SortedMap.Entry<String, Integer> linea : paisesPorContinente.entrySet()) {
					if (linea.getKey().equalsIgnoreCase(pais.getContinente())) {
						paisesPorContinente.put(pais.getContinente(), linea.getValue() + 1);
						escrito = true;
					}
				}
				if (!escrito) {
					paisesPorContinente.put(pais.getContinente(), 1);
				}
			}
		}
		return paisesPorContinente;
	}

	/**
	 * Devuelve una correspondencia, que asocia cada altura con una lista de países
	 * que tienen esa altura media. Las alturas se truncan a un solo decimal.
	 * 
	 * @return
	 */
	public SortedMap<Double, List<Pais>> paisesPorAltura() {
		SortedMap<Double, List<Pais>> alturas = new TreeMap<Double, List<Pais>>();
		Iterator<Pais> iter = this.paises.iterator();
		while (iter.hasNext()) {
			Pais pr = iter.next();
			double altura = Math.floor(pr.getAltura() * 10) / 10;
			boolean escrito = false;
			for (Map.Entry<Double, List<Pais>> alt : alturas.entrySet()) {
				if (alt.getKey().equals(altura)) {
					List<Pais> valor = alt.getValue();
					valor.add(pr);
					alturas.put(altura, valor);
					escrito = true;
				}
			}
			if (!escrito) {
				List<Pais> prvs2 = new ArrayList<Pais>();
				prvs2.add(pr);
				alturas.put(altura, prvs2);
			}
		}
		return alturas;
	}

	/**
	 * Devuelve una correspondencia ordenada por el orden natural, en la que cada
	 * continente se asocia con un conjunto de países que contiene, ordenados por el
	 * orden natural.
	 * 
	 * @return
	 */

	public SortedMap<String, SortedSet<Pais>> paisesPorContinente() {
		SortedMap<String, SortedSet<Pais>> paisesContinente = new TreeMap<String, SortedSet<Pais>>();
		Iterator<Pais> iter = this.paises.iterator();
		while (iter.hasNext()) {
			Pais pais = iter.next();
			boolean escrito = false;
			for (SortedMap.Entry<String, SortedSet<Pais>> paisContinente : paisesContinente.entrySet()) {
				if (paisContinente.getKey().equals(pais.getContinente())) {
					SortedSet<Pais> valor = paisContinente.getValue();
					valor.add(pais);
					paisesContinente.put(pais.getContinente(), valor);
					escrito = true;
				}
			}
			if (!escrito) {
				SortedSet<Pais> prvs2 = new TreeSet<Pais>();
				prvs2.add(pais);
				paisesContinente.put(pais.getContinente(), prvs2);
			}
		}
		return paisesContinente;
	}

	/**
	 * Devuelve una correspondencia ordenada por el orden natural, en la que cada
	 * letra se asocia con el conjunto ordenado, según el orden natural, de paises
	 * que comienzan por dicha letra inicial.
	 * 
	 * @return
	 */

	public SortedMap<String, SortedSet<Pais>> paisesPorInicial() {
		SortedMap<String, SortedSet<Pais>> paisesContinente = new TreeMap<String, SortedSet<Pais>>();
		Iterator<Pais> iter = this.paises.iterator();
		while (iter.hasNext()) {
			Pais pais = iter.next();
			boolean escrito = false;
			for (SortedMap.Entry<String, SortedSet<Pais>> paisContinente : paisesContinente.entrySet()) {
				if (paisContinente.getKey().substring(0, 1).equals(pais.getNombre().substring(0, 1))) {
					SortedSet<Pais> valor = paisContinente.getValue();
					valor.add(pais);
					paisesContinente.put(pais.getNombre().substring(0, 1), valor);
					escrito = true;
				}
			}
			if (!escrito) {
				SortedSet<Pais> prvs2 = new TreeSet<Pais>();
				prvs2.add(pais);
				paisesContinente.put(pais.getNombre().substring(0, 1), prvs2);
			}
		}
		return paisesContinente;
	}

	/**
	 * Devuelve una correspondencia ordenada por el orden natural, en la que cada
	 * continente se asocia con la altura media de entre los paises que pertenecen a
	 * cada continente.
	 */

	public SortedMap<Double, List<Pais>> mediaPorContinente() {

		SortedMap<String, SortedSet<Pais>> paisesContinente = paisesPorContinente();
		SortedMap<Double, List<Pais>> mediaContinente = new TreeMap<Double, List<Pais>>();
		List<Pais> ps = new ArrayList<Pais>();
		for (SortedMap.Entry<String, SortedSet<Pais>> paisContinente : paisesContinente.entrySet()) {
			SortedSet<Pais> paises = paisContinente.getValue();
			double media = 0;
			Iterator<Pais> iter = paises.iterator();
			while (iter.hasNext()) {
				Pais pa = iter.next();
				media += pa.getAltura();
				ps.add(pa);
			}
			mediaContinente.put(media / paises.size(), ps);
		}
		return mediaContinente;
	}

	/**
	 * Devuelve una lista con los nombres de los continentes que tienen el mayor
	 * número de paises. 
	 * 
	 * @return
	 */

	public List<String> continentesConMasPaises() {
		int mayor = 0;
		String continenteMayor = "";
		SortedMap<String, Integer> numeroPaisesContinente = numeroDePaisesPorContinente();
		List<String> continenteMasPaises = new ArrayList<String>();
		for (SortedMap.Entry<String, Integer> paisContinente : numeroPaisesContinente.entrySet()) {
			if (paisContinente.getValue() > mayor) {
				mayor = paisContinente.getValue();
				continenteMayor = paisContinente.getKey();
			}
		}
		continenteMasPaises.add(continenteMayor);
		return continenteMasPaises;
	}
}
