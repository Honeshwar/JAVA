package tic_Tac_Toe;

import java.util.Scanner;





public class TicTacToe_Manager {
  private static int whichPlayer;
  
private Player player1,player2;
  private Board board;
	
	public static void main(String []arg) {
		
		TicTacToe_Manager t = new TicTacToe_Manager();
		t.startGame();
		
	}
	
	public void startGame()
	{
		
		// take player input
		
		Scanner s = new Scanner(System.in);
		
		/* 
		 * 1. take player input,
		 * 2. create board,
		 * 3. play the game
		 */
		
		 
	player1 =	playerInput(++whichPlayer);
	player2 =	playerInput(++whichPlayer);
	while(player1.getSymbol() == player2.getSymbol() ) { // || player1.getName().equals(player2.getName())
		System.out.println(" you choosen symbol is already taken:"
				+ "\n"+"___enter new other symbol_____ ");
		player2.setSymbol(s.next().charAt(0));
		
	}
	
	
	
	
	// create board
	
	board = new Board(player1.getSymbol(),player2.getSymbol());
	
	//play the game
	
	
	//  let's play game
          boolean player1Turn=true;
	         int status = Board.INCOMPLETE;
          while(status==Board.INCOMPLETE || status==board.INVALID_MOVE) {// when win or draw happpen  exit loop
			if(player1Turn) {
			
//			System.out.println(player1.getName()+" Enter your symbol Player 1:");
				System.out.println("Enter your symbol Player 1:"+player1.getName()+ " At any cell");
//              " \n ____ Enter row index and column index ___");

				System.out.println(" ____ Enter row index ____");
			   int a=s.nextInt();
			   System.out.println(" ____ Enter column index ____");
			   int b=s.nextInt();

		       status = board.add(a,b,player1.getSymbol());
		    
		    
		    if(status == Board.INVALID_MOVE) {
		    	System.out.println("You enter invalid coordinate - !! try again !!");
		    	continue;
		    }
//		    player1Turn= false;
		    
		  //  board.print();
//		     if(status==5)
//		    	 player1Turn=false;
//		     if(status==1 || status==2 || status==3)
//		    	 break;
//		     
				
//				while(status == 4) {
//					System.out.println("Enter valid dimension " );
//					  int a2=s.nextInt();
//					    int b2=s.nextInt();
//					     int status2 = board.add(a2,b2,player1.getSymbol());
//					     if(status2==5)
//					    	 player1Turn=false;
//					     if(status2==1 || status2==2 || status2==3)
//					    	 break;
//				}
		}
			else
			{
//				System.out.println(player1.getName()+" Enter your symbol player 2 :");
//				System.out.println("enter row dimension");
				System.out.println("Enter your symbol Player 2:"+player2.getName()+ " At any cell");
//                           " \n ____ Enter row index and column index ___");

				System.out.println(" ____ Enter row index ____");
			    int a=s.nextInt();
			    System.out.println(" ____ Enter column index ____");
			    int b=s.nextInt();
			    status = board.add(a,b,player2.getSymbol());
			    
			    if(status==Board.INVALID_MOVE) {
			    	System.out.println("You enter invalid coordinate - !! try again !!");
		    	continue;
			    }
//			    player1Turn= true;
			}
			
			
			player1Turn = ! player1Turn;
			// if T that False hogayaga
			// if F toh True ho gayaga
			board.print();
		}
          
          if(status == Board.PLAYER1_WIN)
        	  System.out.println("Player 1  - "+player1.getName()+"'s"+ " with symbol '"+player1.getSymbol()+"' wins ");
          else if(status == Board.PLAYER2_WIN)
        	  System.out.println("Player 2  - "+player2.getName() +"'s"+ " with symbol '"+player2.getSymbol()+"' wins ");
		
          
          else {
        	  System.out.println("Draw (~  ~ )"
        	  		+ "\n    (@ @) "
        			  + "\n      -   "
        			    + "\n     ^          "            
        			  );
          }
	}
	
	
	public  Player playerInput(int whichPlayer) {
		
		
//		 Player player = new Player("", ' ')	;
		 
		 
	       Scanner s = new Scanner(System.in);
//			while(player.getSymbol() != ' ') {
			System.out.println("Enter your name : player"+ whichPlayer);
			String name=s.next();
			System.out.println(" choose Symbol  X or O : "+ name);
			char symbol=s.next().charAt(0);
			
			 Player player = new Player( name , symbol ) ;
//	      player.setName(name);
//	      player.setSymbol(symbol);
//	      if(player.getSymbol()==' ')
//	    	  System.out.println("Not a valid Symbol");
//			}
	   
	      return player;
	}
	
	
	}

	

















