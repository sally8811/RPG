package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	
	public Wizard(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;

		this.hp = Dice.get(120,180);
		this.offensive = Dice.get(12, 18);
	}

}
