package monsters;

import bases.Monster;
import utils.Dice;

public class Smile extends Monster{
	
	public Smile(String name, String weapon) {
		super(name, weapon);
	
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}
}
