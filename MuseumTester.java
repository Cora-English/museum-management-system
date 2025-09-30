package part02;

import java.util.ArrayList;
public class MuseumTester {

	private static Museum m = new Museum("testMuseum");
	private static Artifact a1 = new Artifact("Apple",ArtifactType.OTHER,25);
	private static Artifact a2 = new Artifact("Pear",ArtifactType.OTHER,25);
	private static Artifact a3 = new Artifact("Banana",ArtifactType.PAINTING,25);
	private static Artifact a4 = new Artifact("Orange",ArtifactType.ARTWORK,25);
	private static Artifact a5 = new Artifact("Grape",ArtifactType.OTHER,25);
	private static Artifact a6 = new Artifact("Cherry",ArtifactType.DIGITAL,25);

	private static Exhibit e1 = new Exhibit("Apple");
	private static Exhibit e2 = new Exhibit("Pear");
	private static Exhibit e3 = new Exhibit("Banana");
	private static Exhibit e4= new Exhibit("Orange");
	private static Exhibit e5 = new Exhibit("Grape");
	private static Exhibit e6 = new Exhibit("Cherry");

	public static void main(String[] args) {
		testUpdateArtifact();
		testUpdateExhibit();
		testSortArtifacts();
		testSortArtifactsEmpty();
		testSortArtifactsOne();
		testSortArtifactsPreSorted();
		testSortExhibits();
		testSortExhibitsEmpty();
		testSortExhibitsOne();
		testSortExhibitsPreSorted();
		testResultOfExhibitName();
		testSearchExhibitID();
		testResultOfArtifactName();
		testSearchArtifactID();
		testResultArtifactType();


	}
	private static void testUpdateArtifact() {
		m.getCollection().clear();
		m.addArtifact(a1);
		m.addArtifact(a2);
		m.addArtifact(a3);
		m.addArtifact(a4);
		m.addArtifact(a5);
		m.updateArtifact(0, "newName",ArtifactType.ARTWORK,35);
		if(!m.getArtifactName(0).equals("newName") || 
				!m.getArtifact(0).getType().equals(ArtifactType.ARTWORK) ||
				m.getArtifact(0).getEngTime() !=35) {
			System.out.println("testUpdateArtifact failed");
		} else {
			System.out.println("testUpdateArtifact passed");
		}
	}
	private static void testUpdateExhibit() {
		m.addExhibit(e1);
		m.updateExhibit(0,"earthy");
		String updateName = "earthy";
		if(m.getExhibitName(0).equals(updateName)) {
			System.out.println("testUpdateExhibit passed");
		}
		else {
			System.out.println("testUpdateExhibit failed");
		}
	}

