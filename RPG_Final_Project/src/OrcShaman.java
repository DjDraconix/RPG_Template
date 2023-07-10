
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
		System.out.println("The Orc attacks you with a stick");
		return (int) ((Math.random() * 5) + 5);
	}
	
	@Override
	public int attack2() {
		System.out.println("The Orc causes the surrounding trees to smack you");
		return (int) ((Math.random() * 5) + 7);
	}
	
	@Override
	public int sAttack() {
		System.out.println("The Orc casts a Hex");
		return 2;
	}
	
	@Override
	public int special() {
		System.out.println("Hexes flow from the Orc chainging reality");
		return 1;
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
