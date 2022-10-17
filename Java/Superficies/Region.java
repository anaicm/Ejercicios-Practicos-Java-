package Superficies;

public class Region implements Comparable <Region> {
	private String nomRegion;
	private String pais;
	private double extension;
	/**
	 * @param nomRegion
	 * @param pais
	 * @param extension
	 */
	public Region(String nomRegion, String pais, double extension) {
		if(nomRegion==null&& pais==null||nomRegion.isEmpty()&&pais.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.nomRegion = nomRegion;
		this.pais = pais;
		this.extension = extension;
	}
	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the extension
	 */
	public double getExtension() {
		return extension;
	}
	/**
	 * @param extension the extension to set
	 */
	public void setExtension(double extension) {
		this.extension = extension;
	}
	@Override
	public boolean equals(Object o) {
		boolean iguales=false;
		if(o instanceof Region) {
			Region pl=(Region)o;
			iguales=this.nomRegion.equalsIgnoreCase(pl.nomRegion)&&this.pais.equalsIgnoreCase(pl.pais);
			
		}
		return iguales;
	}
	@Override
	public int hashCode() {
		return this.nomRegion.hashCode()+this.pais.hashCode();
	}
	@Override
	public int compareTo(Region o) {
		
		return this.nomRegion.compareTo(o.nomRegion);
	}
	

}
