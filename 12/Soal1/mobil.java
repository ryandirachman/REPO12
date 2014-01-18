class mobil extends transport{
	public void methodRoda(){
		super.methodKendaraan();
		System.out.println("mobil punya jumlah roda = 4");
	}
	public void methodAksi(){
		System.out.println("mobil dapat bergerak mundur");
	}
	public static void main(String[] args){
		mobil oks = new mobil();
		oks.methodRoda();
		oks.methodAksi();
	}
}