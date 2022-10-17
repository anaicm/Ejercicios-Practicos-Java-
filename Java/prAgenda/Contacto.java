package prAgenda;

public class Contacto {
	
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String telefono;
	
	public Contacto(String nombre,String apellido,String correoElectronico,String telefono) {
		if(!correoElectronico.contains("@")) {
			throw new RuntimeException("El Correo Electrónico no es valido");
		}
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.correoElectronico=correoElectronico;
		this.telefono=telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correo) {
		if(!correoElectronico.contains("@")) {
			throw new RuntimeException("El correo electrónico no es valido");
		}
		correoElectronico=correo;
	}
	public String getTelefono (){
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public String toString() {
		return apellido.toUpperCase()+","+nombre.toUpperCase()+"<"+correoElectronico+">("+telefono+")";
	}
	public boolean sonIguales(Contacto contacto) {
		return contacto.getNombre().equalsIgnoreCase(nombre)&&contacto.getApellido().equalsIgnoreCase(apellido);
	}
}
