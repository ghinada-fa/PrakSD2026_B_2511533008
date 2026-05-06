package pekan5_2511533008;

public class Pasien_2511533008 {
	private String namaPasien_3008;
    private String penyakit_3008;
    private int nomorAntrian_3008;
    private Pasien_2511533008 next_3008;

    public Pasien_2511533008(String nama_3008, String penyakit_3008, int nomor_3008) {
        this.namaPasien_3008 = nama_3008;
        this.penyakit_3008 = penyakit_3008;
        this.nomorAntrian_3008 = nomor_3008;
        this.next_3008 = null;
    }

    public String getNamaPasien_3008() { return namaPasien_3008; }
    public String getPenyakit_3008() { return penyakit_3008; }
    public int getNomorAntrian_3008() { return nomorAntrian_3008; }
    public Pasien_2511533008 getNext_3008() { return next_3008; }

    public void setNext_3008(Pasien_2511533008 next) { this.next_3008 = next; }

}
