package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;

		this.hp = Dice.get(240, 300);
		this.offensive = Dice.get(17, 23);
	}

}
