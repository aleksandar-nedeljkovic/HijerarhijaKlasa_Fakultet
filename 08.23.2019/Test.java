package hijerarhija;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Bojan", "Bosnjak", 1957, 20, 9.50);
		System.out.println(s1);

		StudentOsnovnihStudija so1 = new StudentOsnovnihStudija("Stefan", "Vukasinovic", 1987, 2, 10.00, "Java Script");
		System.out.println(so1);

		StudentMasterStudija sm1 = new StudentMasterStudija("Marija", "Stosic", 1992, 1, 9.90, "SAP");
		System.out.println(sm1);

		Nastavnik n1 = new Nastavnik("Cvijan", "Nepoznati", 1998, 2019, 147000.00, "Java");
		n1.dodajPredmet("Java");
		n1.dodajPredmet("QA");
		n1.dodajPredmet("C");
		System.out.println(n1);

		Profesor p1 = new Profesor("Zoran", "Milicevic", 1996, 2018, 260000.00, "Java", "redovni");
		System.out.println(p1);

		Asistent a1 = new Asistent("Mica", "Trofrtaljka", 1955, 1972, 88000.00, "Cobol", "Fortran");
		System.out.println(a1);

		Sluzbenik sl1 = new Sluzbenik("Jelena", "Karleusa", 1979, 2001, 786000.00, "cistacica");
		System.out.println(sl1);
	}

}
