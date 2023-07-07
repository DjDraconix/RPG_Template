import java.util.Scanner;

public class BattleGround {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What class will you be playing"
				+ "\n1) Mage    2) Archer    3) Barbarian");
		int hold = in.nextInt();
		boolean run = true;
		while (run) {
			switch (hold) {
			case 1: Player character = new Mage(); 
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
		run = true;
	}
}
