
public abstract class Villain {
	int Hp;
	int HpMax;
	double dodge;

	boolean burn = false;
	boolean freez = false;
	boolean stun = false;
	
	Villain() {
		
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
	
	public boolean isBurned() {
		return burn;
	}
	
	public boolean isFrozen() {
		return freez;
	}
	
	public boolean isStuned() {
		return stun;
	}
	
	public int getHp() {
		return Hp;
	}
	
	public double getDodge() {
		return dodge;
	}
	
	public abstract String toString();
	
	public abstract int attac1();
	
	public abstract int attack2();
	
	public abstract int sAttack();
	
	public abstract void special();
	
}
