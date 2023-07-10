
public class OrcShaman extends Villain{
	int Hp = 90;
	double dodge = 25.0;
	
	OrcShaman() {
		super(90, 25.0f);
	}
	
	@Override
	public String toString() {
		return "The Orc Shaman is at " + getHp() + " Hp";
	}
	
	@Override
	public int attack1() {
		// A weak attack with a stick
		return (int) ((Math.random() * 5) + 5);
	}
	
	@Override
	public int attack2() {
		// the orc causes the surrounding trees to smack the player
		return (int) ((Math.random() * 5) + 7);
	}
	
	@Override
	public int sAttack() {
		// A weak spell that can proc burn, freez and stun
		return 2;
	}
	
	@Override
	public int special() {
		// This should allow the orc to make three casts of the sAttack()
		return 1;
	}
	
}
