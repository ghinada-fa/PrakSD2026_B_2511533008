package pekan1_2511533008;

public final class Mobil_2511533008 {
	private String nama;
	private int tahun;
	private int cc;
	private int harga;
	private String merk;
	
	public Mobil_2511533008 (String nama, int tahun, int cc, int harga, String merk) {
		this.nama = nama;
		this.tahun = tahun;
		this.cc = cc;
		this.harga = harga;
		this.merk = merk;
	}
	//--- Selektor---
	public String getNama() { return nama;}
	public int getTahun() { return tahun;}
	public int getCc() { return cc;}
	public int getHarga() {return harga;}
	public String getMerk() { return merk;}
	
	//---Mutator---
	public void setNama (String nama) {this.nama = nama;}
	public void setTahun (int tahun) {this.tahun = tahun;}
	public void setCc (int cc) {this.cc = cc;}
	public void setHarga (int harga) {this.harga = harga;}
	public void setMerk (String merk) {this.merk = merk;}
	
	//cetak info mobil
	public void tampilkanInfoMobil() {
		System.out.println("Nama    : " + nama);
		System.out.println("Tahun   : " + tahun);
		System.out.println("CC      : " + cc);
		System.out.println("Harga   : Rp. " + harga);
		System.out.println("Merk    : " + merk);
	}

}
