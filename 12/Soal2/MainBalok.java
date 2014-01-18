public class MainBalok{
	public static void main(String[] args){
		Balok bk = new Balok();
		bk.setPanjang(10);
		bk.setLebar(6);
		bk.setTinggi(2);
		System.out.println("Panjang		: "+ bk.getPanjang());
		System.out.println("Lebar		: "+ bk.getLebar());
		System.out.println("Tinggi	: "+ bk.getTinggi());
		System.out.println("Volume	: "+ bk.getVolume());
	}
}
		