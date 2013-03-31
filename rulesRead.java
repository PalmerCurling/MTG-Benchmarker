public class rulesRead{
	public static void Read(int choice){
		String cont = null;
		do{
		if(choice == 1){
			System.out.println("Win. As fast as you can.");
			System.out.println("This is a test of speed, so we will keep track of how many turns it takes for you to win");
		}
		if(choice == 2){
			System.out.println("Like a turtle, this opponent is going to hole up on you.");
			System.out.println("With Ivory Tower + Circles of Protection, he attempts to outlive you.");
			System.out.println("Crush him.");
		}
		if(choice == 3){
			System.out.println("Snakes like squishing things. This snake is going to try to squish your magic deck & ego.");
			System.out.println("With a pair of black vises dealing you damage from turn one, can you win fast enough to survive?");
		}
		if(choice == 4){
			System.out.println("Parakeets sometimes come in pairs, and like biting things.");
			System.out.println("This parakeet is going to try to take bite out of your life total if it can; if it cant, its just going to try to survive.");
		}
		if(choice == 5){
			System.out.println("Rabbits. they multiply.");
			System.out.println("Can you survive the hoard?");
		}
		if(choice == 6){
			System.out.println("Rats. More specifically Plague Rats.");
			System.out.println("Is survival possible?");
		}
		if(choice == 7){
			System.out.println("Dogs are pretty smart. they can interact with you, apply pressure, and steal some games.");
			System.out.println("Think you can teach a java dog new tricks?");
		}
		System.out.println("(press enter to continue)");
			cont = IO.readString();
		}while(cont.equals("continue"));

	}
}
