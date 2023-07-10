
public class Archer extends Player{
	
	int UsedMp = 5;
	
	Archer() {
		super(80, 80, 50, 55.0f, 10);
	}
	
	@Override
	public int UsedMp() {
		return UsedMp;
	}

	@Override
	public int attack() {
		// Shoot a bow
		return ((int)(Math.random() * 5) + 10);
	}

	@Override
	public int sAttack1() {
		// Torch Arrow, can proc burn
		if (Mp > 5) {
			Mp -= 5;
			return ((int)(Math.random() * 5) + 5);
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack2() {
		// Frost Blast Arrow, can proc freez
		if (Mp > 5) {
			Mp -= 5;	
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack3() {
		// Flash Bang Arrow, can proc stun
		if (Mp > 5) {
			Mp -= 5;	
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public int buff() {
		// Uses Mp to improve dodge chance
		if (Mp > 20) {
			Mp -= 20;
			dodge += 10;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Hp: " + getHp() + " Mp: " + getMp() + " Potions: " + getPotions();
	}

	@Override
	public String readAttacks() {
		return "1) Shoot Bow: 2) Torch Arrow 5 Mp: 3) Frost Blast Arrow 5 Mp: "
				+ "4) Flash Bang Arrow 5 Mp: 5) Evade 20 Mp";
	}

}
