
public class Archer extends Player{
	int Hp = 80;
	int HpMax = 80;
	int Mp = 50;
	double dodge = 75.0;
	int potions = 10;
	Archer() {

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
	public void buff() {
		// Uses Mp to improve dodge chance
		if (Mp > 20) {
			Mp -= 20;
			dodge += 10;
		}
	}

}
