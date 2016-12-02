package sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	//anonymous inner type: an implementation of an interface written into a parameter
	
	
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

	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			 System.out.println("The attack hit");
		 }else{
			 System.out.println("The attack missed");
		 }
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

	public void lapse() {
			if(poisoned){
				hp -= 15;
			}
		
	}
}
