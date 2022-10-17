package Superficies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Continente {
	private Map<String, Set<Region>> paises;

	protected Continente() {
		this.paises = new TreeMap<String, Set<Region>>();
	}

	public Continente creaContinente(String continente) throws FileNotFoundException {
		Continente cont = new Continente();
		String linea = null;
		String[] datos;
		Region temp = null;
		File nombFich = new File(continente);
		Scanner sc = new Scanner(nombFich);
		while (sc.hasNextLine()) {
			linea = sc.next();
		}
		try {
			datos = linea.split(",");
			temp = new Region(datos[0], datos[1], Double.parseDouble(datos[2]));
		} catch (Exception e) {
			System.out.println("" + linea);
		}
		boolean encontrada = false;
		for (Map.Entry<String, Set<Region>> clave : this.paises.entrySet()) {
			if (clave.getKey().equals(nombFich)) {
				Set<Region> valor = clave.getValue();
				valor.add(temp);
				this.paises.put(clave.getKey(), valor);
				encontrada = true;
			}
		}
		if (!encontrada) {
			Set<Region> value = new TreeSet<Region>();
			value.add(temp);
			this.paises.put(temp.getNomRegion(), value);
		}

		return cont;
	}

	public String[] getPaises() {
		// devuelve una array con los continentes de los paises
		// 1-. creo una lista vacia
		List<String> lista = new ArrayList<String>();
		for (Map.Entry<String, Set<Region>> clave : this.paises.entrySet())
			lista.add(clave.getKey());
		// 2-.crear una array
		String[] array = new String[lista.size()];
		array = lista.toArray(array);

		return array;
	}

	public Set<Region> getRegiones() {
		// hay que devolver una lista por lo que se crea una lista
		Set<Region> conti = new TreeSet<Region>();
		for (Map.Entry<String, Set<Region>> cl : this.paises.entrySet()) {
			String clave = cl.getKey();
			Set<Region> valor = cl.getValue();
			Iterator<Region> iter = valor.iterator();
			while (iter.hasNext()) {
				Region re = iter.next();
				conti.add(re);
			}
		}

		return conti;
	}

	public Map<Double, Set<Region>> regionesPorSuperficie() {
		SortedMap<Double, Set<Region>> regionSuperficie = new TreeMap<Double, Set<Region>>();
		for (Map.Entry<String, Set<Region>> clav : this.paises.entrySet()) {
			String clave = clav.getKey();
			Set<Region> valor = clav.getValue();

			Iterator<Region> iter = valor.iterator();
			while (iter.hasNext()) {
				Region linea = iter.next();
				double superficie = linea.getExtension();
				double superficieTruncada = Math.round(superficie / 10.0) * 10;
				boolean encontrado = false;

				for (Map.Entry<Double, Set<Region>> claves : regionSuperficie.entrySet()) {
					if (claves.getKey().equals(superficieTruncada)) {
						Double a = claves.getKey();
						Set<Region> b = claves.getValue();
						b.add(linea);
						regionSuperficie.put(a, b);
						encontrado = true;
					}

				}
				if (!encontrado) {
					Set<Region> value = new TreeSet<Region>();
					value.add(linea);
					regionSuperficie.put(superficieTruncada, value);
				}

			}

		}
		return regionSuperficie;
	}

	public Map<String, Double> mediasPorPais() {
		Map<String, Double> mPais = new TreeMap<String, Double>();
		for (Map.Entry<String, Set<Region>> clave : this.paises.entrySet()) {
			Set<Region> pais = clave.getValue();
			double media = 0;
			Iterator<Region> iter = pais.iterator();
			while (iter.hasNext()) {
				Region ps = iter.next();
				media += ps.getExtension();
				mPais.put(clave.getKey(), media / pais.size());

			}

		}

		return mPais;

	}
}