	private static void testSortArtifacts() {
		m.getCollection().clear();
		m.addArtifact(a2);
		m.addArtifact(a3);
		m.addArtifact(a4);
		m.addArtifact(a5);
		m.addArtifact(a6); 
		m.sortArtifacts();
		if(
				!m.getArtifact(0).getName().equals("Banana") ||
				!m.getArtifact(1).getName().equals("Cherry") ||
				!m.getArtifact(2).getName().equals("Grape") ||
				!m.getArtifact(3).getName().equals("Orange") ||
				!m.getArtifact(4).getName().equals("Pear")) {
			System.out.println("testSortArtifacts failed.");
		} else {
			System.out.println("testSortArtifacts passed.");
		}

	}
	private static void testSortArtifactsEmpty() {
		m.getCollection().clear(); 
		m.sortArtifacts();
		if(m.getCollection().size()>0) {
			System.out.println("testSortArtifactsEmpty failed.");
		} else {
			System.out.println("testSortArtifactsEmpty passed.");
		}

	}
	private static void testSortArtifactsOne() {
		m.getCollection().clear(); 
		m.addArtifact(a2);
		m.sortArtifacts();
		if(!m.getArtifact(0).equals(a2)) {
			System.out.println("testSortArtifactsOne failed.");
		} else {
			System.out.println("testSortArtifactsOne passed.");
		}

	}
	private static void testSortArtifactsPreSorted() {
		m.getCollection().clear(); 
		m.addArtifact(a3);
		m.addArtifact(a6);
		m.addArtifact(a5);
		m.addArtifact(a4);
		m.addArtifact(a2);
		m.sortArtifacts();

		if(
				!m.getArtifact(0).getName().equals("Banana") ||
				!m.getArtifact(1).getName().equals("Cherry") ||
				!m.getArtifact(2).getName().equals("Grape") ||
				!m.getArtifact(3).getName().equals("Orange") ||
				!m.getArtifact(4).getName().equals("Pear")) {
			System.out.println("testSortArtifactsPreSorted failed.");
		} else {
			System.out.println("testSortArtifactsPreSorted passed.");
		}

	}
	private static void testSortExhibits() {
		m.getExhibits().clear();

		m.addExhibit(e2);
		m.addExhibit(e3);
		m.addExhibit(e4);
		m.addExhibit(e5); 
		m.addExhibit(e6);
		m.sortExhibits();
		if(
				!m.getExhibit(0).getName().equals("Banana") ||
				!m.getExhibit(1).getName().equals("Cherry") ||
				!m.getExhibit(2).getName().equals("Grape") ||
				!m.getExhibit(3).getName().equals("Orange") ||
				!m.getExhibit(4).getName().equals("Pear")) {
			System.out.println("testSortExhibits failed.");
		} else {
			System.out.println("testSortExhibits passed.");
		}

	}
	private static void testSortExhibitsEmpty() {
		m.getExhibits().clear(); 
		m.sortExhibits();
		if(m.getExhibits().size()>0) {
			System.out.println("testSortExhibitsEmpty failed.");
		} else {
			System.out.println("testSortExhibitsEmpty passed.");
		}

	}
	private static void testSortExhibitsOne() {
		m.getExhibits().clear(); 
		m.addExhibit(e2);
		m.sortArtifacts();
		if(!m.getExhibit(0).equals(e2)) {
			System.out.println("testSortExhibitsOne failed.");
		} else {
			System.out.println("testSortExhibitsOne passed.");
		}

	}
	private static void testSortExhibitsPreSorted() {
		m.getExhibits().clear();
		m.addExhibit(e3);
		m.addExhibit(e6);
		m.addExhibit(e5);
		m.addExhibit(e4);
		m.addExhibit(e2); 
		m.sortExhibits();

		if(
				!m.getArtifact(0).getName().equals("Banana") ||
				!m.getArtifact(1).getName().equals("Cherry") ||
				!m.getArtifact(2).getName().equals("Grape") ||
				!m.getArtifact(3).getName().equals("Orange") ||
				!m.getArtifact(4).getName().equals("Pear")) {
			System.out.println("testSortArtifactsPreSorted failed.");
		} else {
			System.out.println("testSortArtifactsPreSorted passed.");
		}

	}
	private static void testResultOfExhibitName() {
		m.getExhibits().clear();
		m.addExhibit(e2);
		m.addExhibit(e3);
		m.addExhibit(e4);
		m.addExhibit(e5);
		m.addExhibit(e6); 
		m.sortExhibits();

		//Test case 1 - searching for an exact match
		ArrayList<Exhibit> result1 = m.resultOfExhibitName("Banana");
		if(result1.size()==1 && result1.get(0).getName().equals("banana")) {
			System.out.println("testResultofExhibitName1 passed");
		} else {
			System.out.println("testResultofExhibitName1 failed");
		}
		//Test case 2 - searching for a partial match
		ArrayList<Exhibit> result2 = m.resultOfExhibitName("an");
		if(result2.size()==2 && result2.get(0).getName().equals("banana") && result2.get(1).getName().equals("orange")) {
			System.out.println("testResultofExhibitName2 passed");
		} else {
			System.out.println("testResultofExhibitName2 failed");
		}
		//Test case 3 - search for last exhibit
		ArrayList<Exhibit> result3 = m.resultOfExhibitName("Pear");
		if(result3.size()==1 && result3.get(0).getName().equals("pear")) {
			System.out.println("testResultofExhibitName3 passed");
		} else {
			System.out.println("testResultofExhibitName3 failed");
		}
		//Test case 4 - search for non-existing exhibit
		ArrayList<Exhibit> result4 = m.resultOfExhibitName("Pineapple");
		if(result4.size()==0) {
			System.out.println("testResultofExhibitName4 passed");
		} else {
			System.out.println("testResultofExhibitName4 failed");
		}	
	}
	private static void testSearchExhibitID() {
		m.getExhibits().clear();
		m.addExhibit(e2);
		m.addExhibit(e3);
		m.addExhibit(e4);
		m.addExhibit(e5);
		m.addExhibit(e6); 


		//Test case 1-search for exhibit within index range
		if(m.searchExhibitID(2)==0) {
			System.out.println("testSearchExhibitID1 passed");
		} else {
			System.out.println("testSearchExhibitID1 failed");
		}	

		//Test case 2-search for exhibit outside index range
		if(m.searchExhibitID(7)==-1) {
			System.out.println("testSearchExhibitID2 passed");
		} else {
			System.out.println("testSearchExhibitID2 failed");
		}
		//Test case 3-search for exhibit outside index range
		if(m.searchExhibitID(-5)==-1) {
			System.out.println("testSearchExhibitID3 passed");
		} else {
			System.out.println("testSearchExhibitID3 failed");
		}

	}
	private static void testResultOfArtifactName() {
		m.getCollection().clear();
		m.addArtifact(a2);
		m.addArtifact(a3);
		m.addArtifact(a4);
		m.addArtifact(a5);
		m.addArtifact(a6); 
		m.sortArtifacts();

		//Test case 1 - searching for an exact match
		ArrayList<Artifact> result1 = m.resultOfArtifactName("Banana");
		if(result1.size()==1 && result1.get(0).getName().equals("banana")) {
			System.out.println("testResultofArtifactName1 passed");
		} else {
			System.out.println("testResultofArtifactName1 failed");
		}
		//Test case 2 - searching for a partial match
		ArrayList<Artifact> result2 = m.resultOfArtifactName("an");
		if(result2.size()==2 && result2.get(0).getName().equals("banana") && result2.get(1).getName().equals("orange")) {
			System.out.println("testResultofArtifactName2 passed");
		} else {
			System.out.println("testResultofArtifactName2 failed");
		}
		//Test case 3 - search for last Artifact
		ArrayList<Artifact> result3 = m.resultOfArtifactName("Pear");
		if(result3.size()==1 && result3.get(0).getName().equals("pear")) {
			System.out.println("testResultofArtifactName3 passed");
		} else {
			System.out.println("testResultofArtifactName3 failed");
		}
		//Test case 4 - search for non-existing Artifact
		ArrayList<Artifact> result4 = m.resultOfArtifactName("Pineapple");
		if(result4.size()==0) {
			System.out.println("testResultofArtifactName4 passed");
		} else {
			System.out.println("testResultofArtifactName4 failed");
		}	
	}
	private static void testSearchArtifactID() {
		m.getCollection().clear();
		m.addArtifact(a2);
		m.addArtifact(a3);
		m.addArtifact(a4);
		m.addArtifact(a5);
		m.addArtifact(a6); 


		//Test case 1-search for Artifact within index range
		if(m.searchArtifactID(2)==0) {
			System.out.println("testSearchArtifactID1 passed");
		} else {
			System.out.println("testSearchArtifactID1 failed");
		}	

		//Test case 2-search for Artifact outside index range
		if(m.searchArtifactID(7)==-1) {
			System.out.println("testSearchArtifactID2 passed");
		} else {
			System.out.println("testSearchArtifactID2 failed");
		}
		//Test case 3-search for Artifact outside index range
		if(m.searchArtifactID(-5)==-1) {
			System.out.println("testSearchArtifactID3 passed");
		} else {
			System.out.println("testSearchArtifactID3 failed");
		}

	}
	private static void testResultArtifactType() {
		m.getCollection().clear();
		m.addArtifact(a2);
		m.addArtifact(a3);
		m.addArtifact(a4);
		m.addArtifact(a5);
		m.addArtifact(a6);

		if(m.resultOfArtifactType(ArtifactType.ARTWORK).contains(a4)) {
			System.out.println("testResultArtifactType passed");
			} else {
				System.out.println("testResultArtifactType failed");
			}
		}
	}


