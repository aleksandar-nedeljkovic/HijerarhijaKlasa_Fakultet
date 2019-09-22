package hijerarhija;

public class Sluzbenik extends Zaposleni{
	private String odsek;
	
	public Sluzbenik(String ime, String prezime, int godinaRodjenja, int godinaZaposlenja, double plata, String odsek) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
		this.odsek = odsek;
	}

	public String getOdsek() {
		return odsek;
	}

	public String toString() {
		return "Sluzbenik\n- odsek = " + odsek + "\n- godina zaposlenja = " + getGodinaZaposlenja() + "\n- plata = "
				+ getPlata() + "\n- ime = " + getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = "
				+ getGodinaRodjenja();
	}

}
