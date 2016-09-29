package chatBot;

public class JonathanHello implements Topic {

	public boolean inHelloLoop;
	public String helloResponse;
	
	public int helloCount;
	
	private static String[] calmResponses = 
		{"We have already said our hellos. Remember?", 
				"Yes,hello to you too. Let's actually talk."
		};
	private static String[] angryResponses = 
		{"Okay, seriously. This has to stop",
				"You are beginning to annoy me." + "We've SAID HELLO" 
		};
	
	//responses are constant
	public JonathanHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = JonathanMain.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				JonathanMain.talkForever();
			}
		}
	}

	private void printResponse() {
		int responseIndex = 0;
		//calm response
		if(helloCount < 5){
			responseIndex = (int)(Math.random()*calmResponses.length);
			JonathanMain.print(calmResponses[responseIndex]);
		}
		//angry response
		else{
			responseIndex = (int)(Math.random()*angryResponses.length);
			JonathanMain.print(angryResponses[responseIndex]);
		}
		
	}

	public boolean isTriggered(String userInput) {
		if(JonathanMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(JonathanMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		return false;
	}

}
