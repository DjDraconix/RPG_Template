
public abstract class Villain {
	int Hp;
	float dodge;

	boolean burn = false;
	boolean freez = false;
	boolean stun = false;
	
	Villain(int nHp, float nDodge) {
		Hp = nHp;
		dodge = nDodge;
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
	
	public abstract int attack1();
	
	public abstract int attack2();
	
	public abstract int sAttack();
	
	public abstract int special();

	protected abstract void regenerate();

	protected abstract void setDodge();
	
}
