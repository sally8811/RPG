package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public int hp = Dice.get(170, 230);
	public int offensive = Dice.get(7, 13);
		
	
	

}
