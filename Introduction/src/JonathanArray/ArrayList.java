package JonathanArray;

public class ArrayList {

	public static void main(String[] args) {
		arrayIntoMethod();
	}

	private static void arrayIntoMethod() {
		int [] randoms = new int[50];
		int index = 0;
		for(int b:randoms){
			index ++;
			b = (int) ((Math.random() * 50) + 3);
			System.out.println(index + ") "+ b); 
		}
	}

}
