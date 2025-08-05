package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	
	public Dragon(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public int hp = Dice.get(270, 330);
	public int offensive = Dice.get(12, 18);

}
