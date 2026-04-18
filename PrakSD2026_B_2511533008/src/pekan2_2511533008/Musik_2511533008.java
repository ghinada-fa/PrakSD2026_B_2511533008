package pekan2_2511533008;
import java.util.ArrayList;

public class Musik_2511533008 {
	private String judul_3008;
	private String penyanyi_3008;
	private int durasi_3008;
	
	public Musik_2511533008 (String judul_3008, String penyanyi_3008, int durasi_3008) {
		this.judul_3008 = judul_3008;
		this.penyanyi_3008 = penyanyi_3008;
		this.durasi_3008 = durasi_3008;
	}
	
	public String getJudul_3008() {return judul_3008;}
	public String getPenyanyi_3008() {return penyanyi_3008;}
	public int getDurasi_3008() {return durasi_3008;}
	
	public void setJudul_3008(String judul_3008) {this.judul_3008 = judul_3008;}
	public void setPenyanyi_3008(String penyanyi_3008) {this.penyanyi_3008 = penyanyi_3008;}
	public void setDurasi_3008(int durasi_3008) {this.durasi_3008 = durasi_3008;}
	
	public void tampilakanInfoMusik_3008() {
		System.out.println("Judul Lagu : " + judul_3008);
		System.out.println("Penyanyi   : " + penyanyi_3008);
		System.out.println("Durasi     : " + durasi_3008 + " detik");
	}

}
