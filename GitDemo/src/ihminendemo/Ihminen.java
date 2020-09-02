package ihminendemo;

public class Ihminen {

	// Luokkamuuttujat

	private int ikä;
	private double paino;
	private String nimi;

	// Konstruktori
	public Ihminen() {
		ikä = 10;
		paino = 35;
		nimi = "Ei määritelty";

	}

	// Aksessorit

	public void setIkä(int uusiIkä) {
		if (uusiIkä > 0) {
			ikä = uusiIkä;
		}
	}

	public int getIkä() {
		return ikä;
	}

	// Syö-metodi

	public void syö() {
		paino += 10;
		System.out.println("Nam nam. Painoni on: " + paino);
	}

	// Kuormitetaan metodia - toString
	public String toString() {
		return "Ihminen [ Ikä=" + ikä + " paino= " + paino + " nimi=" + nimi + " ]";

	}
}
