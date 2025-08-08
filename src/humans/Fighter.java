package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void setHp() {
		this.hp = Dice.get(240, 300);
	}
	
	public void setOffenisve() {
		this.offensive = Dice.get(17, 23);
	}

}
