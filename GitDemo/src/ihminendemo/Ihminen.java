package ihminendemo;

public class Ihminen {

	// Luokkamuuttujat
	static int lkm;

	private int ikä;
	private double paino;
	private String nimi;

	private Omena[] reppu;

	// Konstruktori
	public Ihminen() {
		ikä = (int) (Math.random() * 100);
		paino = 35;
		nimi = "Ei määritelty";
		lkm++;
		reppu = new Omena[10];
	}

	public Ihminen(String uusiNimi) {
		this();
		nimi = uusiNimi;
	};

	public Ihminen(String uusiNimi, int uusiIkä, double uusiPaino) {
		this();
		nimi = uusiNimi;
		ikä = uusiIkä;
		paino = uusiPaino;
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

	// Syä-metodi

	public void syä() {
		paino += 10;
		System.out.println("Nam nam. Painoni on: " + paino);
	}

	public void kerääOmena(int i) {
		this.reppu[i] = new Omena(); 
	}

	// Kuormitetaan metodia - toString
	public String toString() {
		return "Ihminen [ Ikä=" + ikä + " paino= " + paino + " nimi=" + nimi + " lkm: " + lkm + "]";

	}
}
