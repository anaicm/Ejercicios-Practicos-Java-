package prIndicePalabras;

import java.io.PrintWriter;

public interface Indice {
	public void agregarFrase(String frase);
	public void resolver(String delimitadores);
	public void presentarIndice(PrintWriter pw);
	public void presentarIndiceConsola();
	
	
	
	
	
}
