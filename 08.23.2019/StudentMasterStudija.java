package hijerarhija;

public class StudentMasterStudija extends Student {
	private String smerMasterStudija;

	public StudentMasterStudija(String ime, String prezime, int godinaRodjenja, int trGodStudija, double prosek, String smerMasterStudija) {
		super(ime, prezime, godinaRodjenja, trGodStudija, prosek);
		this.smerMasterStudija = smerMasterStudija;
	}
	

	public String getSmerMasterStudija() {
		return smerMasterStudija;
	}


	public String toString() {
		return "Student master studija\n- smer master = " + smerMasterStudija + "\n- godine studiranja = "
				+ getTrGodStudija() + "\n- prosek = " + getProsek() + "\n- ime = " + getIme() + "\n- prezime = "
				+ getPrezime() + "\n- datum rodjenja = " + getGodinaRodjenja();
	}

}
