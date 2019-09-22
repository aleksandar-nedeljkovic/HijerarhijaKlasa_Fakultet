package hijerarhija;

public class Asistent extends Nastavnik {
	private String smerDoktorskihStudija;
	
	public Asistent(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata, String omiljeniPredmet, String smerDoktorskihStudija) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet);
		this.smerDoktorskihStudija = smerDoktorskihStudija;
	}
	

	public String getSmerDoktorskihStudija() {
		return smerDoktorskihStudija;
	}


	public String toString() {
		return "Asistent\n smer doktorskih = " + smerDoktorskihStudija + "\n- omiljeni predmet = " + getOmiljeniPredmet()
				+ "\n- godina zaposlenja = " + getGodinaZaposlenja() + "\n- plata = " + getPlata() + "\n- ime = "
				+ getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
