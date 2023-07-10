 
public abstract class Player {
	int Hp;
	int HpMax;
	int Mp;
	float dodge;
	int potions;

	boolean burn = false;
	boolean freez = false;
	boolean stun = false;

	Player() {

	}

	Player(int nHp, int nHpMax, int nMp, float nDodge, int nPotions) {
		Hp = nHp;
		HpMax = nHpMax;
		Mp = nMp;
		dodge = nDodge;
		potions = nPotions;
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
		if (Hp < 0) {
			Hp = 0;
		}
	}

	public abstract int attack();

	public abstract int sAttack1();

	public abstract int sAttack2();

	public abstract int sAttack3();

	public abstract int buff();

	public void usePotion() {
		Hp += ((int)(Math.random() * 15) + 5);
		if (Hp > HpMax) {
			Hp = HpMax;
		}

	}
	
	public boolean isBurned() {
		return burn;
	}
	
	public boolean isFrozen() {
		return freez;
	}
	
	public boolean isStuned() {
		return stun;
	}

	public int getMp() {
		return Mp;
	}
	
	public void setMp (int mp) {
		Mp = Mp + mp;
	}
	
	public int getHp() {
		return Hp;
	}
	
	public double getDouble() {
		return dodge;
	}
	
	public int getPotions() {
		return potions;		
	}

	public abstract String toString();
	
	public abstract String readAttacks();
	
	public abstract int UsedMp();
	
}
