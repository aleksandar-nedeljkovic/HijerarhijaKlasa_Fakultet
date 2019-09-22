package hijerarhija;

public class StudentOsnovnihStudija extends Student {
	private String smerOsnovnihStudija;

	public StudentOsnovnihStudija(String ime, String prezime, int godinaRodjenja, int trGodStudija, double prosek,
			String smerOsnovnihStudija) {
		super(ime, prezime, godinaRodjenja, trGodStudija, prosek);
		this.smerOsnovnihStudija = smerOsnovnihStudija;
	}
	
	public String getSmerOsnovnihStudija() {
		return smerOsnovnihStudija;
	}

	public String toString() {
		return "Student osnovnih studija\n\t- smer osnovnih studija = " + smerOsnovnihStudija + "\n- godina studija = "
				+ getTrGodStudija() + "\n- prosek = " + getProsek() + "\n- ime = " + getIme() + "\n- prezime = "
				+ getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
