package hijerarhija;

public class Student extends Covek {
	private int trGodStudija;
	private double prosek;

	public Student(String ime, String prezime, int godinaRodjenja, int trGodStudija, double prosek) {
		super(ime, prezime, godinaRodjenja);
		this.trGodStudija = trGodStudija;
		this.prosek = prosek;
	}
	

	public int getTrGodStudija() {
		return trGodStudija;
	}


	public double getProsek() {
		return prosek;
	}

	public String toString() {
		return "Student\n- godine studiranja = " + trGodStudija + "\n\t- prosek = " + prosek + "\n- ime = "
				+ getIme() + "\n- prezime = " + getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
