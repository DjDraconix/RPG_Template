
public class Mage extends Player {

	int UsedMp = 5;
	
	Mage(){
		super(80, 80, 100, 25.0f, 5);
	}
	
	@Override
	public int UsedMp() {
		return UsedMp;
	}

	@Override
	public int attack() {
		// A week staff attack
		System.out.println("You hit with your staff");
		return ((int)(Math.random() * 5) + 2);
	}

	@Override
	public int sAttack1() {
		// Fire Ball, can proc burn
		if (Mp > 5) {
			Mp -= 5;
			System.out.println("You shoot a Fire Ball");
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
			System.out.println("You cast Frost Ray");
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
			System.out.println("You hit a Lightning Strike");
			return ((int)(Math.random() * 5) + 10);
		} else {
			return 0;
		}
	}

	@Override
	public int buff() {
		// Consume a potion to raise mp and hp
		if (potions > 0) {
			potions--;
			System.out.println("You drink a mana potion restoring Hp and Mp");
			Hp += ((int)(Math.random() * 15) + 5);
			if (Hp > HpMax) {
				Hp = HpMax;
			}
			Mp += ((int)(Math.random() * 15) + 5);
		}
		return 0;
	}	

	@Override
	public String toString() {
		return "Hp: " + getHp() + " Mp: " + getMp() + " Potions: " + getPotions();
	}

	@Override
	public String readAttacks() {
		return "1) Staff Attack: 2) Fire Ball 5 Mp: 3) Frost Ray 5 Mp: 4) Lightning Strike "
				+ "5 Mp: 5) Mana Potion: 6) Use Potion";
	}


}
