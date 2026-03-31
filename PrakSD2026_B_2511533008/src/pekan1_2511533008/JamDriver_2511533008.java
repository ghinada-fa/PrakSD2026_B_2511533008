package pekan1_2511533008;

public class JamDriver_2511533008 {
	public static void main (String[] args) {
		Jam_2511533008 a = new Jam_2511533008(23, 59, 50);
		Jam_2511533008 b = new Jam_2511533008(0, 0, 15);
		System.out.println ("a              = " + a);
		System.out.println ("b              = " + b);
		System.out.println ("a+b            = " + a.plus (b));
		System.out.println ("next 20s       = " + a.nextSeconds(20));
		System.out.println ("durasi(a,b)    = " + Jam_2511533008.durasiDetik(a,b));
		System.out.println ("a.compareTo (b)= " + a.compareTo(b));
	}

}
