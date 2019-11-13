public class PersonalAkte {

	String inhalt;

	PersonalAkte() {
		this.inhalt = "Personalakte: \n\n";

	}

	void personalAkteAnfordern() {

		System.out.println(inhalt);
	}

	void inhaltHinzufuegen(String neuerInhalt) {

		inhalt += neuerInhalt;

	}

}
