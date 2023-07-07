
public class Mage extends Player {
	int Hp = 80;
	int HpMax = 80;
	int Mp = 100;
	double dodge = 25.0;
	int potions = 5;
	
	Mage(){
		super(80, 80, 100, 25.0, 5);
	}

	@Override
	public int attack() {
		// A week staff attack
		return ((int)(Math.random() * 5) + 2);
	}

	@Override
	public int sAttack1() {
		// Fire Ball, can proc burn
		if (Mp > 5) {
			Mp -= 5;	
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack2() {
		// Frost Ray, can proc freez
		if (Mp > 5) {
			Mp -= 5;	
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public int sAttack3() {
		// Lightning Strike, can proc stun
		if (Mp > 5) {
			Mp -= 5;	
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public void buff() {
		// Consume a potion to raise mp and hp
		if (potions > 0) {
			potions--;
			Hp += ((int)(Math.random() * 15) + 5);
			if (Hp > HpMax) {
				Hp = HpMax;
			}
			Mp += ((int)(Math.random() * 15) + 5);
		}
	}	

	@Override
	public String toString() {
		return "Hp: " + getHp() + " Mp: " + getMp() + " Potions: " + getPotions();
	}

	@Override
	public String readAttacks() {
		// TODO Auto-generated method stub
		return null;
	}


}
