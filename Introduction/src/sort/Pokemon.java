package sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level) {
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}

	public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();

	}

	public void iChooseYou() {
		System.out.println("I choose you," + name + ".");
	}

	public void setHp(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHP(){
		return hp;
	}
}
