
public class Barbarian extends Player {
	
	int UsedMp = 1;
	
	Barbarian() {
		super(150, 150, 20, 20.0f, 10);
	}
	
	@Override
	public int UsedMp() {
		return UsedMp;
	}

	@Override
	public int attack() {
		// Powerful Axe attack
		return ((int)(Math.random() * 5) + 20);
	}

	@Override
	public int sAttack1() {
		// Red Rune, can proc burn
		if (Mp > 0) {
			Mp--;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack2() {
		// Blue Rune, can proc freez
		if (Mp > 0) {
			Mp--;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack3() {
		// Yellow Rune, can proc stun
		if (Mp > 0) {
			Mp--;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int buff() {
		// Rage, gain 50 hp and make two attacks
		if (Mp > 0) {
			Mp -= 10;
			Hp += 50;
		}
		return 1;
		//make the attacks

	}
	
	@Override
	public String toString() {
		return "Hp: " + getHp() + " Mp: " + getMp() + " Potions: " + getPotions();
	}

	@Override
	public String readAttacks() {
		return "1) Axe Swing: 2) Red Rune 1 Mp: 3) Blue Rune 1 Mp: 4) Yellow Rune 1 Mp: 5) Rage 10 Mp";
	}
}
