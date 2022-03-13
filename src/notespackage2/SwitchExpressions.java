package notespackage2;
public class SwitchExpressions { 
	public static void main(String[] args) throws Exception {
		String pluginChoice = "drums";// choose: "sample", "bass", "keyboard", "synth", drums
		String recommendation = getRecommendation(pluginChoice);
		System.out.println("Recommended plug-in: " + recommendation);
	}
	
	private static String getRecommendation(String pluginChoice) throws Exception {
		return switch(pluginChoice) {
			case "drums" -> "Linn LM1";
			case "sample" -> "Serato Sample";
			case "bass", "keyboard", "synth" -> { // SWITCH EXPRESSION: The switch expression allows multiple comma-separated
				// values per case and returns a value for the whole switch-case block.
				String company = "Arturia"; 
				yield "Analog Lab- " + company;
			}
			default -> throw new Exception("Not a valid choice");

		};
		
	}
}