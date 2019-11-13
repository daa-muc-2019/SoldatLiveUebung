
public class Zug {

	String name;
	Soldat[] soldat;
	
	public Zug(Soldat[] neuerSoldaten, String name){
		this.name = name;
		this.soldat = neuerSoldaten;
	}
	
	void alleAntreten() {
		//gibt die Länge des Arrays zurück
		int arrayLaenge = soldat.length;
		
		System.out.println("Zug: " +this.name + "tritt an:");
		
		for(int i =0; i < soldat.length; i++) {

			String output = soldat[i].antreten();
			
			System.out.println(output);
		}
		
		
	}
	
}









