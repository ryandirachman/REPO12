class motor extends transport{
	public void methodRoda(){
		super.methodKendaraan();
		System.out.println("motor punya jumlah roda = 2");
	}
	public void methodAksi(){
		System.out.println("motor dapat melakukan jumping");
	}
	public static void main(String[] args){
		motor oks = new motor();
		oks.methodRoda();
		oks.methodAksi();
	}
}