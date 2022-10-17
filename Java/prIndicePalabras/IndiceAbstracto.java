package prIndicePalabras;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IndiceAbstracto implements Indice {
	protected List<String> frases;

	public IndiceAbstracto() {
		frases=new ArrayList<String>();//inicializa la cadena
	}

	@Override
	public void agregarFrase(String frase) {
		frases.add(frase);

	}

	@Override
	public void resolver(String delimitadores) {
		

	}

	@Override
	public void presentarIndice(PrintWriter pw) {
		pw.println();

	}

	@Override
	public void presentarIndiceConsola() {
		PrintWriter pw=new PrintWriter(System.out);
		presentarIndice(pw);

	}

}
