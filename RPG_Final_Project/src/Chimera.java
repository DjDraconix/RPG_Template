
public class Chimera extends Villain {
	int Hp = 170;
	double dodge = 35.0;
	
	Chimera() {
		super(170, 35.0);
	}
	
	@Override
	public String toString() {
		return "The Chymera is at " + getHp() + " Hp";
	}
	
	@Override
	public int attack1() {
		// A snake tail attack \ "weaker" attack
		return (int) ((Math.random() * 10) + 10);
	}
	
	@Override
	public int attack2() {
		// A bite and gore attack from the lion and goat heads
		return (int) ((Math.random() * 20) + 10);
	}
	
	@Override
	public int sAttack() {
		// The dragon head blasts elemental breath at random
		return 4;
	}
	
	@Override
	public int special() {
		// this will have the chimera make two of each attack and one sAttack 
		return 2;
	}
	
}
