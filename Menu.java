public class Menu{
	public static void main(String[] args){
		
		boolean loop = true;
		double goldfishTurns = 0;
		double turtleTurns = 0;
		double snakeTurns = 0;
		int snakeWins = 0, snakeLosses = 0;
		double parakeetTurns = 0;
		int parakeetWins = 0, parakeetLosses = 0;
		double rabbitTurns = 0;
		int rabbitWins = 0, rabbitLosses = 0;
		double ratTurns = 0;
		int ratWins = 0, ratLosses = 0;
		double dogTurns = 0;
		int dogWins = 0, dogLosses = 0;
		int choice = 0;
		double  tmp;
		int gCount = 0, tCount = 0, sCount = 0, pCount = 0, rabCount = 0, ratCount = 0, dCount = 0;
		int[] para = new int[2];
		int[] snake = new int[2];
		
		System.out.println("Welcome to the MTG Benchmarker!");
		
		do{
			choice = 0;
			System.out.println("Please select an option below:");
			System.out.println("(1) Test rules");
			System.out.println("(2) Goldfish");
			System.out.println("(3) Turtle");
			System.out.println("(4) Snake");
			System.out.println("(5) Parakeet");
			System.out.println("(6) Rabbit");
			System.out.println("(7) Rat");
			System.out.println("(8) Dog");
			System.out.println("(99) exit");
			do{
			choice = IO.readInt();
			}while(choice < 1 && choice > 8 && choice == 99);
			if(choice == 99){
				loop = false;
			}
			if(choice == 1){
				System.out.println("Select the test you wish to see rules for:");
				System.out.println("(1) Goldfish");
				System.out.println("(2) Turtle");
				System.out.println("(3) Snake");
				System.out.println("(4) Parakeet");
				System.out.println("(5) Rabbit");
				System.out.println("(6) Rat");
				System.out.println("(7) Dog");
				do{
					choice = IO.readInt();
				}while(choice < 1 || choice > 8);
				rulesRead.Read(choice);
			}
			if(choice == 2){
				tmp = pet.Goldfish();
				goldfishTurns = goldfishTurns + tmp;
				gCount++;
			}
			if(choice == 3){
				tmp = pet.Turtle();
				turtleTurns = turtleTurns + tmp;
				tCount++;
			}
			if(choice == 4){
				snake = pet.Snake();
				if(snake[0] == 1){
					snakeWins++;
				}else{
					snakeLosses++;
				}
				snakeTurns = snakeTurns + snake[1];
			}
			if(choice == 5){
				para = pet.Parakeet();
				if(para[0] == 1){
					parakeetWins++;
				}else{
					parakeetLosses++;
				}
				parakeetTurns = parakeetTurns + para[1];
				pCount++;

			}
			if(choice == 6){

			}
			if(choice == 7){

			}
			if(choice == 8){

			}

		}while (loop == true);
		System.out.println("Thanks for benchmarking!");
		System.exit(1);
	}
}
