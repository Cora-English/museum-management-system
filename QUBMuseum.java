package part02;

import java.util.ArrayList;
import java.util.Scanner;



public class QUBMuseum {


	private static String options[] = { "Manage artifacts","Manage Exhibits","Manage Annual Plan","Exit"};
	private static Menu myMenu = new Menu("\nQUBMuseum", options);
	private static Museum myMuseum = new Museum("Ulster Museum");
	private static ArrayList<String> signs = new ArrayList<String>();
	private static Scanner input = new Scanner(System.in);
	private static final int MAX = 200;
	private static int artCount = 0;
	private static int exCount = 0;
	private static boolean validInput = false;	
	private static ArrayList<Exhibit> hall1 = new ArrayList<Exhibit>();
	private static ArrayList<Exhibit> hall2 = new ArrayList<Exhibit>();
	private static ArrayList<Exhibit> hall3 = new ArrayList<Exhibit>();
	private static ArrayList<String> annualPlan = new ArrayList<String>();

	
	public static void main(String[] args) {
	        myMuseum.addArtifact(new Artifact("Golden Frame", ArtifactType.ARTWORK, 15));
	        myMuseum.addArtifact(new Artifact("Ancient Landscape", ArtifactType.PAINTING, 20));
	        myMuseum.addArtifact(new Artifact("Roman Bust", ArtifactType.SCULPTURE, 30));
	        myMuseum.addArtifact(new Artifact("Digital Portrait", ArtifactType.DIGITAL, 10));
	        myMuseum.addArtifact(new Artifact("Interactive Sculpture", ArtifactType.TACTILE, 40));
	        myMuseum.addArtifact(new Artifact("Modern Artwork", ArtifactType.ARTWORK, 25));
	        myMuseum.addArtifact(new Artifact("Sunset Painting", ArtifactType.PAINTING, 15));
	        myMuseum.addArtifact(new Artifact("Greek Statue", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("VR Experience", ArtifactType.DIGITAL, 50));
	        myMuseum.addArtifact(new Artifact("Touch-and-Feel Art", ArtifactType.TACTILE, 28));
	        myMuseum.addArtifact(new Artifact("Abstract Artwork", ArtifactType.ARTWORK, 18));
	        myMuseum.addArtifact(new Artifact("Watercolor Painting", ArtifactType.PAINTING, 22));
	        myMuseum.addArtifact(new Artifact("Stone Sculpture", ArtifactType.SCULPTURE, 30));
	        myMuseum.addArtifact(new Artifact("Digital Installation", ArtifactType.DIGITAL, 45));
	        myMuseum.addArtifact(new Artifact("Sculpture for Interaction", ArtifactType.TACTILE, 37));
	        myMuseum.addArtifact(new Artifact("Calligraphy Artwork", ArtifactType.ARTWORK, 16));
	        myMuseum.addArtifact(new Artifact("Oil Painting", ArtifactType.PAINTING, 40));
	        myMuseum.addArtifact(new Artifact("Marble Statue", ArtifactType.SCULPTURE, 50));
	        myMuseum.addArtifact(new Artifact("Augmented Reality Art", ArtifactType.DIGITAL, 30));
	        myMuseum.addArtifact(new Artifact("Sensory Sculpture", ArtifactType.TACTILE, 35));
	        myMuseum.addArtifact(new Artifact("Landscape Artwork", ArtifactType.ARTWORK, 22));
	        myMuseum.addArtifact(new Artifact("Portrait Painting", ArtifactType.PAINTING, 25));
	        myMuseum.addArtifact(new Artifact("Bronze Sculpture", ArtifactType.SCULPTURE, 55));
	        myMuseum.addArtifact(new Artifact("Interactive Digital Art", ArtifactType.DIGITAL, 38));
	        myMuseum.addArtifact(new Artifact("Textured Sculpture", ArtifactType.TACTILE, 42));
	        myMuseum.addArtifact(new Artifact("Street Art", ArtifactType.ARTWORK, 20));
	        myMuseum.addArtifact(new Artifact("Impressionist Painting", ArtifactType.PAINTING, 48));
	        myMuseum.addArtifact(new Artifact("Clay Sculpture", ArtifactType.SCULPTURE, 12));
	        myMuseum.addArtifact(new Artifact("Motion Graphic Digital Art", ArtifactType.DIGITAL, 30));
	        myMuseum.addArtifact(new Artifact("Tactile Art Piece", ArtifactType.TACTILE, 27));
	        myMuseum.addArtifact(new Artifact("Folk Art", ArtifactType.ARTWORK, 15));
	        myMuseum.addArtifact(new Artifact("Pop Art Painting", ArtifactType.PAINTING, 40));
	        myMuseum.addArtifact(new Artifact("Wooden Sculpture", ArtifactType.SCULPTURE, 25));
	        myMuseum.addArtifact(new Artifact("AI-Generated Digital Art", ArtifactType.DIGITAL, 60));
	        myMuseum.addArtifact(new Artifact("Textured Interactive Sculpture", ArtifactType.TACTILE, 32));
	        myMuseum.addArtifact(new Artifact("Surreal Artwork", ArtifactType.ARTWORK, 35));
	        myMuseum.addArtifact(new Artifact("Renaissance Painting", ArtifactType.PAINTING, 50));
	        myMuseum.addArtifact(new Artifact("Limestone Sculpture", ArtifactType.SCULPTURE, 20));
	        myMuseum.addArtifact(new Artifact("Digital Painting", ArtifactType.DIGITAL, 25));
	        myMuseum.addArtifact(new Artifact("Musical Sculpture", ArtifactType.TACTILE, 18));
	        myMuseum.addArtifact(new Artifact("Conceptual Artwork", ArtifactType.ARTWORK, 28));
	        myMuseum.addArtifact(new Artifact("Charcoal Painting", ArtifactType.PAINTING, 20));
	        myMuseum.addArtifact(new Artifact("Wood Sculpture", ArtifactType.SCULPTURE, 30));
	        myMuseum.addArtifact(new Artifact("Interactive Digital Portrait", ArtifactType.DIGITAL, 35));
	        myMuseum.addArtifact(new Artifact("Interactive Tactile Sculpture", ArtifactType.TACTILE, 38));
	        myMuseum.addArtifact(new Artifact("Art Deco Artwork", ArtifactType.ARTWORK, 40));
	        myMuseum.addArtifact(new Artifact("Modernist Painting", ArtifactType.PAINTING, 30));
	        myMuseum.addArtifact(new Artifact("Sculpture of the Future", ArtifactType.SCULPTURE, 60));
	        myMuseum.addArtifact(new Artifact("Generative Digital Art", ArtifactType.DIGITAL, 50));
	        myMuseum.addArtifact(new Artifact("Textured Wall Art", ArtifactType.TACTILE, 45));
	        myMuseum.addArtifact(new Artifact("Street Mural Artwork", ArtifactType.ARTWORK, 20));
	        myMuseum.addArtifact(new Artifact("Abstract Expressionist Painting", ArtifactType.PAINTING, 55));
	        myMuseum.addArtifact(new Artifact("Crystal Sculpture", ArtifactType.SCULPTURE, 28));
	        myMuseum.addArtifact(new Artifact("Interactive 3D Art", ArtifactType.DIGITAL, 70));
	        myMuseum.addArtifact(new Artifact("Responsive Tactile Art", ArtifactType.TACTILE, 40));
	        myMuseum.addArtifact(new Artifact("Geometric Artwork", ArtifactType.ARTWORK, 18));
	        myMuseum.addArtifact(new Artifact("Still Life Painting", ArtifactType.PAINTING, 25));
	        myMuseum.addArtifact(new Artifact("Wooden Relief Sculpture", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("Digital Art Piece", ArtifactType.DIGITAL, 30));
	        myMuseum.addArtifact(new Artifact("Sculpture with Light Interaction", ArtifactType.TACTILE, 42));
	        myMuseum.addArtifact(new Artifact("Futuristic Artwork", ArtifactType.ARTWORK, 22));
	        myMuseum.addArtifact(new Artifact("Impressionist Seascape", ArtifactType.PAINTING, 30));
	        myMuseum.addArtifact(new Artifact("Iron Sculpture", ArtifactType.SCULPTURE, 25));
	        myMuseum.addArtifact(new Artifact("Interactive VR Art", ArtifactType.DIGITAL, 55));
	        myMuseum.addArtifact(new Artifact("Textured Wall Sculpture", ArtifactType.TACTILE, 40));
	        myMuseum.addArtifact(new Artifact("Nature Artwork", ArtifactType.ARTWORK, 18));
	        myMuseum.addArtifact(new Artifact("Abstract Painting", ArtifactType.PAINTING, 28));
	        myMuseum.addArtifact(new Artifact("Stone Carving Sculpture", ArtifactType.SCULPTURE, 45));
	        myMuseum.addArtifact(new Artifact("Augmented Reality Installation", ArtifactType.DIGITAL, 65));
	        myMuseum.addArtifact(new Artifact("Tactile Interactive Painting", ArtifactType.TACTILE, 50));
	        myMuseum.addArtifact(new Artifact("Modern Art Piece", ArtifactType.ARTWORK, 30));
	        myMuseum.addArtifact(new Artifact("Pastel Portrait Painting", ArtifactType.PAINTING, 35));
	        myMuseum.addArtifact(new Artifact("Wooden Abstract Sculpture", ArtifactType.SCULPTURE, 20));
	        myMuseum.addArtifact(new Artifact("AI-Enhanced Digital Art", ArtifactType.DIGITAL, 50));
	        myMuseum.addArtifact(new Artifact("Sensory Interactive Sculpture", ArtifactType.TACTILE, 60));
	        myMuseum.addArtifact(new Artifact("Monochrome Artwork", ArtifactType.ARTWORK, 40));
	        myMuseum.addArtifact(new Artifact("Cubist Painting", ArtifactType.PAINTING, 50));
	        myMuseum.addArtifact(new Artifact("Glass Sculpture", ArtifactType.SCULPTURE, 55));
	        myMuseum.addArtifact(new Artifact("3D Digital Experience", ArtifactType.DIGITAL, 75));
	        myMuseum.addArtifact(new Artifact("Tactile Art Interaction", ArtifactType.TACTILE, 65));
	        myMuseum.addArtifact(new Artifact("Expressionist Artwork", ArtifactType.ARTWORK, 35));
	        myMuseum.addArtifact(new Artifact("Vintage Oil Painting", ArtifactType.PAINTING, 45));
	        myMuseum.addArtifact(new Artifact("Bronze Relief Sculpture", ArtifactType.SCULPTURE, 30));
	        myMuseum.addArtifact(new Artifact("Virtual Art Gallery", ArtifactType.DIGITAL, 60));
	        myMuseum.addArtifact(new Artifact("Interactive Touch Art", ArtifactType.TACTILE, 55));
	        myMuseum.addArtifact(new Artifact("Pop Art Modern Artwork", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Impressionist Sunset Painting", ArtifactType.PAINTING, 25));
	        myMuseum.addArtifact(new Artifact("Sculpture in Motion", ArtifactType.SCULPTURE, 40));
	        myMuseum.addArtifact(new Artifact("Digital Storytelling Art", ArtifactType.DIGITAL, 65));
	        myMuseum.addArtifact(new Artifact("Textured Tactile Experience", ArtifactType.TACTILE, 70));
	        myMuseum.addArtifact(new Artifact("Landscape Artwork with Neon", ArtifactType.ARTWORK, 55));
	        myMuseum.addArtifact(new Artifact("Realistic Portrait Painting", ArtifactType.PAINTING, 48));
	        myMuseum.addArtifact(new Artifact("Stone Abstract Sculpture", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("Virtual Sculpture Exhibition", ArtifactType.DIGITAL, 80));
	        myMuseum.addArtifact(new Artifact("Interactive Tactile Wall", ArtifactType.TACTILE, 60));
	        myMuseum.addArtifact(new Artifact("Futuristic Concept Artwork", ArtifactType.ARTWORK, 65));
	        myMuseum.addArtifact(new Artifact("Mixed Media Painting", ArtifactType.PAINTING, 40));
	        myMuseum.addArtifact(new Artifact("Geometric Metal Sculpture", ArtifactType.SCULPTURE, 45));
	        myMuseum.addArtifact(new Artifact("Holographic Digital Art", ArtifactType.DIGITAL, 85));
	        myMuseum.addArtifact(new Artifact("Touch-Activated Sculpture", ArtifactType.TACTILE, 45));
	        myMuseum.addArtifact(new Artifact("Cityscape Artwork", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Watercolor Cityscape Painting", ArtifactType.PAINTING, 30));
	        myMuseum.addArtifact(new Artifact("Abstract Expression Sculpture", ArtifactType.SCULPTURE, 60));
	        myMuseum.addArtifact(new Artifact("AI-Generated Digital Portrait", ArtifactType.DIGITAL, 70));
	        myMuseum.addArtifact(new Artifact("Responsive Tactile Art Installation", ArtifactType.TACTILE, 75));
	        myMuseum.addArtifact(new Artifact("Geometric Art on Canvas", ArtifactType.ARTWORK, 45));
	        myMuseum.addArtifact(new Artifact("Floral Painting", ArtifactType.PAINTING, 32));
	        myMuseum.addArtifact(new Artifact("Glass Art Sculpture", ArtifactType.SCULPTURE, 50));
	        myMuseum.addArtifact(new Artifact("Immersive Digital Art Experience", ArtifactType.DIGITAL, 90));
	        myMuseum.addArtifact(new Artifact("Tactile Sensory Art", ArtifactType.TACTILE, 50));
	        myMuseum.addArtifact(new Artifact("Futuristic Abstract Artwork", ArtifactType.ARTWORK, 60));
	        myMuseum.addArtifact(new Artifact("Historical Portrait Painting", ArtifactType.PAINTING, 65));
	        myMuseum.addArtifact(new Artifact("Abstract Clay Sculpture", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("Interactive Digital Sound Art", ArtifactType.DIGITAL, 80));   
	        myMuseum.addArtifact(new Artifact("Nature-Inspired Artwork", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Charcoal Sketch Painting", ArtifactType.PAINTING, 20));
	        myMuseum.addArtifact(new Artifact("Marble and Metal Sculpture", ArtifactType.SCULPTURE, 60));
	        myMuseum.addArtifact(new Artifact("AI-Inspired Digital Creation", ArtifactType.DIGITAL, 95));
	        myMuseum.addArtifact(new Artifact("Tactile Experience Sculpture", ArtifactType.TACTILE, 80));
	        myMuseum.addArtifact(new Artifact("Abstract Digital Artwork", ArtifactType.ARTWORK, 75));
	        myMuseum.addArtifact(new Artifact("Portrait with Surrealistic Elements", ArtifactType.PAINTING, 50));
	        myMuseum.addArtifact(new Artifact("Wood Carved Sculpture", ArtifactType.SCULPTURE, 40));
	        myMuseum.addArtifact(new Artifact("Imperialist portrait", ArtifactType.ARTWORK, 22));
	        myMuseum.addArtifact(new Artifact("Impressionist Garden", ArtifactType.PAINTING, 30));
	        myMuseum.addArtifact(new Artifact("Chinese Sculpture", ArtifactType.SCULPTURE, 25));
	        myMuseum.addArtifact(new Artifact("Interactive Glitter Art", ArtifactType.DIGITAL, 55));
	        myMuseum.addArtifact(new Artifact("Ribbon Wall Art", ArtifactType.TACTILE, 40));
	        myMuseum.addArtifact(new Artifact("Nature Illustration", ArtifactType.ARTWORK, 18));
	        myMuseum.addArtifact(new Artifact("Abstract Colour Display", ArtifactType.PAINTING, 28));
	        myMuseum.addArtifact(new Artifact("Medieval Stone Sculpture", ArtifactType.SCULPTURE, 45));
	        myMuseum.addArtifact(new Artifact("Rotating mandala wheel", ArtifactType.DIGITAL, 65));
	        myMuseum.addArtifact(new Artifact("Tactile Sunflower Oil Painting", ArtifactType.TACTILE, 50));
	        myMuseum.addArtifact(new Artifact("Modernist comic", ArtifactType.ARTWORK, 30));
	        myMuseum.addArtifact(new Artifact("Gothic Portrait Painting", ArtifactType.PAINTING, 35));
	        myMuseum.addArtifact(new Artifact("Mythological Sculpture", ArtifactType.SCULPTURE, 20));
	        myMuseum.addArtifact(new Artifact("Interactive Digital Mirror", ArtifactType.DIGITAL, 50));
	        myMuseum.addArtifact(new Artifact("Sensory Woven Sculpture", ArtifactType.TACTILE, 60));
	        myMuseum.addArtifact(new Artifact("Butterfly Artwork", ArtifactType.ARTWORK, 40));
	        myMuseum.addArtifact(new Artifact("Pyramid Painting", ArtifactType.PAINTING, 50));
	        myMuseum.addArtifact(new Artifact("Bronze Gladiator Sculpture", ArtifactType.SCULPTURE, 55));
	        myMuseum.addArtifact(new Artifact("Digital Cubes", ArtifactType.DIGITAL, 75));
	        myMuseum.addArtifact(new Artifact("Water fountain", ArtifactType.TACTILE, 65));
	        myMuseum.addArtifact(new Artifact("Minimalistic Portrait", ArtifactType.ARTWORK, 35));
	        myMuseum.addArtifact(new Artifact("Baroque Church", ArtifactType.PAINTING, 45));
	        myMuseum.addArtifact(new Artifact("Veins of the Earth", ArtifactType.SCULPTURE, 30));
	        myMuseum.addArtifact(new Artifact("Virtual Walk in the Park", ArtifactType.DIGITAL, 60));
	        myMuseum.addArtifact(new Artifact("Fingerprint art", ArtifactType.TACTILE, 55));
	        myMuseum.addArtifact(new Artifact("Pop Art Evolution", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Sunset in Motion", ArtifactType.PAINTING, 25));
	        myMuseum.addArtifact(new Artifact("The Kinetic Sculpture", ArtifactType.SCULPTURE, 40));
	        myMuseum.addArtifact(new Artifact("Digital Dreams Unfold", ArtifactType.DIGITAL, 65));
	        myMuseum.addArtifact(new Artifact("Tactile World", ArtifactType.TACTILE, 70));
	        myMuseum.addArtifact(new Artifact("Neon Horizons", ArtifactType.ARTWORK, 55));
	        myMuseum.addArtifact(new Artifact("Timeless Portrait", ArtifactType.PAINTING, 48));
	        myMuseum.addArtifact(new Artifact("Abstract Stone Mastery", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("Virtual Dimensions", ArtifactType.DIGITAL, 80));
	        myMuseum.addArtifact(new Artifact("Interactive Touchscape", ArtifactType.TACTILE, 60));
	        myMuseum.addArtifact(new Artifact("Futuristic Visions", ArtifactType.ARTWORK, 65));
	        myMuseum.addArtifact(new Artifact("Mixed Expression", ArtifactType.PAINTING, 40));
	        myMuseum.addArtifact(new Artifact("Geometric Steel Form", ArtifactType.SCULPTURE, 45));
	        myMuseum.addArtifact(new Artifact("Holo-Visions", ArtifactType.DIGITAL, 85));
	        myMuseum.addArtifact(new Artifact("Responsive Touch Art", ArtifactType.TACTILE, 45));
	        myMuseum.addArtifact(new Artifact("City Pulse", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Urban Watercolors", ArtifactType.PAINTING, 30));
	        myMuseum.addArtifact(new Artifact("Expression in Form", ArtifactType.SCULPTURE, 60));
	        myMuseum.addArtifact(new Artifact("AI Portraits", ArtifactType.DIGITAL, 70));
	        myMuseum.addArtifact(new Artifact("Sensory Interaction", ArtifactType.TACTILE, 75));
	        myMuseum.addArtifact(new Artifact("Geometric Canvas", ArtifactType.ARTWORK, 45));
	        myMuseum.addArtifact(new Artifact("Floral Essence", ArtifactType.PAINTING, 32));
	        myMuseum.addArtifact(new Artifact("Glass and Light", ArtifactType.SCULPTURE, 50));
	        myMuseum.addArtifact(new Artifact("Immersive Realms", ArtifactType.DIGITAL, 90));
	        myMuseum.addArtifact(new Artifact("Sensory Sculptures", ArtifactType.TACTILE, 50));
	        myMuseum.addArtifact(new Artifact("Future Visions", ArtifactType.ARTWORK, 60));
	        myMuseum.addArtifact(new Artifact("Historical Reverence", ArtifactType.PAINTING, 65));
	        myMuseum.addArtifact(new Artifact("Clay and Soul", ArtifactType.SCULPTURE, 35));
	        myMuseum.addArtifact(new Artifact("Sonic Digital Realities", ArtifactType.DIGITAL, 80));
	        myMuseum.addArtifact(new Artifact("Light and Form", ArtifactType.TACTILE, 65));
	        myMuseum.addArtifact(new Artifact("Nature’s Palette", ArtifactType.ARTWORK, 50));
	        myMuseum.addArtifact(new Artifact("Shadows of the Past", ArtifactType.PAINTING, 20));
	        myMuseum.addArtifact(new Artifact("Marble & Metal Fusion", ArtifactType.SCULPTURE, 60));
	        myMuseum.addArtifact(new Artifact("AI-Driven Art", ArtifactType.DIGITAL, 95));
	        myMuseum.addArtifact(new Artifact("Touch of Artistry", ArtifactType.TACTILE, 80));
	        myMuseum.addArtifact(new Artifact("Abstract Realms", ArtifactType.ARTWORK, 75));
	        myMuseum.addArtifact(new Artifact("Surrealist Essence", ArtifactType.PAINTING, 50));
	        myMuseum.addArtifact(new Artifact("Wood and Craft", ArtifactType.SCULPTURE, 40));
	        for(int index=0;index<180;index++) {
	        	artCount++;
	        }
	        signs.add("A luxurious, intricately designed frame from the 18th century, crafted to showcase masterpieces of art.");
	        signs.add("A mesmerizing painting of a long-forgotten landscape, evoking a sense of timeless beauty.");
	        signs.add("A marble bust depicting a Roman statesman, symbolizing the grandeur and political prowess of ancient Rome.");
	        signs.add("A modern, digitally-created portrait that merges traditional portraiture with cutting-edge technology.");
	        signs.add("A dynamic sculpture designed for tactile interaction, encouraging viewers to engage with art physically.");
	        signs.add("A contemporary piece exploring abstract forms and vibrant colors, reflecting the pulse of modern life.");
	        signs.add("A serene painting capturing the breathtaking beauty of a sunset, offering a moment of tranquility.");
	        signs.add("A classical statue of a Greek god, exemplifying the beauty and grace of ancient Greek sculptural art.");
	        signs.add("A futuristic digital artwork that transports the viewer into a virtual reality world, blurring the lines between reality and imagination.");
	        signs.add("An interactive artwork designed for tactile exploration, inviting viewers to touch and feel its textures.");
	        signs.add("A bold and colorful abstract piece, offering an expressive representation of emotions and energy.");
	        signs.add("A delicate watercolor depicting a peaceful scene, showcasing the fluidity and subtlety of the medium.");
	        signs.add("A raw and powerful sculpture carved from stone, symbolizing strength and endurance.");
	        signs.add("A captivating digital installation that combines technology and art to create an immersive experience.");
	        signs.add("A sculptural work designed to invite interaction, offering both aesthetic appeal and physical engagement.");
	        signs.add("A beautiful work of art created through intricate calligraphy, blending visual art with the written word.");
	        signs.add("A masterful oil painting, featuring rich colors and detailed brushwork that bring the scene to life.");
	        signs.add("A life-sized statue crafted from fine marble, embodying the elegance and perfection of classical sculpture.");
	        signs.add("A cutting-edge piece of art that merges real-world visuals with virtual elements through augmented reality technology.");
	        signs.add("A sculpture designed to stimulate the senses, combining tactile materials with sensory engagement.");
	        signs.add("A captivating landscape painting, bringing nature's beauty into the gallery space with vivid detail.");
	        signs.add("A detailed and lifelike painting of a figure, capturing the essence of the subject’s personality and character.");
	        signs.add("A solid bronze sculpture, capturing movement and emotion in a lasting form of art.");
	        signs.add("A digital piece that responds to viewer interaction, offering a dynamic and engaging experience.");
	        signs.add("A sculptural work created with a variety of textures, designed to engage the viewer's sense of touch.");
	        signs.add("A vibrant piece of urban street art, showcasing the creative expressions born from the streets.");
	        signs.add("A beautiful painting in the Impressionist style, capturing fleeting moments of light and color with loose brushwork.");
	        signs.add("A handcrafted sculpture formed from clay, showcasing the artist’s skill in shaping and molding.");
	        signs.add("A digital artwork that brings static images to life through animation and motion graphics.");
	        signs.add("A piece of tactile art, designed to be touched and explored to fully appreciate its textures and forms.");
	        signs.add("A charming folk art piece that reflects the simplicity and beauty of traditional craftsmanship.");
	        signs.add("A colorful and bold pop art painting, celebrating the vibrancy of popular culture and consumerism.");
	        signs.add("A finely crafted sculpture made of wood, showing the artist's mastery of carving and form.");
	        signs.add("A unique piece of art created entirely by artificial intelligence, challenging the boundaries of creativity.");
	        signs.add("An interactive sculpture designed with a variety of textures, inviting viewers to touch and explore.");
	        signs.add("A surreal painting that combines dreamlike imagery with reality, blurring the lines between the conscious and subconscious.");
	        signs.add("A beautifully rendered painting from the Renaissance period, full of rich color and intricate detail.");
	        signs.add("A detailed sculpture carved from limestone, combining organic forms with artistic precision.");
	        signs.add("A stunning digital painting that blends traditional techniques with modern technology to create lifelike artwork.");
	        signs.add("A sculpture that incorporates sound, transforming the traditional concept of art into an auditory experience.");
	        signs.add("A thought-provoking conceptual piece, emphasizing ideas over aesthetic appeal and challenging the viewer's perceptions.");
	        signs.add("A powerful charcoal drawing, capturing light and shadow with striking contrasts and fine detail.");
	        signs.add("A rustic sculpture carved from wood, symbolizing the connection between nature and artistic creation.");
	        signs.add("A digital portrait that responds to the viewer’s actions, creating a dynamic and personalized experience.");
	        signs.add("A tactile sculpture designed for hands-on exploration, combining texture and form in a physical interaction.");
	        signs.add("A glamorous art piece from the Art Deco period, combining sleek lines, vibrant colors, and geometric patterns.");
	        signs.add("A painting from the Modernist movement, reflecting the radical experimentation and innovation of the early 20th century.");
	        signs.add("A futuristic sculpture that blends innovative materials and shapes to imagine the possibilities of tomorrow.");
	        signs.add("A piece of art created using algorithms, where the final piece evolves through the process, creating unique and unpredictable results.");
	        signs.add("A piece of wall art that incorporates textured surfaces, inviting tactile engagement while enhancing visual depth.");
	        signs.add("A large-scale mural painted on a public wall, bringing street art into the gallery space.");
	        signs.add("A vibrant abstract expressionist painting, filled with dynamic shapes and colors that convey intense emotion.");
	        signs.add("A delicate sculpture made of crystal, capturing light and form in a stunning display of craftsmanship.");
	        signs.add("A 3D digital artwork that can be interacted with through various platforms, creating an immersive experience.");
	        signs.add("A tactile artwork designed to respond to touch, offering a sensory exploration that changes with interaction.");
	        signs.add("A piece of geometric artwork that explores shapes, lines, and spatial relationships with precision and harmony.");
	        signs.add("A classic still life painting capturing the beauty of everyday objects with light and shadow.");
	        signs.add("A wooden relief sculpture that combines depth and texture, offering a tactile experience for viewers.");
	        signs.add("A digital art piece combining technology and creativity to form a captivating visual display.");
	        signs.add("A sculpture that interacts with light, creating changing patterns and textures as the light source shifts.");
	        signs.add("A futuristic artwork that explores concepts of technology, progress, and innovation through visual expression.");
	        signs.add("An impressionist seascape painting that captures the beauty of the ocean with fluid brushstrokes and a sense of movement.");
	        signs.add("A powerful iron sculpture, symbolizing strength and permanence, crafted with industrial precision.");
	        signs.add("An interactive VR art piece that immerses the viewer in a fully digital, interactive environment.");
	        signs.add("A textured wall sculpture designed for tactile exploration, inviting viewers to engage with the surface.");
	        signs.add("A nature-inspired artwork that brings the organic world into a visual form, exploring natural beauty.");
	        signs.add("An abstract painting filled with vibrant colors and bold strokes, evoking emotion and energy.");
	        signs.add("A stone carving sculpture that showcases intricate craftsmanship and the timeless quality of stone.");
	        signs.add("An augmented reality installation that merges physical and digital worlds, offering a unique interactive experience.");
	        signs.add("A tactile interactive painting that engages both the visual and physical senses of the viewer.");
	        signs.add("A modern art piece that pushes the boundaries of conventional art, embracing innovation and abstraction.");
	        signs.add("A pastel portrait painting, capturing delicate details and soft textures through the medium of pastels.");
	        signs.add("A wooden abstract sculpture, offering a dynamic play of form and structure that engages the viewer's imagination.");
	        signs.add("A digital art piece enhanced by artificial intelligence, exploring the intersection of creativity and technology.");
	        signs.add("A sensory interactive sculpture designed to be explored by touch, offering a multi-sensory experience.");
	        signs.add("A monochrome artwork that explores shades of a single color to evoke emotion and contemplation.");
	        signs.add("A cubist painting that deconstructs objects into abstract forms, challenging traditional perspectives.");
	        signs.add("A stunning glass sculpture that reflects and refracts light, creating a dynamic interplay of colors and shadows.");
	        signs.add("A 3D digital experience, combining digital art with interactive elements to create an immersive environment.");
	        signs.add("A tactile art interaction that changes with touch, offering a personalized sensory experience.");
	        signs.add("An expressionist artwork filled with vibrant colors and expressive brushstrokes, capturing raw emotion.");
	        signs.add("A vintage oil painting that combines detailed realism with the softness of oil paints.");
	        signs.add("A bronze relief sculpture, capturing the subtle interplay of light and shadow through its three-dimensional design.");
	        signs.add("A virtual art gallery that allows users to explore a collection of artworks in an entirely digital space.");
	        signs.add("An interactive touch art piece that responds to human interaction, creating a unique experience with every touch.");
	        signs.add("A pop art modern artwork that embraces bold colors, familiar imagery, and a playful critique of culture.");
	        signs.add("An impressionist sunset painting that captures the changing colors of the sky in a fleeting moment.");
	        signs.add("A sculpture in motion, created with dynamic shapes that suggest movement and fluidity in space.");
	        signs.add("A digital storytelling art piece that combines technology and narrative to create an engaging experience.");
	        signs.add("A textured tactile experience that invites the viewer to explore various surfaces with their hands.");
	        signs.add("A landscape artwork illuminated with neon elements, combining traditional scenery with modern light effects.");
	        signs.add("A realistic portrait painting capturing the depth and character of its subject with lifelike precision.");
	        signs.add("A stone abstract sculpture that plays with form and negative space, creating a visual and tactile experience.");
	        signs.add("A virtual sculpture exhibition that brings digital representations of sculptures into the digital space for global access.");
	        signs.add("An interactive tactile wall that responds to touch, offering a hands-on exploration of art.");
	        signs.add("A futuristic concept artwork that imagines the future through abstract forms and technological inspiration.");
	        signs.add("A mixed media painting that combines different materials and textures to create a multidimensional experience.");
	        signs.add("A geometric metal sculpture that explores the relationship between form, space, and light.");
	        signs.add("A holographic digital art piece that creates three-dimensional, floating images in real space.");
	        signs.add("A touch-activated sculpture that changes when the viewer interacts with it, making the art dynamic and personal.");
	        signs.add("A cityscape artwork that captures the energy and vibrancy of urban life through artistic interpretation.");
	        signs.add("A watercolor cityscape painting that reflects the fluidity and softness of the medium in urban scenes.");
	        signs.add("An abstract expression sculpture that combines bold lines, angles, and textures to evoke emotion and thought.");
	        signs.add("An AI-generated digital portrait, combining the power of artificial intelligence with human-like artistic expression.");
	        signs.add("A responsive tactile art installation that changes based on the viewer’s interaction, inviting deeper engagement.");
	        signs.add("A geometric art piece painted on canvas, exploring the relationship between color, shape, and symmetry.");
	        signs.add("A floral painting, capturing the intricate beauty of flowers through delicate brushstrokes and soft hues.");
	        signs.add("A glass art sculpture that catches and bends light, creating an ethereal effect with its transparent forms.");
	        signs.add("An immersive digital art experience that surrounds the viewer with interactive visuals and sound.");
	        signs.add("A tactile sensory art piece that engages the viewer with both visual and physical interaction.");
	        signs.add("A futuristic abstract artwork, using bold colors and innovative shapes to imagine the future of art.");
	        signs.add("A historical portrait painting, capturing the likeness and essence of a significant figure from the past.");
	        signs.add("An abstract clay sculpture, featuring organic forms and textures created through the artist’s skilled hands.");
	        signs.add("An interactive digital sound art piece that combines visual art with sound, creating a multisensory experience.");
	        signs.add("A nature-inspired artwork that evokes the beauty of the natural world through the lens of contemporary art.");
	        signs.add("A charcoal sketch painting that captures the simplicity and elegance of monochrome shading.");
	        signs.add("A marble and metal sculpture that combines the solidity of marble with the sleekness of metal for a striking contrast.");
	        signs.add("An AI-inspired digital creation, where algorithms and machine learning are used to generate art that evolves over time.");
	        signs.add("A tactile experience sculpture designed to invite the viewer to explore texture and form through touch.");
	        signs.add("An abstract digital artwork that creates dynamic and evolving visuals in the digital space.");
	        signs.add("A portrait with surrealistic elements, blending dreamlike imagery with traditional portraiture.");
	        signs.add("A finely crafted wood-carved sculpture that captures the natural beauty of the material and the skill of the artist.");
	        signs.add("A futuristic artwork that combines abstract forms with technological inspiration to envision the future of art.");
	        signs.add("An impressionist seascape painting that captures the dynamic movement of the ocean through soft, fluid brushstrokes.");
	        signs.add("A strong and enduring iron sculpture, crafted with industrial strength and a sense of permanence.");
	        signs.add("An interactive VR art experience that immerses the viewer in a virtual world of creativity and imagination.");
	        signs.add("A textured wall sculpture that invites tactile exploration and offers a dynamic interplay of materials.");
	        signs.add("A nature-inspired artwork that celebrates the beauty and intricacy of the natural world through modern techniques.");
	        signs.add("An abstract painting that expresses emotion and ideas through bold strokes and vivid colors.");
	        signs.add("A stone carving sculpture that brings the artist’s vision to life through the permanence of stone.");
	        signs.add("An augmented reality installation that offers an immersive experience by blending the digital and physical worlds.");
	        signs.add("A tactile interactive painting that invites viewers to touch and explore the texture while enjoying the visual impact.");
	        signs.add("A modern art piece that embraces abstraction, innovation, and the breaking of traditional boundaries.");
	        signs.add("A pastel portrait painting capturing the delicate nuances of light and shadow, focusing on softness and realism.");
	        signs.add("An abstract sculpture crafted from wood, emphasizing form and texture in a natural material.");
	        signs.add("A digital artwork enhanced by AI, blending technology and creativity to create an innovative visual piece.");
	        signs.add("A sensory interactive sculpture designed to engage viewers with touch and movement, offering a dynamic experience.");
	        signs.add("A monochrome artwork that explores the emotional power of a single color through minimalistic design.");
	        signs.add("A cubist painting that deconstructs subjects into geometric shapes and abstract forms, challenging visual perception.");
	        signs.add("A glass sculpture that captures the light and transparency of the medium, creating a delicate and luminous effect.");
	        signs.add("A 3D digital experience that immerses the viewer in a virtual world, combining art with interactive digital technology.");
	        signs.add("A tactile art interaction piece that allows viewers to engage with the artwork physically, enhancing sensory experiences.");
	        signs.add("An expressionist artwork that conveys emotion and energy through vivid colors, bold brushstrokes, and dynamic shapes.");
	        signs.add("A vintage oil painting that brings classic techniques to life, capturing a timeless scene with rich color and detail.");
	        signs.add("A bronze relief sculpture, showcasing intricate designs and textures in the timeless medium of bronze.");
	        signs.add("A virtual art gallery that allows viewers to explore a curated collection of digital artworks in an immersive online space.");
	        signs.add("An interactive touch art piece that responds to human interaction, providing a personalized and engaging visual experience.");
	        signs.add("A modern pop art piece that combines popular culture imagery with bold colors and graphic design elements.");
	        signs.add("An impressionist painting of a sunset, capturing the fleeting beauty of light and color with loose, expressive brushwork.");
	        signs.add("A sculpture in motion, crafted to suggest movement and energy through dynamic and flowing shapes.");
	        signs.add("A digital storytelling art piece that combines narrative and visuals, creating an immersive experience through technology.");
	        signs.add("A textured tactile experience inviting viewers to explore different surfaces and sensations through touch.");
	        signs.add("A landscape artwork enhanced with neon elements, creating a unique blend of nature and modern light art.");
	        signs.add("A realistic portrait painting capturing fine details and subtle shading to bring the subject’s likeness to life.");
	        signs.add("An abstract stone sculpture that combines organic and geometric forms, engaging the viewer with both texture and shape.");
	        signs.add("A virtual sculpture exhibition that allows digital representation of sculptures to be explored in a virtual gallery space.");
	        signs.add("An interactive tactile wall that invites viewers to touch and explore, transforming the wall into an artistic experience.");
	        signs.add("A futuristic concept artwork exploring abstract forms and technological themes, envisioning the future through art.");
	        signs.add("A mixed media painting that combines various materials and techniques to create a multi-dimensional visual impact.");
	        signs.add("A geometric metal sculpture designed to play with form, symmetry, and the reflective properties of metal.");
	        signs.add("A holographic digital art piece that creates 3D images floating in space, merging technology and creativity.");
	        signs.add("A touch-activated sculpture that responds to human interaction, creating an evolving artistic experience with each touch.");
	        signs.add("A cityscape artwork that captures the energy and dynamism of urban life through artistic interpretation and vibrant colors.");
	        signs.add("A watercolor cityscape painting, offering a soft and fluid portrayal of an urban environment with delicate hues.");
	        signs.add("An abstract expression sculpture that uses bold forms and textures to express emotion, energy, and movement.");
	        signs.add("An AI-generated digital portrait, exploring the intersection of artificial intelligence and traditional portraiture.");
	        signs.add("A responsive tactile art installation that changes and reacts to the viewer’s touch, inviting exploration and interaction.");
	        signs.add("A geometric artwork on canvas, exploring patterns, symmetry, and abstract forms through precise brushstrokes.");
	        signs.add("A floral painting capturing the delicate beauty and intricate details of flowers, rendered with soft, blending brushwork.");
	        signs.add("A glass art sculpture that reflects light and color, creating a luminous and delicate visual experience.");
	        signs.add("An immersive digital art experience that surrounds viewers with interactive visuals and sound, creating a sense of being inside the art.");
	        signs.add("A tactile sensory art piece designed to engage the viewer’s sense of touch, offering a hands-on exploration of form and texture.");
	        signs.add("A futuristic abstract artwork that imagines a world of advanced technology and abstract, geometric shapes.");
	        signs.add("A historical portrait painting that captures the likeness and personality of its subject through traditional techniques.");
	        signs.add("An abstract clay sculpture, combining organic and geometric forms with textural depth and tactile appeal.");
	        signs.add("An interactive digital sound art piece, merging visuals and sound to create an immersive and multisensory artistic experience.");
	        signs.add("A sculpture with light interaction, changing in appearance based on the surrounding light, offering a dynamic visual experience.");
	        signs.add("A nature-inspired artwork, celebrating the beauty and diversity of the natural world through innovative artistic expression.");
	        signs.add("A charcoal sketch painting that captures the simplicity and elegance of form through the use of monochrome shading.");
	        signs.add("A marble and metal sculpture that contrasts the solidity of marble with the sleekness of metal, creating a striking visual contrast.");
	        signs.add("An AI-inspired digital creation, where artificial intelligence is used to generate unique art pieces that evolve over time.");
	        signs.add("A tactile experience sculpture designed to engage the viewer’s sense of touch, creating a physical interaction with the artwork.");
	        signs.add("An abstract digital artwork that uses technology to generate evolving visuals, exploring digital art in new ways.");
	        signs.add("A portrait with surrealistic elements, blending reality and fantasy to create a dreamlike representation of the subject.");
	        signs.add("A finely crafted wood-carved sculpture that highlights the beauty of natural wood, shaped into an elegant artistic form.");
	        
	  
	        myMuseum.addExhibit(new Exhibit("Ancient Civilizations"));
	        myMuseum.addExhibit(new Exhibit("Modern Art"));
	        myMuseum.addExhibit(new Exhibit("Renaissance Masterpieces"));
	        myMuseum.addExhibit(new Exhibit("Impressionist Paintings"));
	        myMuseum.addExhibit(new Exhibit("Futuristic Digital Art"));
	        myMuseum.addExhibit(new Exhibit("Sculptures Through Time"));
	        myMuseum.addExhibit(new Exhibit("Prehistoric Artifacts"));
	        myMuseum.addExhibit(new Exhibit("Baroque Era Paintings"));
	        myMuseum.addExhibit(new Exhibit("Interactive Tech Art"));
	        myMuseum.addExhibit(new Exhibit("Cultural Artifacts"));
	        myMuseum.addExhibit(new Exhibit("World War II History"));
	        myMuseum.addExhibit(new Exhibit("Modern Sculpture"));
	        myMuseum.addExhibit(new Exhibit("Surrealism and Fantasy"));
	        myMuseum.addExhibit(new Exhibit("Digital Art Installations"));
	        myMuseum.addExhibit(new Exhibit("Street Art and Graffiti"));
	        myMuseum.addExhibit(new Exhibit("Art from Africa"));
	        myMuseum.addExhibit(new Exhibit("Photography Through the Ages"));
	        myMuseum.addExhibit(new Exhibit("Ancient Egypt"));
	        myMuseum.addExhibit(new Exhibit("European History"));
	        myMuseum.addExhibit(new Exhibit("Ancient Greek and Roman Art"));
	        myMuseum.addExhibit(new Exhibit("Contemporary Photography"));
	        myMuseum.addExhibit(new Exhibit("Cubism and Abstract Art"));
	        myMuseum.addExhibit(new Exhibit("Japanese Art and Culture"));
	        myMuseum.addExhibit(new Exhibit("Art of the Americas"));
	        myMuseum.addExhibit(new Exhibit("Space and Astronomy"));
	        myMuseum.addExhibit(new Exhibit("Art of the Middle Ages"));
	        myMuseum.addExhibit(new Exhibit("Asian Dynasties"));
	        myMuseum.addExhibit(new Exhibit("The World of Dinosaurs"));
	        myMuseum.addExhibit(new Exhibit("Indigenous Cultures"));
	        myMuseum.addExhibit(new Exhibit("Historical Architecture"));
	        myMuseum.addExhibit(new Exhibit("Science and Innovation"));
	        myMuseum.addExhibit(new Exhibit("Famous Artists and Their Works"));
	        myMuseum.addExhibit(new Exhibit("Ancient Egyptian Artifacts"));
	        myMuseum.addExhibit(new Exhibit("Dinosaur Fossils and Skeletons"));
	        myMuseum.addExhibit(new Exhibit("Renaissance Art Masterpieces"));
	        myMuseum.addExhibit(new Exhibit("Ancient Roman Sculpture Collection"));
	        myMuseum.addExhibit(new Exhibit("Modern Art and Abstract Expressionism"));
	        
	       
	        
	        for(int index=0;index<36;index++) {
	        	exCount++;
	        	int startIndex = index*5;
	        	
	    
	            for(int i=0;i<5;i++) {
	        	if(startIndex+i <artCount) {
	            	myMuseum.getExhibit(index).addArtifactExhibit(myMuseum.getArtifact(startIndex+i),signs.get(startIndex+i));
	        	}
	        	
	        	}
	        }
	        	      		 
	        
	      
	      myMuseum.sortArtifacts();
	      myMuseum.sortExhibits();
	   

	//main museum menu listing options the user can choose to manage the museum exhibits,artifacts and annual plan
	boolean finished = false;
	do {
		int option = myMenu.getUserChoice();
		switch (option) {
		case 1:
			manageArtifacts();
			break;
		case 2:
			manageExhibits();
			break;
		case 3:
			manageAnnualPlan();
			break; 
		case 4:
			finished = true;
			break;
		default:
			System.out.println("Not a valid option.");
		}
	} while (!finished);
}
	public int getArtCount() {
		return artCount;
	}
	public void setArtCount(int num) {
	    artCount = num;
	}
	public int getExCount() {
		return exCount;
	}
	public void incrementExCount() {
		exCount+=1;
	}
	public Museum getMuseum() {
		return myMuseum;
	}
	//menu offering user options on managing  artifacts within the system
	public static void manageArtifacts() {
	String options[] = { "Add artifact","List artifacts","Remove an artifact","Update an artifact","Exit"};
	Menu myMenu = new Menu("Manage Artifacts", options);
	
	boolean finished = false;
	do {
		int option = myMenu.getUserChoice();
		switch (option) {
		case 1:
			addArtifact();
			break;
		case 2:
			listArtifacts();
			break;
		case 3:
			deleteArtifact();
			break;
		case 4:
			updateArtifact();
			break; 
		case 5:
			finished = true;
			break;
		default:
			System.out.println("Not a valid option.");
		}
	} while (!finished);
		
}
//method allowing user to add an artifact to the collection
public static void addArtifact() {
	if(artCount<MAX) {
		System.out.print("\nAdd a new Artifact: ");
		String name="";
		do {
		System.out.print("\nEnter name: ");
		name = input.nextLine();	
		} while(name=="");
		
		String inputValue = "";
		int engTime=0;
		do {
			inputValue = "";
			engTime=0;
		try{
			System.out.print("Enter engagement time: ");
		    inputValue+=input.nextLine();
		    engTime += Integer.parseInt(inputValue);   
		
		    if(engTime<0) {
		    	System.out.println("Engagement time cannot be negative. Please enter a positive value.");
		    } else {
		
		    break;
		    }
		
		
		}catch(Exception InputMismatchException) {
			System.out.println("Please enter valid engagement time.");		
		}	
		
		}while(engTime==0);
		
		ArtifactType type = selectType();
		
		System.out.print("New Artifact successfully added.\n");
		Artifact newArtifact = new Artifact(name, type,engTime);
		myMuseum.addArtifact(newArtifact);
		artCount++;
	}
	else {
		System.out.print("No room to add any more artifacts");
	}
}
public static boolean addArtifact(String newName, String inputValue, String newType) {
	boolean error = false;
	if(artCount<MAX) {
	
		
		String name =newName.trim();
		if(name.isEmpty()) {
			error=true;	
		} 
		
		int engTime=0;
		try{
		    engTime += Integer.parseInt(inputValue);   
		
		    if(engTime<=0) {
		    	error=true;
		    } 
		    
		}catch(Exception InputMismatchException) {
		  error = true;
		}
		
		ArtifactType type=null;
		try {
		type = ArtifactType.valueOf(newType);
		}catch(Exception e) {
			error=true;	
		}	
		
		Artifact newArtifact = new Artifact(name, type,engTime);
		myMuseum.addArtifact(newArtifact);
		artCount++;
	}
	else {
		error=true;
	}
	return error;

}
//method allowing user to delete an artifact from the collection
public static void deleteArtifact() {
	int delete = 0;
	String removedArtifact = "";
	if (artCount == 0) {
		System.out.println("Sorry, there are no artifacts.");
	}
	else {
		String artifactNames = "";
		for(int index=0; index<artCount;index++) {
			artifactNames= myMuseum.getArtifactName(index);
			System.out.println("\n"+(index+1)+". " + artifactNames); 
		}
		
		do {
			System.out.print("Which artifact would you like to remove? ");
			delete = searchArtifact();
			removedArtifact = myMuseum.getArtifactName(delete);
		try {
		myMuseum.deleteArtifact(delete);
		artCount--;
		validInput=true;
		} catch(Exception e) {
			System.out.print("No artifact removed. Please enter a valid option.\n");
		}	
	} while(!validInput);
		System.out.print("Artifact "+removedArtifact+" removed.\n");
	}
}
	public static boolean deleteArtifact(int delete) {
		boolean error=false;
	
		if (artCount == 0) {
			error=true;
		}
		else {
			try {
			myMuseum.deleteArtifact(delete);
			artCount--;
			} catch(Exception e) {
				error=true;
			}
		}
		return error;
}
	

//method that displays all artifacts within the collection		
public static void listArtifacts() {
	myMuseum.sortArtifacts();
	if(artCount == 0) {
		System.out.print("There are currently no Artifacts.\n");
	}
	else if(artCount==1) {
		System.out.print("Artifacts in museum are as follows: ");
		System.out.print(myMuseum.collectiontoString());
	}
	else {
		System.out.print("Artifacts in museum are as follows: ");
		myMuseum.sortArtifacts();
		System.out.print((myMuseum.collectiontoString()));
		
		}
}
	public static boolean listArtifacts(int artCount) {
		myMuseum.sortArtifacts();
		if(artCount == 0) {
			return true;
		}
		else if(artCount==1) {
			return false;
		}
		else {
			return false;
			
			}
		
		}
//method that allows user to update an artifact within the collection
public static void updateArtifact() {
	String updatedArtifact = "";
	if (artCount == 0) {
		System.out.println("Sorry, there are no artifacts.");
	}
	else {
		int update = 0;
		for(int index=0; index<artCount;index++) {
			updatedArtifact = myMuseum.getArtifactName(index);
			System.out.println((myMuseum.getArtifact(index).getCode())+". " + updatedArtifact);
		}
		do {
			System.out.print("\nSelect which artifact to update: ");
		    update = searchArtifact();
			
			try {
				myMuseum.getArtifact(update);
				validInput = true;
			} catch(Exception e) {
				System.out.print("Please select a valid artifact to update.\n");
			}
		} while(!validInput);
		
		System.out.print("Please enter new information for artifact "+  myMuseum.getArtifactName(update)  + "\n");
		
		String newName = "";
			do {
			System.out.print("Enter name: ");
		    newName = input.nextLine();
			} while(newName=="");
				
			String inputValue = "";
			int newEngTime=0;
			do {
				inputValue = "";
				newEngTime=0;
			try{
				System.out.print("Enter engagement time: ");
			    inputValue+=input.nextLine();
			    newEngTime += Integer.parseInt(inputValue);   
			
			    break;
			
			
			}catch(Exception InputMismatchException) {
				System.out.println("Please enter valid engagement time.");		
			}	
			
			}while(newEngTime==0);	
			
			ArtifactType type = selectType();
		
		myMuseum.updateArtifact(update,newName,type,newEngTime);
		System.out.print("Artifact has been updated.\n");
	}
	}
public static boolean updateArtifact(int update, String newName, String inputValue, String newType) {
	boolean error=false;
	if (artCount == 0) {
		error=true;
	}
	else {
	
			try {
				myMuseum.getArtifact(update);
			} catch(Exception e) {
				error=true;
			}
		
			String name =newName.trim();
			if(name.isEmpty()) {
				error=true;	
			} 
			
			int engTime=0;
			try{
			    engTime += Integer.parseInt(inputValue);   
			
			    if(engTime<=0) {
			    	error=true;
			    } 
			    
			}catch(Exception InputMismatchException) {
			  error = true;
			}
			
			ArtifactType type=null;
			try {
			type = ArtifactType.valueOf(newType);
			}catch(Exception e) {
				error=true;	
			}	
			
			myMuseum.updateArtifact(update,newName,type,engTime);
		}
		
		return error;
	}
	
	

//method allowing user to select a new artifact type when updating or adding an artifact
public static ArtifactType selectType() {
	String options[] = { "Artwork", "Painting", "Sculpture", "Digital","Tactile","Other" };
	Menu typeSelect = new Menu("Select a Type", options);
	int choice = typeSelect.getUserChoice();
	switch (choice) {
	case 1:
		return ArtifactType.ARTWORK;
	case 2:
		return ArtifactType.PAINTING;
	case 3:
		return ArtifactType.SCULPTURE;
	case 4:
		return ArtifactType.DIGITAL;
	case 5:
		return ArtifactType.TACTILE;
	default:
		return ArtifactType.OTHER;
	}
}
//menu showing user options in managing exhibits
	public static void manageExhibits() {
		String options[] = { "Add Exhibit","List exhibits","Remove an exhibit","Update an exhibit","Exit"};
		Menu myMenu = new Menu("Manage Exhibits", options);
		
		boolean finished = false;
		do {
			int option = myMenu.getUserChoice();
			switch (option) {
			case 1:
				addExhibit();
				break;
			case 2:
				listExhibits();
				break;
			case 3:
				deleteExhibit();
				break;
			case 4:
				updateExhibit();
				break;  
			case 5:
				finished = true;
				break;
			default:
				System.out.println("Not a valid option.");
			}
		} while (!finished);
	}

			
	//method allowing the user to add an exhibit
	public static void addExhibit() {
		
		if(artCount<MAX) {
			
		  
			System.out.print("\nAdd a new Exhibit: ");
			  String name = "";
			    do {
			    System.out.print("\nEnter name: ");
			    name = input.nextLine();
		    }while(name.trim().isEmpty());
			    
			Exhibit newExhibit = new Exhibit(name);
			
			String options[] = { "Choose from existing artifacts","Add new artifacts","Exit"};
			Menu myMenu = new Menu("Add artifacts", options);
			
			boolean finito = false;
			
			do {
				int option = myMenu.getUserChoice();
				switch (option) {
				case 1:
					if(artCount>5) {
					listArtifacts();
					for(int index=0;index<5;index++) {
					System.out.print("Please select artifacts: ");
					int selectedArtifact = searchArtifact();
					System.out.println("Selected artifact: "+myMuseum.getArtifact(selectedArtifact).getName());
					String newSign = "";
					do {
					System.out.print("Enter new sign for artifact: ");
					newSign = input.nextLine();
					}while(newSign.trim().isEmpty());
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(selectedArtifact),newSign);
				    if(newExhibit.getRoute().size()==5) {
				    	break;
				    }
					}
					
					}
					else {
						System.out.print("There are not enough artifacts to select from.\n");
					}
					myMuseum.addExhibit(newExhibit);
					exCount++;
					System.out.print("New exhibit successfully added.\n");
					finito=true;
					break;
				case 2:
					for(int index=0;index<5;index++) {
						addArtifact();
						String newSign = "";
						do {
						System.out.print("Enter new sign for artifact: ");
						newSign = input.nextLine();
						}while(newSign.trim().isEmpty());
						int length = myMuseum.collectionLength();
						newExhibit.addArtifactExhibit(myMuseum.getArtifact(length-1),newSign);
						}
					myMuseum.addExhibit(newExhibit);
					exCount++;
					System.out.print("New exhibit successfully added.\n");
					finito=true;
				case 3:
					finito=true;
					break;
				}
			}while(!finito);
			
		} 
	}

public static boolean addExhibit(String name, int a1,String sign1, int a2,String sign2,int a3,String sign3,int a4,String sign4,int a5,String sign5) {
				boolean error = false;
				if(name.trim().isEmpty()) {
					error = true;
				}
				Exhibit newExhibit = new Exhibit(name);
                  
				    if(newExhibit.getRoute().size()<=5) {
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(a1),sign1);
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(a2),sign2);
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(a3),sign3);
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(a4),sign4);
					newExhibit.addArtifactExhibit(myMuseum.getArtifact(a5),sign5);
			
					}
                   
					myMuseum.addExhibit(newExhibit);
					exCount++;
					return error;
}



	//method allowing user to view all exhibits
	public static void listExhibits() {
		myMuseum.sortExhibits();
		if(exCount == 0) {
			System.out.print("There are currently no Exhibits.\n");
		}
		else if(exCount==1) {
			System.out.print("Exhibits in museum are as follows: ");
			System.out.print((myMuseum.exhibitstoString()));
		}
		else {
			System.out.print("Exhibits in museum are as follows: ");
			System.out.print((myMuseum.exhibitstoString()));
			
			}
		
}
	public static boolean listExhibits(int exCount) {
		myMuseum.sortExhibits();
		boolean error = false;
		if(exCount == 0) {
			error = true;
		}
		
		return error;
	}
	//method allowing the user to delete an exhibit from the system
	public static void deleteExhibit() {
		int delete = 0;
		String removedExhibit = "";
		myMuseum.sortArtifacts();
		if (exCount == 0) {
			System.out.println("Sorry, there are no exhibits.");
		}
		else {
			String exhibitNames = "";
			for(int index=0; index<exCount;index++) {
				exhibitNames= myMuseum.getExhibitName(index);
				System.out.println("\n"+(index+1)+". " + exhibitNames); 
			}
			
			do {
				System.out.print("Search for which exhibit you would like to remove: ");
				delete = searchExhibit();
				removedExhibit = myMuseum.getExhibitName(delete);
			try {
			myMuseum.deleteExhibit(delete);
			exCount--;
			validInput=true;
			} catch(Exception e) {
				System.out.print("No exhibit removed. Please enter a valid option.\n");
			}	
		} while(!validInput);
		}System.out.print("Exhibit "+removedExhibit+" removed.\n");
	}
	public static boolean deleteExhibit(int delete) {
		boolean error = false;
		myMuseum.sortArtifacts();
		if (exCount == 0) {
			error=true;
		}
		else {
			try {
			myMuseum.deleteExhibit(delete);
			exCount--;
			} catch(Exception e) {
				error=true;
			}
		}
		return error;
		
	
	}
	//method allowing the user to update an exhibit and the artifacts within it in the museum
	public static void updateExhibit() {
		String updatedExhibit = "";
		int update = 0;
		int index = 0;
		
		if (exCount == 0) {
			System.out.println("Sorry, there are no exhibits.");
		}
		else {
	
			for(index=0; index<exCount;index++) {
					updatedExhibit = myMuseum.getExhibitName(index);
					System.out.println((index+1)+". " + updatedExhibit);
				}
				System.out.print("\nSelect which exhibit to update: ");
			    update = searchExhibit();
			
			System.out.print("Please enter new information for exhibit "+  myMuseum.getExhibitName(update)  + "\n");
			String newName = "";
			do { 
				System.out.print("Enter name: ");
			    newName = input.nextLine();
				} while(newName =="");
			
			myMuseum.updateExhibit(update, newName);
			
					ArrayList<Artifact> updateRoute=(myMuseum.getExhibit(update).getRoute());
					boolean stop = false;
					
						do {
							for(index=0; index<updateRoute.size();index++) {
								System.out.println((index+1)+". " + updateRoute.get(index).getName());
							}
						System.out.print("Please select artifact to update by number: ");
					    int selectedArtifact = input.nextInt();
					    input.nextLine();
					    if(selectedArtifact>=1 && selectedArtifact<=updateRoute.size()) {
					    	String newArtifactName="";
							do {
							System.out.print("Enter name: ");
							newArtifactName = input.nextLine();
							} while(newArtifactName.isEmpty());
							String inputValue = "";
							int newEngTime=0;
							do {
								inputValue = "";
								newEngTime=0;
							try{
								System.out.print("Enter engagement time: ");
							    inputValue+=input.nextLine();
							    newEngTime += Integer.parseInt(inputValue);   
							    break;
							
							
							}catch(Exception InputMismatchException) {
								System.out.println("Please enter valid engagement time.");		
							}	
							
							}while(newEngTime==0);
							
							ArtifactType type = selectType();
							
							String signString = "";
							do {
								System.out.print("Enter a new sign for artifact: ");
								signString = input.nextLine();
								
							} while(signString.isEmpty());
								
					    myMuseum.getExhibit(update).updateArtifact(selectedArtifact-1, newArtifactName, newEngTime, type, signString);
					    System.out.print("Artifact has been updated.\n");
					    }
					    else {
					    	System.out.print("Please select a valid artifact.\n");
					    }
					    
					    System.out.print("Would you like to update another one? (yes/no) \n");
					    String answer = input.nextLine();
					    if(answer.equals("yes") || answer.equals("Yes")) {
					    	stop = false;
					    }
					    else if(answer.equals("no") || answer.equals("No")) {
					    		stop = true;
					    	}
					    else {
					    	stop = true;
					    }
					    
						}while(!stop);
			
			System.out.print("Exhibit has been updated.\n");
		}
	}
	public static boolean updateExhibit(int index,String name,int updateA,String newName, String inputValue,String newType, String newSign) {
		boolean error = false;

		if (exCount == 0) {
			error = true;
		}
		else {		
			if(name.trim().isEmpty()) {
				error = true;
			}
			myMuseum.updateExhibit(index, name);
			
					ArrayList<Artifact> updateRoute=(myMuseum.getExhibit(index).getRoute());
					
					
					    if(updateA>=0 && updateA<=updateRoute.size()-1) {
					    	if(newName.isEmpty()) {
					    	error = true;
					    	}
					    	
					    	int engTime=0;
							try{
							    engTime += Integer.parseInt(inputValue);   
							
							    if(engTime<=0) {
							    	error=true;
							    } 
							    
							}catch(Exception InputMismatchException) {
							  error = true;
							}
							
							ArtifactType type=null;
							try {
							type = ArtifactType.valueOf(newType);
							}catch(Exception e) {
								error=true;	
							}	
							
							if(newSign.isEmpty()) {
								error = true;
							} 
					    myMuseum.getExhibit(index).updateArtifact(updateA, newName, engTime, type, newSign);
					    } else {
					    	error = true;
					    }
		}
			
			return error;
					    
		
	}
	//menu displaying options for user to manage the annual plan
	public static void manageAnnualPlan() {
		String options[] = { "Create plan","View plan","Modify plan","Exit"};
		Menu myMenu = new Menu("Manage Annual Plan", options);
		
		boolean finished = false;
		do {
			int option = myMenu.getUserChoice();
			switch (option) {
			case 1:
				createPlan();
				break;
			case 2:
				viewPlan();
				break;
			case 3:
				modifyPlan();
				break; 
			case 4:
				finished = true;
				break;
			default:
				System.out.println("Not a valid option.");
			}
		} while (!finished);
	}
	//method allowing the user to create a new annual plan
	public static void createPlan() {
		String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int index=0; index<=exCount;index++) {
			System.out.println((index+1)+". " + myMuseum.getExhibitName(index));
		}
		for(int index=0;index<12;index++) {
			System.out.print("Please select exhibits for "+ months[index]+": ");
		    System.out.print("\nExhibit hall 1: ");
		    int select = searchExhibit();
		    hall1.add(myMuseum.getExhibit(select));
		    System.out.print("\nExhibit hall 2: ");
		    int select2 = searchExhibit();
		    hall2.add(myMuseum.getExhibit(select2));
		    System.out.print("\nExhibit hall 3: ");
		    int select3 = searchExhibit();
		    hall3.add(myMuseum.getExhibit(select3));

			
		}
		annualPlan.add("");
		}
			
	    //method displaying the annual plan to the user
		public static void viewPlan() {
			if(annualPlan.size()>0) {
			annualPlan.clear();
			String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};		
			int spaces=0;
			annualPlan.add("\n       Exhibit Hall 1      Exhibit Hall 2      Exhibit Hall 3");
			for(int index=0;index<12;index++) {
				spaces =10-months[index].length();
				annualPlan.add("\n"+months[index] +" ".repeat(spaces)+ hall1.get(index).getName() +"        "+ hall2.get(index).getName()+"        "+hall3.get(index).getName()+"\n");
			} 
			
			System.out.print("Annual plan: ");
			for (int i = 0; i < annualPlan.size(); i++) {
	            System.out.print(annualPlan.get(i)); 
			} 
			} else {
				System.out.print("No annual plan created yet.\n");
			}
		}
			
			
		//method allowing the user to modify the annual plan
		public static void modifyPlan() {
				
			String months[]= {"january","february","march","april","may","june","july","august","september","october","november","december"};
			System.out.print("Select which month: ");
			String month = input.nextLine();
			month.toLowerCase();
			month.trim();
			System.out.print("Select which Exhibit hall (1,2,3): ");
			int hall = input.nextInt();
			input.nextLine();

			for(int index=0;index<12;index++) {
				if(month.equals(months[index])) {
					if(hall==1) {
						for(int i=0; i<=exCount;i++) {
							System.out.println((i+1)+". " + myMuseum.getExhibitName(i));
						}
						System.out.print("Please select a new exhibit: ");	
					    int user= searchExhibit();
					    Exhibit updateExhibit= myMuseum.getExhibit(user);
					    hall1.set(index, updateExhibit);
					    break;
					}
					else if(hall==2) {
						for(int i=0; i<exCount;i++) {
						System.out.println((i+1)+". " + myMuseum.getExhibitName(i));
					}
					System.out.print("Please select a new exhibit: ");	
					int user = searchExhibit();
				    Exhibit updateExhibit= myMuseum.getExhibit(user);
				    hall2.set(index, updateExhibit);
				    break;
						}
					else if(hall==3) {
						for(int i=0; i<exCount;i++) {
							System.out.println((i+1)+". " + myMuseum.getExhibitName(i));
						}
						System.out.print("Please select a new exhibit: ");	
						int user= searchExhibit();
					    Exhibit updateExhibit= myMuseum.getExhibit(user);
					    hall3.set(index, updateExhibit);
					   break;
						}
					else {
						System.out.print("Please select a valid hall. \n");
					}
				}
				else {
					System.out.print("Please select a valid month. \n");
				}
			
		
		}
			System.out.println("Plan updated.");
		}
		
		public static int searchExhibit() {
			int result = -1;
			String targetString = "";
			int targetInt=0; 
			ArrayList<Exhibit> searchResult = new ArrayList<Exhibit>();
		    String options[] = {"Search by uniqueID", "Search by name"};
			Menu myMenu = new Menu("\nSearch for exhibit", options);
			boolean finished = false;
			do {
				int option = myMenu.getUserChoice();
				switch (option) {
				case 1:
				System.out.print("Enter exhibit unique ID: "); 
				 targetInt = input.nextInt();
				 input.nextLine();
				 result = myMuseum.searchExhibitID(targetInt);
				 finished=true;
				 if(result == -1) {
					 System.out.print("\nExhibit not found.");
				 }
				break;
				case 2:
					System.out.print("Enter exhibit name: "); 
					 targetString = input.nextLine().toLowerCase();
					if(targetString != null) {
						searchResult.addAll(myMuseum.resultOfExhibitName(targetString));
						if(searchResult.size() >0) {
							for(int index=0;index<searchResult.size();index++) {
							System.out.print((index+1)+". "+searchResult.get(index).getName()+"\n");
							}
							System.out.print("\nPlease select exhibit: ");
							int selection = input.nextInt();
							input.nextLine();
							Exhibit stringResult = searchResult.get(selection-1);
							result = myMuseum.searchExhibitName(stringResult);
							finished=true;
						
						}
						else {
							System.out.print("Exhibit not found.\n");
						}
					}
					break;
									
				}
			}while(!finished);
		 return result;
		}
		public static boolean searchExhibitByID(int id) {
			int result = -1; 
			     boolean error = false;
				 result = myMuseum.searchExhibitID(id);
				 if(result == -1) {
					 error = true;
				 }
				 return error;
		}
		public static boolean searchExhibitByName(String targetString,int selection) {
		int result=-1;
		ArrayList<Exhibit> searchResult = new ArrayList<Exhibit>();
		boolean error=false;
				
					 targetString = targetString.toLowerCase();
					if(!targetString.isEmpty()) {
						searchResult.addAll(myMuseum.resultOfExhibitName(targetString));
						if(searchResult.size() >0) {
							Exhibit stringResult = searchResult.get(selection);
							result = myMuseum.searchExhibitName(stringResult);
						    if(result==-1) {
						    	error = true;
						    }
						} else {
							error=true;
						}
					}
						else {
							error=true;
						}
							
		 return error;
		}
		public static int searchArtifact() {
			int result = -1;
			String targetString = "";
			int targetInt=0;
			ArrayList<Artifact> searchResult = new ArrayList<Artifact>();
		    String options[] = {"Search by uniqueID", "Search by name"};
			Menu myMenu = new Menu("\nSearch for artifact", options);
			boolean finished = false;
			do {
				int option = myMenu.getUserChoice();
				switch (option) {
				case 1:
				System.out.print("Enter artifact unique ID: "); 
				 targetInt = input.nextInt();
				 input.nextLine();
				 result = myMuseum.searchArtifactID(targetInt);
				 finished=true;
				 if(result == -1) {
					 System.out.print("\nArtifact not found.");
				 }
				break;
				case 2:
					System.out.print("Enter artifact name: "); 
					 targetString = input.nextLine().toLowerCase();
					if(targetString != null) {
						searchResult.addAll(myMuseum.resultOfArtifactName(targetString));
						if(searchResult.size() >0) {
							for(int index=0;index<searchResult.size();index++) {
							System.out.print((index+1)+". "+searchResult.get(index).getName()+"\n");
							}
							System.out.print("\nPlease select exhibit: ");
							int selection = input.nextInt();
							input.nextLine();
							Artifact stringResult = searchResult.get(selection-1);
							result = myMuseum.searchArtifactName(stringResult);
							finished=true;
						
						}
						else {
							System.out.print("Artifact not found.\n");
						}
					}
					break;
									
				
				case 3:
					ArtifactType type = selectType();
					searchResult = myMuseum.resultOfArtifactType(type);
					if(searchResult.size() >0) {
						for(int index=0;index<searchResult.size();index++) {
						System.out.print((index+1)+". "+searchResult.get(index).getName()+"\n");
						}
						System.out.print("\nPlease select artifact by number: ");
						int selection = input.nextInt();
						input.nextLine();
						Artifact typeResult = searchResult.get(selection-1);
						result = myMuseum.searchArtifactType(typeResult);
					}
					
				}
			}while(!finished);
		 return result;
		}
		public static boolean searchArtifactByID(int id) {
			int result = -1; 
			     boolean error = false;
				 result = myMuseum.searchArtifactID(id);
				 if(result == -1) {
					 error = true;
				 }
				 return error;
		}
		public static boolean searchArtifactByName(String targetString,int selection) {
		int result=-1;
		ArrayList<Artifact> searchResult = new ArrayList<Artifact>();
		boolean error=false;
				
					 targetString = targetString.toLowerCase();
					if(!targetString.isEmpty()) {
						searchResult.addAll(myMuseum.resultOfArtifactName(targetString));
						if(searchResult.size() >0) {
							Artifact stringResult = searchResult.get(selection);
							result = myMuseum.searchArtifactName(stringResult);
						    if(result==-1) {
						    	error = true;
						    }
						} else {
							error=true;
						}
					}
						else {
							error=true;
						}
							
		 return error;
		}
		public static boolean searchArtifactByType(String stringType,int selection) {
			int result=-1;
			ArrayList<Artifact> searchResult = new ArrayList<Artifact>();
			boolean error=false;
			ArtifactType type = ArtifactType.valueOf(stringType);
			searchResult = myMuseum.resultOfArtifactType(type);
			if(searchResult.size() >0) {
				Artifact typeResult = searchResult.get(selection);
				result = myMuseum.searchArtifactType(typeResult);
				if(result==-1) {
					error = true;
				}
		} else {
			error=true;
		}
			return error;
		}
}
		



			
				
		

	
	
	
	








