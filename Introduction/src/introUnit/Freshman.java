package introUnit;

public class Freshman extends Student{

	private String internship;
	
	public Freshman(String name, String internship) {
		super(name);
		// TODO Auto-generated constructor stub
		this.internship = internship;
	}

	public void talk(){
		super.talk();
		System.out.println("... and I am a Freshman!");
		System.out.println("I intern as a "+internship+".");
	}
}
