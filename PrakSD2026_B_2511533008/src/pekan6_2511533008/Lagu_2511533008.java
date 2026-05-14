package pekan6_2511533008;

public class Lagu_2511533008 {
	//mendefinisikan kelas lagu
		String judul_3008;
		String penyanyi_3008;
		Lagu_2511533008 next_3008; //pointer ke next node
		Lagu_2511533008 prev_3008; //pointer ke previous node
		
		//konstruktor
		public Lagu_2511533008(String judul_3008, String penyanyi_3008) {
			this.judul_3008 = judul_3008;
			this.penyanyi_3008 = penyanyi_3008;
			this.next_3008 = null;
			this.prev_3008 = null;
		}
		
		//getter
		public String getJudul_3008() {return judul_3008;}
		public String getPenyanyi_3008() {return penyanyi_3008;}
		
		//setter
		public void setJudul_3008(String judul_3008) {this.judul_3008 = judul_3008;}
		public void setPenyanyi_3008(String penyanyi_3008) {this.penyanyi_3008 = penyanyi_3008;}

}
