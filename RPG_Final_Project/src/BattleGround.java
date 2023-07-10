import java.util.Scanner;

public class BattleGround {
	static Villain[] enemyTypes;
	public static void main(String[] args) {
		runGame();

	}

	static void runGame() {
		Scanner in = new Scanner(System.in);
		generateEnemyTypes();

		Player character = selectPlayerClass(in);
		System.out.println();
		Villain creature = selectEnemyCreature(in);
		gameLoop(character, creature, in);

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
			System.out.print("You selected the Mage");
			run = false;
			break;
			case 2: character = new Archer();
			System.out.print("You selected the Archer");
			run = false;
			break;
			case 3: character = new Barbarian();
			System.out.print("You selected the Archer");
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
			if(userSelection < 1 || userSelection > enemyTypes.length) continue;
			creature = enemyTypes[userSelection - 1];
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

	static void gameLoop(Player character, Villain creature, Scanner in) {
		boolean run = true;
		int userInput;
		while (run) {
			System.out.println("Your turn");
			System.out.println(character.toString());
			System.out.println(character.readAttacks());
			userInput = in.nextInt();
			
			while (userInput > 5 || userInput < 1) {
				System.out.println("Please enter a correct ipnput");
				userInput = in.nextInt();
			}
			
			if (character.isBurned()) {
				character.takeDamage((int) ((Math.random() * 5) + 10));
				character.toggleBurn();
			}
			if (character.isFrozen()) {
				character.takeDamage((int) ((Math.random() * 5) + 10));
				character.toggleFreez();
				userInput = 0;
			}
			if (character.isStuned()) {
				character.toggleStun();
				userInput = 0;
			}
			
			switch (userInput) {
			case 0: System.out.println("You are unable to move");
			break;
			case 1: if (creature.getDodge() < Math.random() * 100) {
				creature.takeDamage(character.attack());
			}
			break;
			case 2: if (creature.getDodge() < Math.random() * 100) {
				if (character.sAttack1() == 0) continue;
				character.setMp(character.UsedMp());
				creature.takeDamage(character.sAttack1());
				if (creature.isBurned() == false) {
					if (66.6 < Math.random() * 100) {
						creature.toggleBurn();
					}
				}
			}
			break;
			case 3: if (creature.getDodge() < Math.random() * 100) {
				if (character.sAttack2() == 0) continue;
				character.setMp(character.UsedMp());
				creature.takeDamage(character.sAttack2());
				if (creature.isFrozen() == false) {
					if (66.6 < Math.random() * 100) {
						creature.toggleFreez();
					}
				}
			}
			break;
			case 4: if (creature.getDodge() < Math.random() * 100) {
				if (character.sAttack3() == 0) continue;
				character.setMp(character.UsedMp());
				creature.takeDamage(character.sAttack3());
				if (creature.isStuned() == false) {
					if (66.6 < Math.random() * 100) {
						creature.toggleStun();
					}
				}
			}
			break;
			case 5: if (character.buff() == 1) {
				creature.takeDamage(character.attack());
				creature.takeDamage(character.attack());
				creature.takeDamage(character.attack());
			}
			break;
			}
			
			int cAction = (int) ((Math.random() * 4) + 1);
			if (creature.isBurned()) {
				creature.takeDamage((int) ((Math.random() * 5) + 10));
				creature.toggleBurn();
			}
			if (creature.isFrozen()) {
				creature.takeDamage((int) ((Math.random() * 5) + 10));
				creature.toggleFreez();
				cAction = 0;
			}
			if (creature.isStuned()) {
				creature.toggleStun();
				cAction = 0;
			}

			
			System.out.println(creature.toString());
			if (character.getHp() == 0 || creature.getHp() == 0) {
				run = false;
			}
		}
		if (character.getHp() == 0) {
			System.out.println("You have lost, Try agian");
		} else {
			System.out.println("You defeated the creature, Please play again");
		}
	}
}
