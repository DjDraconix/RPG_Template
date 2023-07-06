
public abstract class Player {
	int Hp = 100;
	int HpMax = 100;
	int Mp = 30;
	double dodge = 25.0;
	int potions = 10;

	boolean burn = false;
	boolean freez = false;
	boolean stun = false;

	Player() {

	}

	public void toggleBurn() {
		if (burn == false) {
			burn = true;
		} else {
			burn = false;
		}
	}

	public void toggleFreez() {
		if (freez == false) {
			freez = true;
		} else {
			freez = false;
		}
	}

	public void toggleStun() {
		if (stun == false) {
			stun = true;
		} else {
			stun = false;
		}
	}

	public void takeDamage(int damage) {
		Hp -= damage;
	}

	public abstract int attack();

	public abstract int sAttack1();

	public abstract int sAttack2();

	public abstract int sAttack3();

	public abstract void buff();

	public void usePotion() {
		Hp += ((int)(Math.random() * 15) + 5);
		if (Hp > HpMax) {
			Hp = HpMax;
		}

	}


}
