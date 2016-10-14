package JonathanArray;

public class SampleElement {
	
	//field
	private int number;
	
	//constructor
	public SampleElement(int value){
		number = value;
	}
	
	public int getNumber(){
		return number;
	}
	
	public void increase(){
		int x = number;
		x++;
	}
}
