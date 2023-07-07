
public class Barbarian extends Player {
	int Hp = 150;
	int HpMax = 150;
	int Mp = 20;
	double dodge = 20.0;
	int potions = 10;
	
	Barbarian() {
		super(150, 150, 20, 20.0, 10);
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
	public void buff() {
		// Rage, gain 50 hp and make two attacks
		if (Mp > 0) {
			Mp -= 10;
			Hp += 50;
		}
		//make the attacks

	}
	
	@Override
	public String toString() {
		return "Hp: " + getHp() + " Mp: " + getMp() + " Potions: " + getPotions();
	}

	@Override
	public String readAttacks() {
		return null;
	}
}
