package part02;

public class Artifact {
	//artifact attributes 
	private String name;
	private ArtifactType type;
	private int engTime;
	private int uniqueID;
	private static int nextCode =1;
	
	// artifact constructor 
	public Artifact(String name,ArtifactType type, int engTime ) {
		this.name = name;
		this.type = type;
		this.engTime = engTime;
		this.uniqueID = nextCode();
		
	}
	// calculates the artifact's unique id
	public static int nextCode() {
		int code = nextCode;
		nextCode++;
		return code;	
	}
	//Getters/setters to access artifact attributes
	public String getName() {
		return this.name;
	}
	public int getCode() {
		return this.uniqueID;
	}
	public ArtifactType getType() {
		return this.type;
	}
	public int getEngTime() {
		return this.engTime;
	}
	public void setName(String name) {
		if (name != null &&name!="") {
			this.name = name;
		}
		else {
			if (name == null || name=="")
				this.name = "Unknown";
		}
	}
	public void setType(ArtifactType type) {
		this.type = type;
		}
	
	public void setEngTime(int time) {
			if (time >= 0) {
				this.engTime = time;
			}
			else {
					this.engTime = 0;
			}
		}
	//displays artifact details	
	@Override
	public String toString() {
		return "\nName: " + this.name + "\nID: " + this.uniqueID + "\nType: " + this.type+"\nEngagement time: "+this.engTime;
	}
	
	
}
