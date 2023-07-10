
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
		System.out.println("The Slime tackles you");
		return (int) ((Math.random() * 5) + 1);
	}

	@Override
	public int attack2() {
		System.out.println("The Slime smacks you with a psudopod");
		return (int) ((Math.random() * 5) + 3);
	}

	@Override
	public int sAttack() {
		System.out.println("The Slime attempts to engulf you");
		return 1;
	}

	@Override
	public int special() {
		System.out.println("The Slime collects slime to gain back health");
		return 0;
	}
	
	public void regenerate() {
		Hp += 30;
	}

	@Override
	protected void setDodge() {
		// TODO Auto-generated method stub
		
	}

}
