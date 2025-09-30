package part02;

import java.util.ArrayList;
import java.util.Scanner;




public class Exhibit {
	// exhibit attributes
	private String name;
	private ArrayList<Artifact> route;
	private ArrayList<String> sign;
	private int uniqueID;
	private static int nextCode =1;
	
	Scanner input = new Scanner(System.in);
	//exhibit constructor
	public Exhibit(String name) {
		this.name = name;
		this.route = new ArrayList<Artifact>();
		this.sign = new ArrayList<String>();
		this.uniqueID= nextCode();
		
		
	}
	//calculates exhibit unique id
	public static int nextCode() {
		int code = nextCode;
		nextCode++;
		return code;	
	}
	//getters/setters to access exhibit attributes
	public String getName() {
		return this.name;
	}
	public int getCode() {
		return this.uniqueID;
	}
	public ArrayList<Artifact> getRoute() {
		return this.route;
	}
	public Artifact getArtifact(int index) {
		return this.route.get(index);
	}
	public String getSign(int index) {
		return this.sign.get(index);
	}
	//calculates total engagement time for exhibit
	public int getEngTime() {
		int total = 0;
		for(int index=0;index<this.route.size();index++) {
			total += this.route.get(index).getEngTime();	
		}
		return total;
	}
	public void setName(String name) {
		if (name != null && name !="") {
			this.name = name;
		}
		else {
			if (name == null || name=="") 
				this.name = "Unknown";
		}
	}
	//allows user to add an artifact to the exhibit
	public void addArtifactExhibit(Artifact a,String s) {
			this.route.add(a);
			this.sign.add(s);
	}
	
	//allows user to update one or more artifacts within exhibit
		public void updateArtifact(int index, String newName, int newEngTime, ArtifactType type, String signString) {
			this.route.get(index).setName(newName);  
			this.route.get(index).setEngTime(newEngTime);
			(this.route.get(index)).setType(type);
			this.sign.set(index, signString);
			}	

	//displays exhibit details
	public String toString() {
		String artifactNames = "";
		artifactNames+=("\nName: "+this.name);
		artifactNames+=("\nID"
				+ ": "+this.uniqueID);
		artifactNames+=("\nTotal engagement time: "+getEngTime()+" minutes");
		artifactNames+=("\nArtifacts: ");
		for(int index = 0; index < this.route.size(); index++) {
			artifactNames+= "\n"+(index+1) +"."+ this.route.get(index).getName()+" Sign: "+this.sign.get(index);
		}
		return artifactNames;
		
	}

	
}
	

