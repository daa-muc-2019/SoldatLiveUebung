public class Soldat {

	int alter;
	Dienstgrad dienstgrad;
	String name;
	PersonalAkte meinePersonalAkte;

	public Soldat() {

		this.alter = 20;
		this.dienstgrad = Dienstgrad.UNTEROFFIZIER;
		this.name = "Erika Musterfrau";
		this.meinePersonalAkte = new PersonalAkte();

	}

	public Soldat(int alter) {
		this.alter = alter;
	}

	public Soldat(int alter, String neuerName) {
		this.dienstgrad = Dienstgrad.GEFREITER;
		name = neuerName;
		this.alter = alter;
		this.meinePersonalAkte = new PersonalAkte();
	}

	void halloAnAlle() {

		System.out.println("Hallo ich bin: " + name + " Und bin " + alter
				+ " Jahre alt");
	}

	void wirdAelter() {
		this.alter = alter + 1;
	}

	void wirdAelter(int neuesAlter) {
		this.alter += neuesAlter;
	}

	int getAlter() {
		return this.alter;
	}
	
	void setAlter(int neuesAlter) {
		this.alter = neuesAlter;
	}

	void personalAkteAnfordern() {
		meinePersonalAkte.personalAkteAnfordern();
	}

	void inhaltInAkteHinzufuegen(String neuerInhalt) {
		meinePersonalAkte.inhaltHinzufuegen(neuerInhalt);
	}
	
	String antreten() {
		String output;
		output = "Name: " + this.name + ", " 
		+ this.alter + " Jahre alt.";
		return output;
		
		//return "Name: " + this.name + ", " 
		//		+ this.alter + " Jahre alt.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
