package claseSuma_Resta;

public class MainSumaResta {

	public static void main(String[] args) {
		
		SumaResta sr =new SumaResta(7,8);
		SumaResta sr1 =new SumaResta(6,2);
		SumaResta2 sr2 = new SumaResta2();
		sr2.Suma(5, 7);
		
		int sum = sr.Suma();
		int rest = sr.Resta();
		System.out.println(sum);
		System.out.println(rest);
		System.out.println(sr1.Resta());
		System.out.println(sr2.Suma(5, 7));
	}

}
