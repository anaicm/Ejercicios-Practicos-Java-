package prMensajeria;

public class Tweet extends Mensaje {
	private int longitud=140;
	
	public Tweet(String alias,String texto,boolean urgente,int longitud) {
		super(alias,texto,urgente);
		this.longitud=longitud;
	}
	public String toString() {
		return super.toString();
	}
	
}
