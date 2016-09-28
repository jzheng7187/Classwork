package chatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			JonathanMain.print("Tell me about school.");
			schoolResponse = JonathanMain.getInput();
			if(schoolResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
			}
			else{
			JonathanMain.print("That's my favorite part about school too.");
			}
		}
		
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		if(JonathanMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(JonathanMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
