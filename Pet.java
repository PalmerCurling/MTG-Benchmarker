import java.util.*;

public class Pet{
	public static double Goldfish(){
		int turn = 1;
		int first = (int) Math.round(Math.random());
		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
		}
		System.out.println("type pass  after each turn you take; type win when your deck would have won.");

		String cont = null;

		do{
			System.out.println("It is turn "+turn);
			cont = IO.readString();
			turn++;
		}while(cont.equals("pass"));
		return turn;
	}
	public static double Turtle(){
		int turn = 1;
		int first = (int) Math.round(Math.random());
		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
		}
		System.out.println("type pass after each turn you take; type win when your deck would have won.");

		String cont = null;
		int lands = 0;
		int hand = 7;
		int life = 20;
		int effect = 0;

		String[] boardTemp = {"CoP: White","CoP: Blue","CoP: Black","CoP: Red","CoP: Green","CoP: Artifacts","Ivory Tower"};
		ArrayList<String> board = new ArrayList<String>();
		for(int i = 0; i < boardTemp.length; i++){
			board.add(boardTemp[i]);
		}

		do{ 
			effect  = 0;
			System.out.println("Turtle's life: "+life);
			System.out.println("It is turn "+turn);
			System.out.println("Turtle's board:");
			for(int i = 0; i < board.size(); i++){
				System.out.print(board.get(i)+" ");
			}

			System.out.println("\nAny discard effects?");
			boolean disc = IO.readBoolean();
			if(disc){
				System.out.println("how many cards?");
				effect = IO.readInt();
				hand = hand - effect;
			}

			System.out.println("Any destroy effects?");
			boolean destroy = IO.readBoolean();
			if(destroy){
				System.out.println("Select the target:");
				for(int i = 0; i < board.size(); i++){
					System.out.print((i)+": "+board.get(i)+", ");
				}
				do{
					effect = IO.readInt();
				}while(effect < 0 || effect > board.size());
				board.remove(effect);
			}
			System.out.println("PRECOMBAT!");
			System.out.println("How many lands did you draw?");
			int tmp = IO.readInt();
			lands = lands + tmp;

			System.out.println("Turtle's board:");
			for(int i = 0; i < board.size(); i++){
				System.out.print(board.get(i)+" ");
			}
			System.out.println("\nTurtle will prevent "+lands+" sources of damage from whatever colors he has available");

			System.out.println("type pass to go to next turn; done to indicate victory");
			cont = IO.readString();
			turn++;
			System.out.println("How much damage are you dealing? (ignoring sources mitigated by CoP)");
			int damage = IO.readInt();
			life = life - damage;
			if(board.get((board.size())-1) == "Ivory Tower"){
				if(hand - 4 > 0){
					life = life + (hand - 4);
				}
			}
		}while(cont.equals("pass"));
		return turn;
	}
	public static int[] Parakeet(){
		int[] para = new int [2];
		para[0] = 1;
		para[1] = 1;
		int turn = 1;
		int first = (int) Math.round(Math.random());
		boolean attack, dead;
		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
		}
		System.out.println("type pass after each turn you take; type win when your deck would have won.");

		System.out.println("Parakeet's board:");
		if(para[1] == 1){
			System.out.println("Drudge Skeleton");
		}
		if(para[0] == 1){
			System.out.println("Phantom Monster");
		}		

		String cont = null;



		System.out.println("Type pass if Parakeet is still alive after combat.");
		do{
			if(para[1] == 1){
				System.out.println("Did Drudge Skeleton get sent to the graveyard for good?");
				attack = IO.readBoolean();
				if(attack){
					para[1] = 0;
					System.out.println("Do you have any ground creatures Drudge Skeleton could block?");
					attack = IO.readBoolean();
					if(attack){
						System.out.println("Drudge Skeleton stays untapped");
					}else{
						System.out.println("Drudge Skeleton attacks");
					}
				}
			}
			if(para[0] == 1){
				System.out.println("Do you have flyers with power > 3?");
				attack = IO.readBoolean();
				if(attack){
					System.out.println("Phantom Monster remains untapped");
				}else{
					System.out.println("Phantom Monster attacks for 3");
				}

				System.out.println("Did Phantom Monster get killed?");
				dead = IO.readBoolean();
				if(dead){
					para[0] = 0;
				}
			}
			System.out.println("Parakeet's board:");
			if(para[1] == 1){
				System.out.println("Drudge Skeleton");
			}
			if(para[0] == 1){
				System.out.println("Phantom Monster");
			}

			System.out.println("It is turn "+turn);
			cont = IO.readString();
			turn++;
		}while(cont.equals("pass"));
		System.out.println("Did you win?");
		attack = IO.readBoolean();
		if(attack){
			para[0] = 1;
		}else{
			para[0] = 0;
		}
		para[1] = turn;
		return para;
	}


	public static int[] Snake(){
		int[] snake = new int [2];
		snake[0] = 1;
		snake[1] = 1;
		int turn = 1;
		int first = (int) Math.round(Math.random());
		boolean destroy;
		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
			System.out.println("Take damage from the Black Vices");
		}
		System.out.println("type pass after each turn you take; type win when your deck would have won.");

		System.out.println("Snake's board:");
		if(snake[1] == 1){
			System.out.println("Black Vice");
		}
		if(snake[0] == 1){
			System.out.println("Black Vice");
		}		

		String cont = null;

		if(snake[0] == 0 && snake[1] == 0){
		}else{
			System.out.println("Any destroy effects?");
			destroy = IO.readBoolean();
			if(destroy){
				if(snake[0] == 0){
					snake[1] = 0;
				}
			}else{
				snake[0] = 0;
			}
		}
		System.out.println("Type pass if Snake is still alive after combat.");
		do{
			System.out.println("It is turn "+turn);
			cont = IO.readString();
			turn++;
			System.out.println("Take damage from black vice");
		}while(cont.equals("pass"));
		System.out.println("Did you win?");
		destroy = IO.readBoolean();
		if(destroy){
			snake[0] = 1;
		}else{
			snake[0] = 0;
		}
		snake[1] = turn;
		return snake;
	}
	public static int[] Rabbit(){
		int[] rabbit = new int [2];
		rabbit[0] = 1;
		rabbit[1] = 1;
		int turn = 1;
		int rabbits = 0;
		boolean destroy;
		int kill = 0;
		int first = (int) Math.round(Math.random());
		String cont;
		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
			System.out.println("You are attacked by as many creatures as to leave enough blockers up");
		}
		do{
			rabbits++;
			System.out.println("The rabbit has "+rabbits+" creatures");
			System.out.println("Do you have any destroy effects?");
			destroy = IO.readBoolean();
			if(destroy){
				System.out.println("How many wabbits are you hunting? Ahhahahahahah....");
				kill = IO.readInt();
				rabbits = rabbits - kill;
			}
			System.out.println("type pass if the game is not over yet");
			cont = IO.readString();
			turn++;
			System.out.println("You are attacked by as many creatures as to leave enough blockers up");
		}while(cont.equals("pass"));
		System.out.println("Did you win?");
		destroy = IO.readBoolean();
		if(destroy){
			rabbit[0] = 1;
		}else{
			rabbit[0] = 0;
		}   
		rabbit[1] = turn;
		return rabbit;
	}
	public static int[] Dog(){
		int[] dog = new int[2];
		String[] effects = {"Counter","Will-O'-The-Wisp","Lightning Bolt","Grizzly Bear","CoP: Whatever you're playing"};
		ArrayList<String> board = new ArrayList<String>();
		int first = (int) Math.round(Math.random());
		boolean destroy;
		String cont;
		int turn = 1;
		int effect = 0;

		int choice = (int)(Math.random()*4);

		if(first == 0){
			System.out.println("You are on the play.");
		}else{
			System.out.println("You are on the draw.");
			System.out.println("Dog plays "+effects[choice]);
			if(choice != 0 && choice != 2){
				board.add(effects[choice]);
			}
		}
		do{
			if(board.size() != 0){
				System.out.println("do you have any destroy effects?");
				destroy = IO.readBoolean();
				if(destroy){
					System.out.println("Choose target:");
					for(int i = 0; i < board.size(); i++){
						System.out.print((i)+": "+board.get(i)+", ");
					}
					do{
						effect = IO.readInt();
					}while(effect < 0 || effect > board.size());
					board.remove(effect);
				}
			}

			System.out.println("Type pass if you have not won/lost yet");
			cont = IO.readString();
			turn++;
			if(cont.equals("pass")){
				choice = (int) (Math.random()*4);
				System.out.println("Dog plays "+effects[choice]);
				if(choice != 0 && choice != 2){
					board.add(effects[choice]);
				}
			}
		}while(cont.equals("pass"));
		System.out.println("Did you win?");
		destroy = IO.readBoolean();
		if(destroy){
			dog[0] = 1;
		}else{
			dog[0] = 0;
		}
		dog[1] = turn;

		return dog;
	}
}
