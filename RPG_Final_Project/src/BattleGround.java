import java.util.Scanner;

public class BattleGround {
	static Villain[] enemyTypes;
	public static void main(String[] args) {

	}
	static void runGame() {
		Scanner in = new Scanner(System.in);
		generateEnemyTypes();
		Villain creature = selectEnemyCreature(in);
		Player character = selectPlayerClass(in);
		
		in.close();
	}
	
	static Player selectPlayerClass(Scanner in) {
		System.out.println("What class will you be playing"
				+ "\n1) Mage    2) Archer    3) Barbarian");
		Player character = null;
		int hold = in.nextInt();
		boolean run = true;
		while (run) {
			switch (hold) {
			case 1: character = new Mage(); 
				System.out.print("Mage " + character.toString());
				run = false;
				break;
			case 2: character = new Archer();
				System.out.print("Archer " + character.toString());
				run = false;
				break;
			case 3: character = new Barbarian();
				System.out.print("Barbarian " + character.toString());
				run = false;
				break;
			default: System.out.println("That is not a class Please try again");
				hold = in.nextInt();
				break;
			}
		}
		
		return character;
	}

	static Villain selectEnemyCreature(Scanner in) {
		Villain creature = null;
		System.out.println("What would you like to fight"
				+ "\n1) Slime: Easy and weak"
				+ "\n2) Orc Shaman: Uses nature to cast spells"
				+ "\n3) Assassin: Dodges attacks and can hit past your dodge"
				+ "\n4) Chimera: Hits hard and has elemental attacks");
		
		boolean run = true;
		int userSelection;
		while (run) {
			userSelection = in.nextInt();
			if(userSelection < 0 || userSelection >= enemyTypes.length) continue;
			creature = enemyTypes[userSelection];
			System.out.println(creature.toString());
			run = false;
		}
		return creature;
	}
	static void generateEnemyTypes() {
		enemyTypes = new Villain[4];
		enemyTypes[0] = new Slime();
		enemyTypes[1] = new OrcShaman();
		enemyTypes[2] = new Assassin();
		enemyTypes[3] = new Chimera();
	}
}
