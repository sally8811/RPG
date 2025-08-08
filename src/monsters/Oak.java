package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	
	public Oak(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public void setHp() {
		this.hp = Dice.get(170, 230);
	}
	
	public void setOffensive() {
		this.offensive = Dice.get(9, 15);
	}

}
