package introUnit;

public class Junior extends Student{

	private String internship;
	
	public Junior(String name, String internship) {
		super(name);
		this.internship = internship;
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a junior!");
		System.out.println("I intern as a "+internship+".");
	}
}
