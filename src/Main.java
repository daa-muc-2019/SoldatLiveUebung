
public class Main {

	
	public static void main(String[] args) {

		Soldat erika = new Soldat();
		
//		erika.halloAnAlle();
//		erika.personalAkteAnfordern();
		erika.inhaltInAkteHinzufuegen("Alles tadellos!");
//		erika.personalAkteAnfordern();
		
		System.out.println(erika.antreten());
		
		Soldat paul = new Soldat(32, "paul");
		System.out.println("Der Soldat paul ist: " + paul.getAlter() + " Jahre alt.");
		paul.wirdAelter(5);
		System.out.println("Der Soldat paul ist: " + paul.getAlter() + " Jahre alt.");
		
		paul.inhaltInAkteHinzufuegen("Soldat paul ist momentan extrem duennhaeutig und gelobt besserung");
		paul.personalAkteAnfordern();
		
		Soldat[] soldatenArray = {erika,  paul, erika};
		
		Zug neuerZug = new Zug(soldatenArray, "testZug");
		
		neuerZug.alleAntreten();
		
	}

}
