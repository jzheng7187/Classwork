package introUnit;

public class Senior extends Student {
	
	private String internship;

	public Senior(String name, String internship) {
		super(name);
		// TODO Auto-generated constructor stub 
		//calls the constructor
		//Senior can't exist if Student doesn't exist.
		this.internship = internship;
	}

	public void talk(){
		super.talk();
		//calls the super method
		System.out.println("... and I am a senior!");
		//the name is private
		System.out.println("I intern as a "+internship+".");
	}
}
