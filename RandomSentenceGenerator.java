import java.util.Random;

public class RandomSentenceGenerator {
	
	static String Idea;
	
	String generateIdea(){
		String [] Technologies = {"Amazon Echo", "HoloLens", "Oculus Rift", "iPad", "Quantum Computing", "Pebble", "Machine Learning", "Artificial Intelligence", "Cross-platform", "Cloud Computing"};
		String [] Products = {"Notetaking app", "Social media platform", "Personal assistant", "Frogger game", "Sleep tracker", "Fitness app", "Data virtualization", "Data mining", "Productivity app", "Uber", "AirBnB", ""};
		String [] Demographics = {"Seniors", "Teens", "Hipsters", "Young Professionals", "Toddlers", "Big Families", "Billionaires", "Vegans", ""};
		String [] Inspiration = {"Climate change", "Net neutrality", "Bitcoin", "Big Data", "Big Data"};
		
		
		String result= "";
		
		//"A TECHNOLOGIE PRODUCT for DEMOGRAPHIC built using LANGUAGE"
		
		Random technology_index = new Random();
		int tIndex = technology_index.nextInt(Technologies.length);
		
		Random products_index = new Random();
		int pIndex = products_index.nextInt(Products.length);
		
		Random demographics_index = new Random();
		int dIndex = demographics_index.nextInt(Demographics.length);
		
		Random inspiration_index = new Random();
		int iIndex = inspiration_index.nextInt(Inspiration.length);

		result = Technologies[tIndex] + " " + Products[pIndex] + " " + " for " + Demographics[dIndex] + " interested in " + Inspiration[iIndex];
		return result;
		
	}
	
	public String getIdeas(String input){
		return Idea;
	}
	
}
