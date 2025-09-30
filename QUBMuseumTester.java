package part02;


import java.util.ArrayList;

public class QUBMuseumTester {
	
	private static QUBMuseum m = new QUBMuseum();
	private static Museum museum = m.getMuseum();
	private static ArrayList<Artifact> artifacts = museum.getCollection();
	private static Artifact a1 = new Artifact("Apple",ArtifactType.OTHER,25);
	private static Artifact a2 = new Artifact("Pear",ArtifactType.OTHER,25);
	private static Artifact a3 = new Artifact("Banana",ArtifactType.PAINTING,25);
	private static Artifact a4 = new Artifact("Orange",ArtifactType.ARTWORK,25);
	private static Artifact a5 = new Artifact("Grape",ArtifactType.OTHER,25);
	

	private static Exhibit e1 = new Exhibit("Apple");
	private static Exhibit e2 = new Exhibit("Pear");
	
	

	public static void main(String[] args) {
		testAddArtifact();
		testDeleteArtifact();
		testlistArtifacts();
		testUpdateArtifact();
		testUpdateExhibit();
		testDeleteExhibit();
		testListExhibits();
		testAddExhibit();
		testSearchExhibitByID();
		testSearchExhibitByName();
		testSearchArtifactByID();
		testSearchArtifactByName();

	}
	public static void testAddArtifact() {
    //test case 1
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	if(m.getArtCount()==1 &&artifacts.size()==1) {
		System.out.println("testAddArtifact1 passed.");
	} else {
		System.out.println("testAddArtifact1 failed.");
	}
	//test case 2
	m.setArtCount(0);
	artifacts.clear();
	if(QUBMuseum.addArtifact("", "25", "PAINTING")==true &&artifacts.size()==0) {
		System.out.println("testAddArtifact2 passed.");
	} else if(QUBMuseum.addArtifact("", "25", "PAINTING")==false)
		System.out.println("testAddArtifact2 failed.");
	
	//test case 3
    m.setArtCount(0);
    artifacts.clear();
	if(QUBMuseum.addArtifact("test", "", "PAINTING")==true &&artifacts.size()==0) {
		System.out.println("testAddArtifact3 passed.");
	} else if(QUBMuseum.addArtifact("test", "", "PAINTING")==false)
			System.out.println("testAddArtifact3 failed.");
	//test case 4
	 m.setArtCount(0);
	 artifacts.clear();
	if(QUBMuseum.addArtifact("test", "test", "PAINTING")==true) {
		System.out.println("testAddArtifact4 passed.");
	} else if(QUBMuseum.addArtifact("test", "test", "PAINTING")==false)
				System.out.println("testAddArtifact4 failed.");
	//test case 5
	m.setArtCount(0);
	artifacts.clear();
	if(QUBMuseum.addArtifact("test", "test", "TEST")==true&&artifacts.size()==0) {
		System.out.println("testAddArtifact5 passed.");
	} else if(QUBMuseum.addArtifact("test", "test", "TEST")==false)
				System.out.println("testAddArtifact5 failed.");
	}
	
public static void testDeleteArtifact() {
	//test case 1
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	QUBMuseum.deleteArtifact(0);
	if(m.getArtCount()==0 &&artifacts.size()==0) {
		System.out.println("testDeleteArtifact1 passed.");
	} else {
		System.out.println("testDeleteArtifact1 failed.");
	}
	//test case 2
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	if(QUBMuseum.deleteArtifact(-1)==true &&artifacts.size()==1) {
		System.out.println("testDeleteArtifact2 passed.");
	} else {
		System.out.println("testDeleteArtifact2 failed.");
	}
	//test case 3
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	QUBMuseum.addArtifact("test", "25", "PAINTING");
		if(QUBMuseum.deleteArtifact(3)==true &&artifacts.size()==2) {
			System.out.println("testDeleteArtifact3 passed.");
		} else {
			System.out.println("testDeleteArtifact3 failed.");
		}

}
public static void testlistArtifacts() {
	//test case 1
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	if(QUBMuseum.listArtifacts(0)==true) {
		System.out.println("testlistArtifacts1 passed.");
	} else {
		System.out.println("testlistArtifacts1 failed.");
	}
	//test case 2
	if(QUBMuseum.listArtifacts(1)==false) {
		System.out.println("testlistArtifacts2 passed.");
	} else {
		System.out.println("testlistArtifacts2 failed.");
	}
	//test case 3
	if(QUBMuseum.listArtifacts(2)==false) {
		System.out.println("testlistArtifacts3 passed.");
	} else {
		System.out.println("testlistArtifacts3 failed.");
	}
}
	

public static void testUpdateArtifact() {
	//test case 1
	m.setArtCount(0);
	artifacts.clear();
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	QUBMuseum.updateArtifact(0, "newTest", "35", "DIGITAL");
	if(!m.getMuseum().getArtifact(0).getName().equals("newTest")||
		m.getMuseum().getArtifact(0).getEngTime()!=35 ||
		!m.getMuseum().getArtifact(0).getType().equals(ArtifactType.DIGITAL)) {
		System.out.println("testUpdateArtifact1 failed.");
	} else {
		System.out.println("testUpdateArtifact1 passed.");
	}
	//test case 2
	m.setArtCount(0);
	artifacts.clear();
	if(QUBMuseum.updateArtifact(0, "newTest", "35", "DIGITAL")==true) {
		System.out.println("testUpdateArtifact2 passed.");
	} else {
		System.out.println("testUpdateArtifact2 failed.");
	}
	//test case 3
	QUBMuseum.addArtifact("test", "25", "PAINTING");
	if(QUBMuseum.updateArtifact(0, "", "35", "DIGITAL")==true) {
		System.out.println("testUpdateArtifact3 passed.");
	} else {
		System.out.println("testUpdateArtifact3 failed.");
	}
	//test case 4
	if(QUBMuseum.updateArtifact(0, "newTest", "", "DIGITAL")==true) {
		System.out.println("testUpdateArtifact4 passed.");
	} else {
		System.out.println("testUpdateArtifact4 failed.");
	}
	//test case 5
	if(QUBMuseum.updateArtifact(0, "newTest", "-1", "DIGITAL")==true) {
		System.out.println("testUpdateArtifact5 passed.");
	} else {
		System.out.println("testUpdateArtifact5 failed.");
	}
	//test case 6
	if(QUBMuseum.updateArtifact(0, "newTest", "35", "NOTHING")==true) {
		System.out.println("testUpdateArtifact6 passed.");
	} else {
		System.out.println("testUpdateArtifact6 failed.");
	}
}
public static void testAddExhibit() {
	m.getMuseum().getExhibits().clear();
	m.getMuseum().getCollection().clear();
	m.setArtCount(0);
	m.getMuseum().addArtifact(a1);
	m.incrementExCount();
	m.getMuseum().addArtifact(a2);
	m.incrementExCount();
	m.getMuseum().addArtifact(a3);
	m.incrementExCount();
	m.getMuseum().addArtifact(a4);
	m.incrementExCount();
	m.getMuseum().addArtifact(a5);
	m.incrementExCount();
	
	QUBMuseum.addExhibit("newExhibit", 0, "sign1", 1, "sign2", 2, "sign3", 3, "sign4", 4, "sign5");
  
	if(!m.getMuseum().getExhibit(0).getName().equals("newExhibit") ||
       !m.getMuseum().getExhibit(0).getArtifact(0).getName().equals("Apple") ||
       !m.getMuseum().getExhibit(0).getSign(0).equals("sign1") ||
       !m.getMuseum().getExhibit(0).getArtifact(1).getName().equals("Pear") ||
       !m.getMuseum().getExhibit(0).getSign(1).equals("sign2") ||
       !m.getMuseum().getExhibit(0).getArtifact(2).getName().equals("Banana") ||
       !m.getMuseum().getExhibit(0).getSign(2).equals("sign3") ||
       !m.getMuseum().getExhibit(0).getArtifact(3).getName().equals("Orange") ||
       !m.getMuseum().getExhibit(0).getSign(3).equals("sign4") ||
       !m.getMuseum().getExhibit(0).getArtifact(4).getName().equals("Grape") ||
       !m.getMuseum().getExhibit(0).getSign(5).equals("sign5") ) {
    	System.out.println("testAddExhibit1 passed.");
    } else {
    	System.out.println("testAddExhibit1 failed.");
    }
}
public static void testListExhibits() {
	//test case 1
	if(QUBMuseum.listExhibits(0)==true) {
		System.out.println("testListExhibits1 passed.");
	} else {
		System.out.println("testListExhibits1 failed.");
	}
	//test case 2
	if(QUBMuseum.listExhibits(5)==false) {
		System.out.println("testListExhibits2 passed.");
	} else {
		System.out.println("testListExhibits2 failed.");
	}
}
public static void testDeleteExhibit() {
	//test case 1
	if(QUBMuseum.deleteExhibit(0)==false) {
		System.out.println("testDeleteExhibit1 passed.");
	} else {
		System.out.println("testDeleteExhibit1 failed.");
	}
	//test case 2
	if(QUBMuseum.deleteExhibit(-3)==true) {
		System.out.println("testDeleteExhibit2 passed.");
	} else {
		System.out.println("testDeleteExhibit2 failed.");
	}
	//test case 3
	if(QUBMuseum.deleteExhibit(3)==true) {
		System.out.println("testDeleteExhibit3 passed.");
	} else {
		System.out.println("testDeleteExhibit3 failed.");
	}
}
public static void testUpdateExhibit() {
	//test case 1
	m.getMuseum().addExhibit(e1);
	m.incrementExCount();
	e1.addArtifactExhibit(a1, "testing");
	e1.addArtifactExhibit(a2, "testing");
	e1.addArtifactExhibit(a3, "testing");
	e1.addArtifactExhibit(a4, "testing");
	e1.addArtifactExhibit(a5, "testing");
	QUBMuseum.updateExhibit(0, "testExhibit", 0, "test1", "25", "PAINTING", "testSign");
	if(!m.getMuseum().getExhibit(0).getName().equals("testExhibit")||
    		m.getMuseum().getExhibit(0).getArtifact(0).getEngTime()!=25 ||
    		!m.getMuseum().getExhibit(0).getArtifact(0).getType().equals(ArtifactType.PAINTING) ||
    		!m.getMuseum().getExhibit(0).getSign(0).equals("testSign")) {
    		System.out.println("testUpdateExhibit1 failed."); 
    } else {
    	System.out.println("testUpdateExhibit1 passed."); 
    }
	//test case 2
	if(QUBMuseum.updateExhibit(0, "", 0, "test1", "25", "PAINTING", "testSign")==true&& m.getExCount()==1) {
		System.out.println("testUpdateExhibit2 passed."); 
	} else {
    	System.out.println("testUpdateExhibit2 failed."); 
    }
	//test case 3
	if(QUBMuseum.updateExhibit(0, "testExhibit",-1, "test1", "25", "PAINTING", "testSign")==true && m.getExCount()==1) {
		System.out.println("testUpdateExhibit3 passed."); 
	} else {
    	System.out.println("testUpdateExhibit3 failed."); 
    }
	//test case 4
	if(QUBMuseum.updateExhibit(0, "testExhibit",6, "test1", "25", "PAINTING", "testSign")==true && m.getExCount()==1) {
		System.out.println("testUpdateExhibit4 passed."); 
	} else {
    	System.out.println("testUpdateExhibit4 failed."); 
    }
	//test case 5
	if(QUBMuseum.updateExhibit(0, "testExhibit",0, "", "25", "PAINTING", "testSign")==true && m.getExCount()==1) {
		System.out.println("testUpdateExhibit5 passed."); 
	} else {
    	System.out.println("testUpdateExhibit5 failed."); 
    }
	//test case 6
	if(QUBMuseum.updateExhibit(0, "testExhibit",0, "test1", "error", "PAINTING", "testSign")==true && m.getExCount()==1) {
		System.out.println("testUpdateExhibit6 passed."); 
	} else {
    	System.out.println("testUpdateExhibit6 failed."); 
    }
	//test case 7
		if(QUBMuseum.updateExhibit(0, "testExhibit",0, "test1", "25", "", "testSign")==true && m.getExCount()==1) {
			System.out.println("testUpdateExhibit7 passed."); 
		} else {
	    	System.out.println("testUpdateExhibit7 failed."); 
	    }
	//test case 8
		if(QUBMuseum.updateExhibit(0, "testExhibit",0, "test1", "25", "PAINTING", "")==true && m.getExCount()==1) {
			System.out.println("testUpdateExhibit8 passed."); 
		} else {
			   System.out.println("testUpdateExhibit8 failed."); 
			  }
	
	
}
public static void testSearchExhibitByID() {
	//test case 1
	m.getMuseum().addExhibit(e1);
	if(QUBMuseum.searchExhibitByID(1)==false) {
		System.out.println("testSearchExhibitByID1 passed.");
	} else {
		System.out.println("testSearchExhibitByID1 failed.");
	}
	//test case 2
		if(QUBMuseum.searchExhibitByID(-3)==true) {
			System.out.println("testSearchExhibitByID2 passed.");
		} else {
			System.out.println("testSearchExhibitByID2 failed.");
		}
}
public static void testSearchExhibitByName() {
	//test case 1
	m.getMuseum().addExhibit(e2);
	if(QUBMuseum.searchExhibitByName("Pear",0)==false) {
		System.out.println("testSearchExhibitByName1 passed.");
	} else {
		System.out.println("testSearchExhibitByName1 failed.");
	}
	//test case 2
		if(QUBMuseum.searchExhibitByName("Orange",0)==true) {
			System.out.println("testSearchExhibitByName2 passed.");
		} else {
			System.out.println("testSearchExhibitByName2 failed.");
		}
		//test case 3
				if(QUBMuseum.searchExhibitByName("",0)==true) {
					System.out.println("testSearchExhibitByName3 passed.");
				} else {
					System.out.println("testSearchExhibitByName3 failed.");
				}
}
public static void testSearchArtifactByID() {
	//test case 1
	m.getMuseum().addArtifact(a2);
	if(QUBMuseum.searchArtifactByID(1)==false) {
		System.out.println("testSearchArtifactByID1 passed.");
	} else {
		System.out.println("testSearchArtifactByID1 failed.");
	}
	//test case 2
		if(QUBMuseum.searchArtifactByID(-3)==true) {
			System.out.println("testSearchArtifactByID2 passed.");
		} else {
			System.out.println("testSearchArtifactByID2 failed.");
		}
}
public static void testSearchArtifactByName() {
	//test case 1
	m.getMuseum().addArtifact(a2);
	if(QUBMuseum.searchArtifactByName("Pear",0)==false) {
		System.out.println("testSearchArtifactByName1 passed.");
	} else {
		System.out.println("testSearchArtifactByName1 failed.");
	}
	//test case 2
		if(QUBMuseum.searchArtifactByName("Kiwi",0)==true) {
			System.out.println("testSearchArtifactName2 passed.");
		} else {
			System.out.println("testSearchArtifactName2 failed.");
		}
		//test case 3
				if(QUBMuseum.searchArtifactByName("",0)==true) {
					System.out.println("testSearchArtifactByName3 passed.");
				} else {
					System.out.println("testSearchArtifactByName3 failed.");
				}
}
}



