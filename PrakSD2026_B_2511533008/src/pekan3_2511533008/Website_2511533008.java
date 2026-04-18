package pekan3_2511533008;
import java.util.Stack;

public class Website_2511533008 {
	private String judul_3008;
	private String url_3008;
	
	public Website_2511533008 (String judul_3008, String url_3008) {
		this.judul_3008 = judul_3008;
		this.url_3008 = url_3008;
	}
	public String getJudul_3008() {
		return judul_3008;
	}
	public String getUrl_3008() {
		return url_3008;
	}
	public void setJudul_3008(String judul_3008) {this.judul_3008 = judul_3008;}
	public void setUrl_3008(String url_3008) {this.url_3008 = url_3008;}
	
	// override
	public String toString() {
		return judul_3008 + " (" + url_3008 + ")";
	}
	

}
