
public class Slime extends Villain{

	Slime() {
		super(70, 10.0f);
		System.out.println(Hp);
		
	}
	
	@Override
	public String toString() {
		return "The Slime is at " + getHp() + " Hp";
	}

	@Override
	public int attack1() {
		// a light jump attack
		return (int) ((Math.random() * 5) + 1);
	}

	@Override
	public int attack2() {
		// a light smack with a psudopod
		return (int) ((Math.random() * 5) + 3);
	}

	@Override
	public int sAttack() {
		// This will have the slime attempt to cover the apponent in slime to proc stun
		return 1;
	}

	@Override
	public int special() {
		// collect slime to gain back health
		return 0;
	}

}
