package hijerarhija;

public class Covek {
	private String ime;
	private String prezime;
	private int godinaRodjenja;

	public Covek(String ime, String prezime, int godinaRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	@Override
	public String toString() {
		return "Covek [ime=" + ime + ", prezime=" + prezime + ", godinaRodjenja=" + godinaRodjenja + "]";
	}

}
