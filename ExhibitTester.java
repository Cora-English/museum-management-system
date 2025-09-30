package part02;



public class ExhibitTester {
	private static Exhibit e = new Exhibit("Tester");
	private static Artifact a1 = new Artifact("Tester",ArtifactType.OTHER,25);
	private static Artifact a2 = new Artifact("Tester",ArtifactType.OTHER,25);
	private static Artifact a3 = new Artifact("Tester",ArtifactType.OTHER,25);
	private static Artifact a4 = new Artifact("Tester",ArtifactType.OTHER,25);
	private static Artifact a5 = new Artifact("Tester",ArtifactType.OTHER,25);

	public static void main(String[] args) {
		testSetNameNull();
		testSetNameEmpty();
		testAddArtifactExhibit();
		testUpdateArtifact();
		
		
	}
	
	private static void testSetNameNull() {
		e.getRoute().clear();
		e.setName(null);
		if(e.getName()=="Unknown") {
			System.out.println("testSetNameNull passed");
		} else {
			System.out.println("testSetNameNull failed : expected Unknown but got: "+e.getName());
		}
	}
	private static void testSetNameEmpty() {
		e.setName("");
		if(e.getName()=="Unknown") {
			System.out.println("testSetNameEmpty passed");
		} else {
			System.out.println("testSetNameEmpty failed : expected Unknown but got: "+e.getName());
		}
	}
	private static void testAddArtifactExhibit() {
		e.getRoute().clear();
		e.addArtifactExhibit(a1, "test");
		e.addArtifactExhibit(a2, "test");
		e.addArtifactExhibit(a3, "test");
		e.addArtifactExhibit(a4, "test");
		e.addArtifactExhibit(a5, "test");
		if(e.getRoute().size()==5) {
			System.out.println("testAddArtifactExhibit passed");
		}
		else {
			System.out.println("testAddArtifactExhibit failed: expected size 5 but got: "+e.getRoute().size());
		}
		
	}

	private static void  testUpdateArtifact() {
	e.getRoute().clear();
	e.addArtifactExhibit(a1, "test");
	e.addArtifactExhibit(a2, "test");
	e.addArtifactExhibit(a3, "test");
	e.addArtifactExhibit(a4, "test");
	e.addArtifactExhibit(a5, "test"); 
	e.updateArtifact(0, "newName", 35, ArtifactType.ARTWORK, "newSign");
	if(!e.getArtifact(0).getName().equals("newName") ||
	   e.getArtifact(0).getEngTime() != 35 ||
	   !e.getArtifact(0).getType().equals(ArtifactType.ARTWORK) ||
	   !e.getSign(0).equals("newSign")) {
		System.out.println("testUpdateArtifact failed.");
	} else {
		System.out.println("testUpdateArtifact passed");
	}
		
}

}
