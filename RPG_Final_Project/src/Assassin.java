
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
		System.out.println("The Assassin stabs you with a dagger");
		return (int) ((Math.random() * 5) + 2);
	}
	
	@Override
	public int attack2() {
		// A slash from a hidden blade
		System.out.println("The Assassin slashes at you with a hidden blade");
		return (int) ((Math.random() * 5) + 5);
	}
	
	@Override
	public int sAttack() {
		// This attack will ignore the player dodge chance
		System.out.println("The Assassin stikes true");
		return 3;
	}
	
	@Override
	public int special() {
		System.out.println("The Assassin begins to leave after immages");
		return 2;
	}
	
	public void setDodge() {
		dodge += 15;
	}

	@Override
	protected void regenerate() {
		// TODO Auto-generated method stub
		
	}
	
}
