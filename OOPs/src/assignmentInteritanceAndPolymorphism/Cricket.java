package assignmentInteritanceAndPolymorphism;
//Create class IPLTeam with method play. Create child classes of IPLTeam
//called as CSK, RCB. In main, call play from child class objects.
public class Cricket {

	 public static void main(String[] args) {
	     CSK csk = new CSK();
	     RCB rcb = new RCB();

	     System.out.println("CSK playing:");
	     csk.play();

	     System.out.println();
	     System.out.println("RCB playing:");
	     rcb.play();
	 }
}

class IPLTeam {
	void play() {
		System.out.println("Playing in IPL.");
	}
}

class CSK extends IPLTeam {

}


class RCB extends IPLTeam {

}

