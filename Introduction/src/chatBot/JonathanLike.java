package chatBot;

public class JonathanLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;
	
	
	public void talk() {
		JonathanMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = JonathanMain.getInput();
			int likePsn = JonathanMain.findKeyword(likeResponse, "like", 0); 
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				JonathanMain.print("You are such an interesting person, because you like " + thingsLiked);
				if(JonathanMain.findKeyword(thingsLiked, "school", 0) >= 0){
					inLikeLoop = false;
					JonathanMain.school.talk();
				}else{
					inLikeLoop = false;
					JonathanMain.talkForever();
				}
			}
			else{
				JonathanMain.print("I don't understand you");
			}
		}
		 
	}


	@Override
	public boolean isTriggered(String userInput) {
		if(JonathanMain.findKeyword(userInput, "like", 0) >= 0){
			return true;
		}
		return false;
	}

}
