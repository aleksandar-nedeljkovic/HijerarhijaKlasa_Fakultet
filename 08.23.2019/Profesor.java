package hijerarhija;

public class Profesor extends Nastavnik {
	private String titula;
	
	public Profesor(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata, String omiljeniPredmet, String titula) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet);
		this.titula = titula;
	}

	public String getTitula() {
		return titula;
	}

	public String toString() {
		return "Profesor\n- titula = " + titula + "\n- omiljeni predmet = " + getOmiljeniPredmet()
				+ "\n- godina zaposlenja = " + getGodinaZaposlenja() + "\n- plata = " + getPlata() + "\n- ime = "
				+ getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
