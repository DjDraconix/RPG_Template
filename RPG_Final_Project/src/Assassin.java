
public class Assassin extends Villain{
	int Hp = 100;
	double dodge = 30.0;
	
	Assassin() {
		super(100, 30.0f);
	}
	
	@Override
	public String toString() {
		return "The Assassin is at " + getHp() + " Hp";
	}
	
	@Override
	public int attack1() {
		// A stab with a dagger
		return (int) ((Math.random() * 5) + 2);
	}
	
	@Override
	public int attack2() {
		// A slash from a hidden blade
		return (int) ((Math.random() * 5) + 5);
	}
	
	@Override
	public int sAttack() {
		// This attack will ignore the player dodge chance but deals less damage
		return 3;
	}
	
	@Override
	public int special() {
		//Improve dodge chance by 15% each use to a max of 75%
		return 0;
	}
	
}
