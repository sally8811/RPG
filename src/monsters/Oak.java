package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	
	public Oak(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public int hp = Dice.get(170, 230);
	public int offensive = Dice.get(9, 15);

}
