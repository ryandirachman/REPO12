public class Balok{
	private int panjang;
	private int lebar;
	private int tinggi;
	
	public Balok(){
		panjang = 0;
		lebar = 0;
		tinggi = 0;
	}
	private int volume(int p, int l, int t){
		return(p*l*t);
	}
	public void setPanjang(int panjang){
		this.panjang = panjang;
	}
	public void setLebar(int lebar){
		this.lebar = lebar;
	}
	public void setTinggi(int tinggi){
		this.tinggi = tinggi;
	}
	public int getPanjang(){
		return panjang;
	}
	public int getLebar(){
		return lebar;
	}
	public int getTinggi(){
		return tinggi;
	}
	public int getVolume(){
		return volume(panjang, lebar, tinggi);
	}
}
	