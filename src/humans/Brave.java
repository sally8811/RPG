package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void setHp() {
		this.hp = Dice.get(170, 230);
	}
	
	public void setOffensive() {
		this.offensive = Dice.get(7, 13);
	}
}
