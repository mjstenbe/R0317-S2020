package tiedostot;
import java.io.Serializable;

public class Kala implements Serializable {

	static int parvenKoko;
	private String laji;
	private double paino;

	public Kala() {
		
	}
	public static int getParvenKoko() {
		return parvenKoko;
	}

	public static void setParvenKoko(int parvenKoko) {
		Kala.parvenKoko = parvenKoko;
	}

	public String getLaji() {
		return laji;
	}

	public void setLaji(String laji) {
		this.laji = laji;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

}
