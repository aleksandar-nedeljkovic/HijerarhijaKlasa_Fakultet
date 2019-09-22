package hijerarhija;

public class Zaposleni extends Covek {
	private int godinaZaposlenja;
	private double plata;

	public Zaposleni(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata) {
		super(ime, prezime, godinaRodjenja);
		this.godinaZaposlenja = godinaZaposlenja;
		this.plata = plata;
	}

	public int getGodinaZaposlenja() {
		return godinaZaposlenja;
	}

	public double getPlata() {
		return plata;
	}

	public String toString() {
		return "Zaposleni\n- godina zaposlenja = " + godinaZaposlenja + "\n- plata = " + plata + "\n- ime = "
				+ getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
