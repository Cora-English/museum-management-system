package part02;

public enum ArtifactType {
	ARTWORK("Artwork"), PAINTING("Painting"),SCULPTURE("Sculpture"),DIGITAL("Digital"),TACTILE("Tactile"), OTHER("Other");
	
	
	
private String typeStr;
	
	private ArtifactType(String type) {
		typeStr = type;
	}
	public String toString() {
		return typeStr;
	}

}
