package ihminendemo;

public class Omena {

	public String väri;
	public String lajike;
	public double paino;

	public void setLajike(String uusi) {
		this.lajike = uusi;
	}

	public void setVäri(String uusi) {
		this.väri = uusi;
	}

	public void setPaino(double uusi) {
		this.paino = uusi;
	}

	public String getVäri() {
		return väri;
	}

	public String getLajike() {
		return lajike;
	}

	public double getPaino() {
		return paino;
	}

	public String toString() {
		return "Omena: Lajike: " + this.lajike + ", Väri: " + this.väri + ".";
	}
}