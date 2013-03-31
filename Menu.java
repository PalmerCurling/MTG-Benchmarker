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
		int dogWins = 0, dogLosses = 0, dogCount = 0;
		int choice = 0;
		double  tmp;
		int gCount = 0, tCount = 0, sCount = 0, pCount = 0, rabCount = 0, ratCount = 0, dCount = 0;
		int[] para = new int[2];
		int[] snake = new int[2];
		int[] rabbit = new int[2];
		int[] rat = new int[2];
		int[] dog = new int[2];

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
				sCount++;
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
				rabbit = pet.Rabbit();
				if(rabbit[0] == 1){
					rabbitWins++;
				}else{
					rabbitLosses++;
				}
				rabbitTurns = rabbitTurns + rabbit[1];
				rabCount++;
			}
			if(choice == 7){
				rat = pet.Rabbit();
				if(rat[0] == 1){
					ratWins++;
				}else{
					ratLosses++;
				}
				ratTurns = ratTurns + rat[1];
				ratCount++;
			}
			if(choice == 8){
				dog = pet.Dog();
				if(dog[0] == 1){
					dogWins++;
				}else{
					dogLosses++;
				}
				dogTurns = dogTurns + rat[1];
				dogCount++;
			}

		}while (loop == true);
		
		System.out.println("Goldfish Results:");
		double gFinal = goldfishTurns / gCount;
		System.out.println(gFinal+"average number of turns to win");

		System.out.println("Turtle Results:");
		double tFinal = turtleTurns / tCount;
		System.out.println(tFinal+"average number of turns to win");
		
		System.out.println("Snake Results:");
		double sfinal = snakeTurns / sCount;
		System.out.println("Average turns to finish: "+sfinal);
		System.out.println("Win/loss ratio: "+snakeWins+"/"+snakeLosses);

		System.out.println("Parakeet Results:");
		double pfinal = parakeetTurns / pCount;
		System.out.println("Average turns to finish: "+pfinal);
		System.out.println("Win/loss ratio: "+parakeetWins+"/"+parakeetLosses);
		
		System.out.println("Rabbit Results:");
		double rabfinal = rabbitTurns / rabCount;
		System.out.println("Average turns to finish: "+rabfinal);
		System.out.println("Win/loss ratio: "+rabbitWins+"/"+rabbitLosses);
		
		System.out.println("Rat Results:");
		double ratfinal = ratTurns / ratCount;
		System.out.println("Average turns to finish: "+ratfinal);
		System.out.println("Win/loss ratio: "+ratWins+"/"+ratLosses);
		
		System.out.println("Dog Results:");
		double dfinal = dogTurns / dCount;
		System.out.println("Average turns to finish: "+dfinal);
		System.out.println("Win/loss ratio: "+dogWins+"/"+dogLosses);

		System.out.println("Thanks for benchmarking!");
		System.exit(1);
	}
}
