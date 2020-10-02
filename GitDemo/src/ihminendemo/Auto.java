package ihminendemo;

public class Auto {

	int nopeus;
	String väri;
	String rekNro;
	String omistaja;
	int valmistusvuosi;
	
	
	
	
	public Auto(int nopeus, String väri, String rekNro, String omistaja, int valmistusvuosi) {
		
		this.nopeus = nopeus;
		this.väri = väri;
		this.rekNro = rekNro;
		this.omistaja = omistaja;
		this.valmistusvuosi = valmistusvuosi;
	}
	/**
	 * @return the nopeus
	 */
	public int getNopeus() {
		return nopeus;
	}
	/**
	 * @param nopeus the nopeus to set
	 */
	public void setNopeus(int nopeus) {
		this.nopeus = nopeus;
	}
	/**
	 * @return the väri
	 */
	public String getVäri() {
		return väri;
	}
	/**
	 * @param väri the väri to set
	 */
	public void setVäri(String väri) {
		this.väri = väri;
	}
	/**
	 * @return the rekNro
	 */
	public String getRekNro() {
		return rekNro;
	}
	/**
	 * @param rekNro the rekNro to set
	 */
	public void setRekNro(String rekNro) {
		this.rekNro = rekNro;
	}
	/**
	 * @return the omistaja
	 */
	public String getOmistaja() {
		return omistaja;
	}
	/**
	 * @param omistaja the omistaja to set
	 */
	public void setOmistaja(String omistaja) {
		this.omistaja = omistaja;
	}
	/**
	 * @return the valmistusvuosi
	 */
	public int getValmistusvuosi() {
		return valmistusvuosi;
	}
	/**
	 * @param valmistusvuosi the valmistusvuosi to set
	 */
	public void setValmistusvuosi(int valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}
	@Override
	public String toString() {
		return "Auto [nopeus=" + nopeus + ", väri=" + väri + ", rekNro=" + rekNro + ", omistaja=" + omistaja
				+ ", valmistusvuosi=" + valmistusvuosi + "]";
	}
	
	

}
