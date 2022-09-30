package othello;

import java.util.Scanner;

// othello ek game hai
// in  need payer in it and board to play
public class Othello {// Othello__Manager // action manage
// private  provide security that data does not go outside , so some steal that; 
	private Player p1;
	private Player p2;
	private Board board;
	private int whichOnePlayer;
	
	// ek he board and 2 player game create kar raha hu
	
	public static void main(String []args) {
		
		
		Othello o = new Othello();
		o.startGame();
	}

	private void startGame() {
		Scanner s = new Scanner (System.in);
		// input
		p1= takeInput(++whichOnePlayer);
		while(p1.disc == 0)// by default null.
		{
			System.out.println(" __Choose valid  disk among black or white__ ");
			p1.setColour(s.next());
		}
			
		p2= takeInput(++whichOnePlayer);
		
		while(p2.getColour() == p1.getColour()) {
			System.out.println("The "+p1.getColour()+" colour disc is already taken");
			if(p2.getColour() == "black")
				System.out.println(("___choose white disc instead of black__"));
			else
			System.out.println(("___choose black disc instead of white__"));
			p2.setColour(s.next());
		}
		
		// board
		board = new Board(p1.disc, p2.disc); // which player have whick disc

		// play
		System.out.println("___Let's play game___");
		
		boolean player1turn = true;
		int count=0;
		boolean status=player1turn;
		while(status=false) {
			if(player1turn) {
				System.out.println("Payer1:"+p1.getName() +"__Your turn__");
		System.out.println("Enter  Your choosen cell row index");
		int rowIndex = s.nextInt();
		System.out.println("Enter Your choosen cell column index");
		int columnIndex = s.nextInt();
		
		// status of move
		 status = board.moveInBoard(rowIndex,columnIndex,p1.disc);
	
			}else {
				System.out.println("Payer2:"+p2.getName() +"__Your turn__");

				System.out.println("Enter  Your choosen cell row index");
				int rowIndex = s.nextInt();
				System.out.println("Enter Your choosen cell column index");
				int columnIndex = s.nextInt();
				
				// status of move
				//  important \\
				 status = board.moveInBoard(rowIndex,columnIndex,p2.disc);
			
				
				
				
			}
			player1turn = !player1turn;
			count++;
			}
	}

	private Player takeInput(int i) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter Your Name __Player"+i+"__");	//name.concat("jo").concat(name);
		String name = s.nextLine();// " bahnu thakur "
		System.out.println(" Choose one disk among black or white ");
		String colour = s.next();
		
		Player player = new Player(name,colour);
		
		return player;
	}
}

























