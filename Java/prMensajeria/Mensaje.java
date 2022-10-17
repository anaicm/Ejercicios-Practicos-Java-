package prMensajeria;

public class Mensaje {
	private String alias;
	private String texto;
	private boolean urgente;
	
	public Mensaje(String alias,String texto,boolean urgente) {
		this.alias=alias;
		this.texto=texto;
		this.urgente=urgente;
	}
	public Mensaje (String alias,String texto) {
		this.alias=alias;
		this.texto=texto;
		this.urgente=false;
	}
	public String getContacto() {
		return alias;
	}
	public String getMensaje() {
		return texto;
	}
	public boolean sonIguales(Mensaje mensaje) {
		if (mensaje.getContacto().equalsIgnoreCase(alias)&&mensaje.getMensaje().equalsIgnoreCase(texto)) {
			return true;
		}
		return false;
	}
	public String toString() {
	
		if(urgente==true) {
			return alias.toUpperCase()+";"+texto+" !!";
		}else {
			return alias.toUpperCase();
		}

	}
}
