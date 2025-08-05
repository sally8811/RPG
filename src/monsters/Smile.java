package monsters;

import bases.Monster;
import utils.Dice;

public class Smile extends Monster{
	
	public Smile(String name, String weapon, int hp, int offensive) {
		super(name, weapon);
		this.hp = hp;
		this.offensive = offensive;
	}
	
	public int hp = Dice.get(70, 130);
	public int offensive = Dice.get(5, 11);
}
