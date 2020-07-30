import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		int dieOne = rollDie();
		int dieTwo = rollDie();
		
		System.out.println("First Die Number: " + dieOne);
		System.out.println("Second Die Number: " + dieTwo);

	}
	
	public static int rollDie() {
		Random randomNum = new Random(); 
		int dieRoll = randomNum.nextInt(6) + 1;
		return dieRoll;
	}

}
