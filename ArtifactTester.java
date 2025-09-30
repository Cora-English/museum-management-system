package part02;


public class ArtifactTester {
	private static Artifact a = new Artifact("Tester",ArtifactType.OTHER,25);

	public static void main(String[] args) {
		testSetNameNull();
		testSetEngTime();
		testSetNameEmpty();

	}
	private static void testSetNameNull() {
		a.setName(null);
		if(a.getName().equals("Unknown")) {
			System.out.println("testSetNameNull passed");
			
		}
		else {
			System.out.println("testSetNameNull failed: expected Unknown but got "+a.getName());
		}
	}
	private static void testSetNameEmpty() {
		a.setName("");
		if(a.getName().equals("Unknown")) {
			System.out.println("testSetNameEmpty passed");
			
		}
		else {
			System.out.println("testSetNameEmpty failed: expected Unknown but got "+a.getName());
		}
	}
	private static void testSetEngTime() {
		a.setEngTime(-5);
		if(a.getEngTime()==0) {
			System.out.println("testSetEngTime passed");
		}
		else {
			System.out.println("testSetEngTime failed: expected Unknown but got"+a.getEngTime());
		}
	}

}
