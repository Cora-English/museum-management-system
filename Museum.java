package part02;

import java.util.ArrayList;
import java.util.Scanner;


public class Museum {
	//museum attributes
		private String name;
		private ArrayList<Artifact> collection = new ArrayList<>();
		private ArrayList<Exhibit> exhibits = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		 //museum constructor
		public Museum(String name) {
			this.name = name;
			this.collection =  new ArrayList<Artifact>();
			this.exhibits =  new ArrayList<Exhibit>();

	}
		//getters for museum attributes
		public String getName() {
			return this.name;
		}
		public Artifact getArtifact(int index) {
 			return this.collection.get(index);
 		}
		public String getArtifactName(int index) {
			String ArtifactName = this.collection.get(index).getName();
			return ArtifactName;
		}
		public ArrayList<Artifact> getCollection() {
			return this.collection;
		}
		public ArrayList<Exhibit> getExhibits() {
			return this.exhibits;
		}
		public Exhibit getExhibit(int index) {
 			return this.exhibits.get(index);
 		}
		public String getExhibitName(int index) {
			String ExhibitName = this.exhibits.get(index).getName();
			return ExhibitName;
		}
	    //method to add artifact to museum collection
		public void addArtifact(Artifact a) {
				this.collection.add(a);
		}
		// method to delete an artifact from collection
		 public void deleteArtifact(int index) {
		 		this.collection.remove(index);
		 }
		 //method to allow the user to update an artifact within museum collection
		 public void updateArtifact(int index,String newName,ArtifactType type,int newEngTime) {
			this.collection.get(index).setName(newName);
			this.collection.get(index).setEngTime(newEngTime);		 	
			this.collection.get(index).setType(type);
		 }			
		 		
		//method to add exhibit to museum exhibits
		public void addExhibit(Exhibit e) {
				this.exhibits.add(e);
		}
		//method to delete exhibit from museum
		public void deleteExhibit(int index) {
			this.exhibits.remove(index);
	}
		//method to update exhibit within museum
		public void updateExhibit(int index,String newName) {
		this.exhibits.get(index).setName(newName);
		}
		//method to display all artifacts in museum collection
		public String collectiontoString() {
			String museumCollection = "";
			for(int index = 0; index < this.collection.size(); index++) {
				museumCollection += this.collection.get(index).toString()+"\n";
			}
			return museumCollection;
			}
		//method to display all exhibits in museum
 		public String exhibitstoString() {
 			String museumExhibits = "";
 			
 			for(int index = 0; index < this.exhibits.size(); index++) { 
 				museumExhibits += this.exhibits.get(index).toString()+"\n";
 			}
 			return museumExhibits;
 			}
 		// method that returns the number of artifacts in museum
 		public int collectionLength() {
 			return this.collection.size();
 		}
 					
 	
 		//method to sort artifacts in alphabetical order using insertion sort
 		public void sortArtifacts() {
 			for (int index = 1; index < this.collection.size(); index++) {
 	            Artifact current = this.collection.get(index);
 	            int j = index - 1;

 	            
 	            while (j >= 0 && this.collection.get(j).getName().toLowerCase().charAt(0)> current.getName().toLowerCase().charAt(0)) {
 	                this.collection.set(j + 1, this.collection.get(j));
 	                j = j - 1;
 	            }

 	            this.collection.set(j + 1, current);
 	        }
 			
 		}
 		//method to sort exhibits in alphabetical order using insertion sort
 		public void sortExhibits() {
 	
 			for (int index = 1; index < this.exhibits.size(); index++) {
 	            Exhibit current = this.exhibits.get(index);
 	            int j = index - 1;

 	            
 	            while (j >= 0 && this.exhibits.get(j).getName().toLowerCase().charAt(0)> current.getName().toLowerCase().charAt(0)) {
 	                this.exhibits.set(j + 1, this.exhibits.get(j));
 	                j = j - 1;
 	            }

 	            this.exhibits.set(j + 1, current);
 	        }
 		}
 	
 		//method to allow user find position of exhibits by name
 		public ArrayList<Exhibit> resultOfExhibitName(String target) {
 			ArrayList<Exhibit> sortedExhibits = new ArrayList<>(this.exhibits);
 			for(int index=0;index<sortedExhibits.size();index++) {
 				sortedExhibits.get(index).setName(sortedExhibits.get(index).getName().toLowerCase().trim());
 			}
 			ArrayList<Exhibit> results= new ArrayList<Exhibit>();
 			target = target.trim().toLowerCase();
 			for(int index=0;index<sortedExhibits.size();index++) {
 				if(sortedExhibits.get(index).getName().contains(target)) {
 					results.add(sortedExhibits.get(index));
 				}
 			}
 			return results;
 			}
 		//method that allows user search for exhibits by unique id
 		public int searchExhibitID(int target) {
 			int result = -1;
 		
 			for(int index=0;index<this.exhibits.size();index++) {
				 Exhibit e = this.exhibits.get(index);
				 if(e.getCode() == target) {
					result = index;
				 }
 			}
				 return result;
 		}
 		//method to allow user search for exhibits by name
 		public int searchExhibitName(Exhibit target) {
 		 int result = -1;			
 		 result = this.exhibits.indexOf(target);		
 		 return result;
 		}
 		
 		//method to allow user find position of artifacts by name
 		public ArrayList<Artifact> resultOfArtifactName(String target) {
 			ArrayList<Artifact> sortedArtifacts = new ArrayList<>(this.collection);
 			for(int index=0;index<sortedArtifacts.size();index++) {
 				sortedArtifacts.get(index).setName(this.collection.get(index).getName().toLowerCase().trim());
 			}
 			ArrayList<Artifact> results= new ArrayList<Artifact>();
 			target = target.trim().toLowerCase();
 			for(int index=0;index<sortedArtifacts.size();index++) {
 				if(sortedArtifacts.get(index).getName().contains(target)) {
 					results.add(sortedArtifacts.get(index));
 				}
 			}
 			return results;
 			}
 		
 		//method to allow user search for artifacts by name
 		public int searchArtifactName(Artifact target) {
 	 		 int result = -1;			
 	 		 result = this.collection.indexOf(target);		
 	 		 return result;
 	 		}
 		//method to allow user search for artifacts by unique ID
 		public int searchArtifactID(int target) {
 			int result = -1;
 	 			for(int index=0;index<this.collection.size();index++) {
 					 Artifact a = this.collection.get(index);
 					 if(a.getCode() == target) {
 						result = index;
 					 }
 	 			}
 					 return result;
 		}
 		//method to allow user search for artifacts by type
 		public int searchArtifactType(Artifact a) {
 		int result = -1;
		result = this.collection.indexOf(a);
		return result;
 				}		
 		
 	    //method to find position of artifact based on it's type
 		public ArrayList<Artifact> resultOfArtifactType(ArtifactType type) {
 			ArrayList<Artifact> results = new ArrayList<Artifact>();
			 for(int index=0;index<this.collection.size();index++) {
				 Artifact a = this.collection.get(index);
				 if(a.getType() == type) {
					results.add(a);
				 }
			}
			 return results;
 		}


}

 		
 	
 	




 


		
		


