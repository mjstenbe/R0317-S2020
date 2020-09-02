package ihminendemo;

public class Ihminen {

	// Luokkamuuttujat

	private int ik�;
	private double paino;
	private String nimi;

	// Konstruktori
	public Ihminen() {
		ik� = 10;
		paino = 35;
		nimi = "Ei m��ritelty";

	}

	// Aksessorit

	public void setIk�(int uusiIk�) {
		if (uusiIk� > 0) {
			ik� = uusiIk�;
		}
	}

	public int getIk�() {
		return ik�;
	}

	// Sy�-metodi

	public void sy�() {
		paino += 10;
		System.out.println("Nam nam. Painoni on: " + paino);
	}

	// Kuormitetaan metodia - toString
	public String toString() {
		return "Ihminen [ Ik�=" + ik� + " paino= " + paino + " nimi=" + nimi + " ]";

	}
}
