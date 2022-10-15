package claseSuma_Resta;

public class SumaResta {
	private int numero1;
	private int numero2;

	public SumaResta(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int Suma() {
		return this.numero1 + this.numero2;
	}

	public int Resta() {
		return this.numero1 - this.numero2;
	}
}
