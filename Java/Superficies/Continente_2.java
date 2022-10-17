package Superficies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Continente_2 {
	private Map<String,Set<Region>> regiones;
	
	protected Continente_2() {
		regiones=new TreeMap<String,Set<Region>>();
	}
	public Continente creaContinente(String regiones) throws FileNotFoundException {
		String linea;
		String [] datos;
<		File nombFich=new File(regiones);
		Scanner sc=new Scanner(nombFich);
		while(sc.hasNextLine()) {
			linea=sc.next();
		}
		try {
			datos= linea.split(",");
		}catch (Exception e){
			System.out.println("La linea no es valida: "+linea);
		}
		
		
		
		
		for(Map.Entry<String, Set<Region>> clave:this.regiones.entrySet()) {
			
		}
		
		
		
		
		
		
		return null;
	}
	
	
}
