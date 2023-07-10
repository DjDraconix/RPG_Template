
public class Chimera extends Villain {
	int Hp = 170;
	double dodge = 35.0;
	
	Chimera() {
		super(170, 35.0f);
	}
	
	@Override
	public String toString() {
		return "The Chymera is at " + getHp() + " Hp";
	}
	
	@Override
	public int attack1() {
		// A snake tail attack \ "weaker" attack
		System.out.println("You are bit with the Chimera's tail");
		return (int) ((Math.random() * 10) + 10);
	}
	
	@Override
	public int attack2() {
		// A bite and gore attack from the lion and goat heads
		System.out.println("You are gored and chomped by the Chimera");
		return (int) ((Math.random() * 20) + 10);
	}
	
	@Override
	public int sAttack() {
		// The dragon head blasts elemental breath at random
		System.out.println("The dragon head of the Chimera spews elements");
		return 4;
	}
	
	@Override
	public int special() {
		// the chimera goes into a frenzy and makes two of each attack and one sAttack 
		System.out.println("The Chimera goes into a frenzy");
		return 3;
	}

	@Override
	protected void regenerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setDodge() {
		// TODO Auto-generated method stub
		
	}
	
}
