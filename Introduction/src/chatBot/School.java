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

}
