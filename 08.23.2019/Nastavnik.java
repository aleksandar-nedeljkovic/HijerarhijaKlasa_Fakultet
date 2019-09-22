package hijerarhija;

import java.util.Arrays;

public class Nastavnik extends Zaposleni{
	private String omiljeniPredmet;
	private String[] predmeti;
	private int brojPredmeta;

	public Nastavnik(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata, String omiljeniPredmet) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
		this.omiljeniPredmet = omiljeniPredmet;
		this.predmeti = new String[3];
	}

	public void dodajPredmet(String predmet) {
		predmeti[brojPredmeta] = predmet;
		brojPredmeta++;
	}

	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}

	public String[] getPredmeti() {
		return predmeti;
	}

	public String toString() {
		return "Nastavnik\n- omiljeni predmet = " + omiljeniPredmet + "\n- predmeti = " + Arrays.toString(predmeti)
				+ "\n- godina zaposlenja = " + getGodinaZaposlenja() + "\n- plata = " + getPlata() + "\n- ime = "
				+ getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
