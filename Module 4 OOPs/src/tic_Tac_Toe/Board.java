package tic_Tac_Toe;

import java.util.Scanner;

public class Board {

	private  char p1Symbol;
	private  char p2Symbol;
	private char  board[][];
	private  int boardSize=3;
	private  int count;// count maintain cell that filled
	
	
	private static final char EMPTY = ' ';
	
	
	
	public static final int PLAYER1_WIN=1;
	public static final int PLAYER2_WIN=2;
	public static final int DRAW=3;
	public static final int INCOMPLETE=4;
	public static final int INVALID_MOVE=5;
	
	
	public Board(char p1Symbol ,  char p2Symbol) {
		board= new char [boardSize][boardSize];
		
		for (int i=0;i<boardSize;i++)
		{
			for (int j=0;j<boardSize;j++)
				board[i][j] = EMPTY;
		}
		
		this.p1Symbol=p1Symbol;
		this.p2Symbol=p2Symbol;
	}
	public int add(int a, int b, char symbol) {
		
		/*
		 * 1= p1 win
		 * 2= p2 win
		 * 3= draw
		 * 4= invalid index enter valid
		 * 5 = game is incomplete , game  will have to  move to win anyone
		 */
		if( a<0 || a>=boardSize || b<0 ||  b>= boardSize || board[a][b] !=EMPTY) {
		
		return  INVALID_MOVE;
		
		}
		board[a][b] = symbol;
		count++;
			
		// check if someone win or not
		
		//row
		if(board[a][0] == board[a][1] && board[a][0] == board[a][2]) // entire row m, check in currently added cell row ma
			return symbol==p1Symbol ? PLAYER1_WIN : PLAYER2_WIN;
		
		// column
		if(board[0][b] == board[1][b] && board[0][b] == board[2][b]) // entire column ,check in currently added cell column ma
			return symbol==p1Symbol ? PLAYER1_WIN : PLAYER2_WIN;
		
		// diagonal
		if(  board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) // entire row m
			return symbol==p1Symbol ? PLAYER1_WIN : PLAYER2_WIN;
		
		if(  board[0][0] != EMPTY &&  board[0][2] == board[1][1] && board[0][2] == board[2][0]) 
			// board[0][0] != EMPTY because in some case all diagonal will be empty and are equal. so to takel that case,situation we write this condition
			return symbol==p1Symbol ? PLAYER1_WIN : PLAYER2_WIN;
		
		
		// no win, possible there is draw
		
		if(count == boardSize * boardSize)
			return DRAW;
		
		
		
		// otherwise
		return INCOMPLETE;
		
			
		
	}
	
	public void print() {
		System.out.println("----------------");
		for(int i=0; i< 3; i++)
			{
				
				for(int j=0; j< 3; j++)
				{
					
			System.out.print("| "+board[i][j]+" |"); // not find have space in it cell
						
				}
				System.out.println();
		}
		System.out.println("----------------");
		
	}
	
//	private int print() {
//		int p1=0;
//		int p2=0;
//		for(int i=0; i< 3; i++)
//		{
//			System.out.print("|| ");
//			for(int j=0; j< 3; j++)
//			{
//				if(board[i][j] == 'X')
//					p1++;
//				else if(board[i][j] == 'O')
//					p2++;
//				if(board[i][j]!=EMPTY)
//			System.out.print( board[i][j]);
//				else
//		System.out.print(" || ");
//					
//			}
//			System.out.println(" ||");
//	}
//		if(p1==3) {
////			System.out.println("Player one win");
//			return PLAYER1_WIN;}
//		
//			else if(p2==3){
//				//System.out.println("Player one win");
//				return PLAYER2_WIN ;}
//			else if(count==9)
//			{
//				System.out.println("draw");
//				return DRAW;
//			}
//			
//		System.out.println();
//	      return INCOMPLETE;
//}
//	
	
	
}
